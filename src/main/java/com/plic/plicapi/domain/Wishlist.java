package com.plic.plicapi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "WISHLIST")
public class Wishlist {

    @Id
    @GeneratedValue
    Long Id;

    @Column(name = "USER_ID")
    Long userId;

    @Column(name = "FACILITY_NAME")
    String fcltynm;

    @Column(name = "PERFORMANCE_NAME")
    String prfnm;

    @Column(name = "PERFORMANCE_START_DATE")
    String prfpdfrom;

    @Column(name = "PERFORMANCE_END_DATE")
    String prfpdto;

    @Column(name = "POSTER")
    String poster;
}
