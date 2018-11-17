package com.plic.plicapi.controller.model.response;


import com.plic.plicapi.domain.Performance;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PerformanceResponse {

    private Long id;
    private String performanceId;
    private String performanceName;
    private String startDate;
    private String endDate;
    private String facilityName;
    private String poster;
    private String genre;
    private String state;

    public static PerformanceResponse of(Performance performance) {
        return PerformanceResponse.builder()
                .id(performance.getId())
                .performanceId(performance.getPerformanceId())
                .performanceName(performance.getPerformanceName())
                .startDate(performance.getStartDate())
                .endDate(performance.getEndDate())
                .facilityName(performance.getFacilityName())
                .poster(performance.getPoster())
                .genre(performance.getGenre())
                .state(performance.getState())
                .build();
    }
}
