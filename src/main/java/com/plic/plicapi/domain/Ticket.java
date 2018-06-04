package com.plic.plicapi.domain;

import lombok.Builder;
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
    Long userId;

    @Column(name = "PERFORMENCE_ID")
    String prfid;

    @Column(name = "FACILITY_ID")
    String fcltynm;

    @Column(name = "PERFORMENCE_NAME")
    String prfnm;

    @Column(name = "SCORE")
    String score;

    @Column(name = "COMMENT")
    String comment;
}
