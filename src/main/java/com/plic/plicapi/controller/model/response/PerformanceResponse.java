package com.plic.plicapi.controller.model.response;


import com.plic.plicapi.domain.Performance;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PerformanceResponse {

    Long id;
    String mt20id;
    String prfnm;
    String prfpdfrom;
    String prfpdto;
    String fcltynm;
    String poster;
    String genrenm;
    String prfstate;
    String openrun;

    public static PerformanceResponse of(Performance performance) {
        return PerformanceResponse.builder()
                .id(performance.getId())
                .mt20id(performance.getMt20id())
                .prfnm(performance.getPrfnm())
                .prfpdfrom(performance.getPrfpdfrom())
                .prfpdto(performance.getPrfpdto())
                .fcltynm(performance.getFcltynm())
                .poster(performance.getPoster())
                .genrenm(performance.getGenrenm())
                .prfstate(performance.getPrfstate())
                .openrun(performance.getOpenrun())
                .build();


    }
}
