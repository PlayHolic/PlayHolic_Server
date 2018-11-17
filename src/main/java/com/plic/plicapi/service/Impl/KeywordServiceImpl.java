package com.plic.plicapi.service.Impl;

import com.plic.plicapi.controller.model.request.KeywordRequest;
import com.plic.plicapi.controller.model.response.KeywordResponse;
import com.plic.plicapi.domain.Keyword;
import com.plic.plicapi.repository.KeywordRepository;
import com.plic.plicapi.service.custom.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        // List<Keyword> keywords = this.keywordRepository.findByUserId(keywordRequest.getUserId());

/*        if(keywords.size() == 10) {
           Keyword deleteKeyword = keywords.get(0);
           this.keywordRepository.delete(deleteKeyword);
        }*/ // 인기 검색어를 위해서는 검색어를 보존해야함

        this.keywordRepository.save(keyword);
    }

    //최근 검색어
    public List<KeywordResponse> readRecentKeywords(String userId) {

        List<Keyword> keywords = this.keywordRepository.findByUserId(userId);
        List<KeywordResponse> keywordResponses = new ArrayList<>();
        keywords.forEach(keyword -> keywordResponses.add(KeywordResponse.of(keyword)));
        return keywordResponses;
    }

    //인기 검색어
    public List<KeywordResponse> readPopularKeywords(String userId) {
        List<Keyword> keywords = this.keywordRepository.findByUserId(userId);
        List<KeywordResponse> keywordResponses = new ArrayList<>();

        keywords.forEach(keyword -> keywordResponses.add(KeywordResponse.of(keyword)));

        return keywordResponses;
    }
}
