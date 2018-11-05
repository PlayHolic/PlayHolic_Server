package com.plic.plicapi.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plic.plicapi.controller.model.response.PerformanceDetailResponse;
import com.plic.plicapi.controller.model.response.PerformanceResponse;
import com.plic.plicapi.domain.Performance;
import com.plic.plicapi.repository.PerformanceRepository;
import com.plic.plicapi.service.custom.PerformanceService;
import org.json.JSONException;
import org.json.XML;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
@Component
public class PerformanceServiceImpl implements PerformanceService {

    @Autowired
    private PerformanceRepository performanceRepository;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    private String baseUrl = "http://www.kopis.or.kr/openApi/restful/pblprfr";

    private String serviceKey = "87045056ae8e499996424bc912604cd0";

    private String startDate = "20020101";

    private String endDate;




    @Override
    public List<PerformanceResponse> readPerformances(String keyword) {
        List<Performance> performances = this.performanceRepository.findByPrfnmContaining(keyword);
        List<PerformanceResponse> performanceResponses = new ArrayList<>();

        performances.forEach(performance -> {
            performanceResponses.add(PerformanceResponse.of(performance));
        });

        return performanceResponses;
    }

    @Override
    @Scheduled(cron = "0 0 0 * * *")
    public void createPerformances() {
        this.performanceRepository.deleteAll();

        RestTemplate restTemplate = new RestTemplate();

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR) + 2;
        calendar.set(year, Calendar.MONTH, Calendar.DAY_OF_MONTH);
        this.endDate = dateFormat.format(calendar);

        String requestUrl = this.baseUrl + "?service=" + this.serviceKey + "&stdate=" + this.startDate + "&eddate=" + this.endDate + "&cpage=1&rows=20000";

        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        String result = restTemplate.getForObject(requestUrl , String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JSONObject jsonResult = (JSONObject) XML.toJSONObject(result).get("dbs");
            JSONArray jsonArray = (JSONArray) jsonResult.get("db");
            for(int i=0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                System.out.println(jsonObject);
                try {
                    Performance performance = objectMapper.readValue(jsonObject.toString(), Performance.class);
                    this.performanceRepository.save(performance);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PerformanceDetailResponse readPerformanceDetail(String mt20id) {

        RestTemplate restTemplate = new RestTemplate();

        String requestUrl = this.baseUrl + "/" + mt20id + "?service=" + this.serviceKey;

        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        String result = restTemplate.getForObject(requestUrl , String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        PerformanceDetailResponse performanceDetailResponse = new PerformanceDetailResponse();

        try {
            JSONObject jsonResult = (JSONObject) XML.toJSONObject(result).get("dbs");
            JSONObject jsonObject = (JSONObject) jsonResult.get("db");
            try {
                performanceDetailResponse = objectMapper.readValue(jsonObject.toString(), PerformanceDetailResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return performanceDetailResponse;
    }


}
