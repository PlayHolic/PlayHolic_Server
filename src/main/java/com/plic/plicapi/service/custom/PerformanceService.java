package com.plic.plicapi.service.custom;

import com.plic.plicapi.controller.model.response.PerformanceDetailResponse;
import com.plic.plicapi.controller.model.response.PerformanceResponse;
import com.plic.plicapi.domain.Performance;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PerformanceService {
    List<PerformanceResponse> readPerformances(String keyword);

    void createPerformances();
    PerformanceDetailResponse readPerformanceDetail(String mt20id);

}
