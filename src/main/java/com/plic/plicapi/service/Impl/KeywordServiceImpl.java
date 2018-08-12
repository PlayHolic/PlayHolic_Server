package com.plic.plicapi.service.Impl;

import com.plic.plicapi.controller.model.request.KeywordRequest;
import com.plic.plicapi.controller.model.response.KeywordResponse;
import com.plic.plicapi.controller.model.response.TicketResponse;
import com.plic.plicapi.domain.Keyword;
import com.plic.plicapi.repository.KeywordRepository;
import com.plic.plicapi.service.custom.KeywordService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class KeywordServiceImpl implements KeywordService {

    @Autowired
    private KeywordRepository keywordRepository;

    @Override
    public void createKeyword(KeywordRequest keywordRequest) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Keyword keyword = new Keyword();
        keyword.setUserId(keywordRequest.getUserId());
        keyword.setWord(keywordRequest.getWord());
        keyword.setNowDate(simpleDateFormat.format(date));

        List<Keyword> keywords = this.keywordRepository.findByuserId(keywordRequest.getUserId());

        if(keywords.size() == 10) {
           Keyword deleteKeyword = keywords.get(0);
           this.keywordRepository.delete(deleteKeyword);
        }

        this.keywordRepository.save(keyword);
    }

    //최근 검색어
    public List<KeywordResponse> readRecentKeywords(Long userId) {

        //select
        List<Keyword> keywords = this.keywordRepository.findByuserId(userId);

        List<KeywordResponse> keywordResponses = new ArrayList<>();

        keywords.forEach(keyword -> {
                    keywordResponses.add(KeywordResponse.of(keyword));
                });

        return keywordResponses;
    }

    //인기 검색어
    public List<KeywordResponse> readPopularKeywords(Long userId){
        List<Keyword> keywords = this.keywordRepository.findByuserId(userId);
        List<KeywordResponse> keywordResponses = new ArrayList<>();

        keywords.forEach(keyword -> {
            keywordResponses.add(KeywordResponse.of(keyword));
        });

        return keywordResponses;
    }
}
