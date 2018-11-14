package com.plic.plicapi.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "PERFORMANCE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Performance extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("mt20id")
    @Column(name="PERFORMANCE_ID")
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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "PERFORMANCE")
    @JoinColumn(name = "PERFORMANCE_ID")
    private PerformanceDetail detail;
}
