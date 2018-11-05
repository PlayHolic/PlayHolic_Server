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
    Long id;

    @Column(name = "USER_ID")
    String userId;

    @Column(name = "PERFORMANCE_ID")
    String mt20id;

    @Column(name = "FACILITY_NAME")
    String fcltynm;

    @Column(name = "PERFORMANCE_NAME")
    String prfnm;

    @Column(name = "PERFORMANCE_RUNTIME")
    String prfruntime;

    @Column(name = "PERFORMANCE_AGE")
    String prfage;

    @Column(name = "PERFORMANCE_CAST")
    String prfcast;

    @Column(name = "PERFORMANCE_CREW")
    String prfcrew;

    @Column(name = "SCORE")
    String score;

    @Column(name = "COMMENT")
    String comment;
}
