package com.plic.plicapi.controller.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PerformanceDetailResponse {
    String mt20id;
    String prfnm;
    String prfpdfrom;
    String prfpdto;
    String fcltynm;
    String prfcast;
    String prfcrew;
    String prfruntime;
    String prfage;
    String entrpsnm;
    String poster;
}
