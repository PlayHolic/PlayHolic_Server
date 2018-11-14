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
public class Wishlist extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "FACILITY_NAME")
    private String fcltynm;

    @Column(name = "PERFORMANCE_NAME")
    private String prfnm;

    @Column(name = "PERFORMANCE_START_DATE")
    private String prfpdfrom;

    @Column(name = "PERFORMANCE_END_DATE")
    private String prfpdto;

    @Column(name = "POSTER")
    private String poster;
}
