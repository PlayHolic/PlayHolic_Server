package com.plic.plicapi.controller;

import com.plic.plicapi.controller.model.request.KeywordRequest;
import com.plic.plicapi.controller.model.response.KeywordResponse;
import com.plic.plicapi.service.custom.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/keywords")
public class KeywordController {

    @Autowired
    private KeywordService keywordService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createKeyword (@RequestBody KeywordRequest keywordRequest){
        this.keywordService.createKeyword(keywordRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value="/recent/{userId}")
    public ResponseEntity<List<KeywordResponse>> readRecentKeywords(@PathVariable String userId) {
        List<KeywordResponse> keywordResponses = this.keywordService.readRecentKeywords(userId);
        return new ResponseEntity<>(keywordResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value="/popular/{userId}")
    public ResponseEntity<List<KeywordResponse>> readPopularKeywords(@PathVariable String userId) {
        List<KeywordResponse> keywordResponses = this.keywordService.readPopularKeywords(userId);
        return new ResponseEntity<>(keywordResponses, HttpStatus.OK);
    }
}
