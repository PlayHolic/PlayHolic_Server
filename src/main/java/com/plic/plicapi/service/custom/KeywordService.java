package com.plic.plicapi.service.custom;

import com.plic.plicapi.controller.model.request.KeywordRequest;
import com.plic.plicapi.controller.model.response.KeywordResponse;

import java.util.List;


public interface KeywordService {
    void createKeyword(KeywordRequest keywordRequest);

    List<KeywordResponse> readRecentKeywords(String userId);

    List<KeywordResponse> readPopularKeywords(String userId);
}
