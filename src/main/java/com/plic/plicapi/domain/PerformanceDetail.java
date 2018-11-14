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
@Table(name = "PERFORMANCE_DETAIL")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PerformanceDetail {

    @Id
    @GeneratedValue
    private Long id;

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

    @OneToOne(fetch = FetchType.LAZY)
    private Performance performance;
}
