package com.plic.plicapi.controller;


import com.plic.plicapi.controller.model.response.PerformanceDetailResponse;
import com.plic.plicapi.controller.model.response.PerformanceResponse;
import com.plic.plicapi.service.custom.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/performances")
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService;

    @RequestMapping(method = RequestMethod.GET, value = "/{keyword}")
    public ResponseEntity<List<PerformanceResponse>> readPerformances(@PathVariable String keyword) {
        List<PerformanceResponse> performanceResponses = this.performanceService.readPerformances(keyword);
        return new ResponseEntity<>(performanceResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/detail/{mt20id}")
    public ResponseEntity<PerformanceDetailResponse> readPerformanceDetail(@PathVariable String mt20id) {
        PerformanceDetailResponse performanceDetailResponse = this.performanceService.readPerformanceDetail(mt20id);
        return new ResponseEntity<>(performanceDetailResponse, HttpStatus.OK);
    }
}
