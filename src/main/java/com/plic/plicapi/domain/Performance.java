package com.plic.plicapi.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "PERFORMANCE")
public class Performance extends BaseEntity {

    @Id
    @GeneratedValue
    Long id;

    @Column(name="PERFORMANCE_ID")
    String mt20id; //공연 id

    @Column(name = "PERFORMANCE_NAME")
    String prfnm;	//공연명	우리연애할까

    @Column(name = "PERFORMANCE_START_DATE")
    String prfpdfrom;	//공연시작일	2016.05.12

    @Column(name = "PERFORMANCE_END_DATE")
    String prfpdto;	//공연종료일	2016.07.31

    @Column(name = "FACILITY_NAME")
    String fcltynm;	//공연시설명(공연장명)	피가로아트홀(구 훈아트홀)

    @Column(name = "POSTER")
    String poster;  //포스터이미지경로	http://www.kopis.or.kr/upload/pfmPoster/PF_PF132236_160704_142630.gif

    @Column(name = "GENRE")
    String genrenm;	//공연 장르명	연극

    @Column(name = "PERFORMANCE_STATE")
    String prfstate;	//공연상태	공연중

    @Column(name =  "OPEN_RUN")
    String openrun;    //오픈런, 종료 일자를 정하지 않고 계속 공연 Y
}
