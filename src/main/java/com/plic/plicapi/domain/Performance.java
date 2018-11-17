package com.plic.plicapi.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "PERFORMANCE")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL) // TODO: or mapper.setSerializationInclusion(Include.NON_NULL);
public class Performance extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("mt20id")
    @Column(name = "PERFORMANCE_ID", unique = true)
    private String performanceId; // 공연 id

    @JsonProperty("prfnm")
    @Column(name = "PERFORMANCE_NAME")
    private String performanceName;    // 공연명	우리연애할까

    @JsonProperty("prfpdfrom")
    @Column(name = "PERFORMANCE_START_DATE")
    private String startDate;    // 공연시작일	2016.05.12

    @JsonProperty("prfpdto")
    @Column(name = "PERFORMANCE_END_DATE")
    private String endDate;    // 공연종료일	2016.07.31

    @JsonProperty("fcltynm")
    @Column(name = "FACILITY_NAME")
    private String facilityName;    // 공연시설명(공연장명)	피가로아트홀(구 훈아트홀)

    @JsonProperty("poster")
    @Column(name = "POSTER")
    private String poster;  //포스터이미지경로	http://www.kopis.or.kr/upload/pfmPoster/PF_PF132236_160704_142630.gif

    @JsonProperty("genrenm")
    @Column(name = "GENRE")
    private String genre;    //공연 장르명	연극

    @JsonProperty("prfstate")
    @Column(name = "PERFORMANCE_STATE")
    private String state;    //공연상태	공연중

    @JsonProperty("prfcast")
    @Column(name = "CASTS")
    private String casts; // 출연진 김세연,신성진,정재연,전다정,장보경,최민기 (+detail)

    @JsonProperty("prfcrew")
    @Column(name = "CREW")
    private String crew; // 제작진 천정민 (+detail)

    @JsonProperty("prfruntime")
    @Column(name = "RUNNING_TIME")
    private String runningTime; // 러닝 타임 (+detail)

    @JsonProperty("prfage")
    @Column(name = "RATING")
    private String rating; // 관람 연령 만 12세 이상 (+detail)

    @JsonProperty("entrpsnm")
    @Column(name = "ENTERPRISE_NAME")
    private String enterpriseName; // 제작사 극단 피에로(문화제작소) (+detail)

}
