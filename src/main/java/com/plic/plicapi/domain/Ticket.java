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
    Long Id;

    @Column(name = "USER_ID")
    String userId;

    @Column(name = "PERFORMENCE_ID")
    String mt20id;

    @Column(name = "FACILITY_NAME")
    String fcltynm;

    @Column(name = "PERFORMENCE_NAME")
    String prfnm;

    @Column(name = "PERFORMENCE_RUNTIME")
    String prfruntime;

    @Column(name = "PERFORMENCE_AGE")
    String prfage;

    @Column(name = "PERFORMENCE_CAST")
    String prfcast;

    @Column(name = "PERFORMENCE_CREW")
    String prfcrew;

    @Column(name = "SCORE")
    String score;

    @Column(name = "COMMENT")
    String comment;
}
