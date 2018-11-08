package com.plic.plicapi.controller.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PerformanceDetailResponse {

    String performanceId;
    String performanceName;
    String startDate;
    String endDate;
    String facilityName;
    String casts;
    String crew;
    String runningTime;
    String rating;
    String enterpriseName;
    String poster;
    String genre;
    String state;
    

/*    <mt20id>PF132236</mt20id>
    <prfnm> 우리 연애할까?</prfnm>
<prfpdfrom>2016.05.12</prfpdfrom>
<prfpdto>2016.12.31</prfpdto>

    <fcltynm> 해바라기소극장(구.훈아트홀) (

    해바라기소극장(구.훈아트홀))</fcltynm>
<prfcast>김세연,신성진,정재연,전다정,장보경,최민기</prfcast>
<prfcrew>천정민</prfcrew>
<prfruntime>1시간 30분</prfruntime>
<prfage>만 12
    세 이상</prfage>

    <entrpsnm> 극단 피에로(문화제작소)</entrpsnm>
<pcseguidance>전석 30,000원</pcseguidance>
<poster>
    http://www.kopis.or.kr/upload/pfmPoster/PF_PF132236_161107_144405.gif
</poster>
<sty> </sty>
<genrenm>연극</genrenm>
<prfstate>공연완료</prfstate>
<openrun>N</openrun>*/

}
