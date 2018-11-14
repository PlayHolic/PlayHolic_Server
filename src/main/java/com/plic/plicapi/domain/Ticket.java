package com.plic.plicapi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "TICKET")
public class Ticket extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PERFORMANCE_ID")
    private String mt20id;

    @Column(name = "FACILITY_NAME")
    private String fcltynm;

    @Column(name = "PERFORMANCE_NAME")
    private String prfnm;

    @Column(name = "PERFORMANCE_RUNTIME")
    private String prfruntime;

    @Column(name = "PERFORMANCE_AGE")
    private String prfage;

    @Column(name = "PERFORMANCE_CAST")
    private String prfcast;

    @Column(name = "PERFORMANCE_CREW")
    private String prfcrew;

    @Column(name = "SCORE")
    private String score;

    @Column(name = "COMMENT")
    private String comment;
}
