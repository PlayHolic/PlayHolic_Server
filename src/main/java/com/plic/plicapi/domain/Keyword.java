package com.plic.plicapi.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "KEYWORD")
public class Keyword extends BaseEntity {

    @Id
    @GeneratedValue
    Long id;

    @Column(name = "USER_ID")
    String userId;

    @Column(name = "WORD")
    String word;

    @Column(name = "NOW_DATE")
    String nowDate;
}
