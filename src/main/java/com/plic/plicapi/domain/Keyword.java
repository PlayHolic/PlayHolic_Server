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
public class Keyword {

    @Id
    @GeneratedValue
    Long Id;

    @Column(name = "USER_ID")
    Long userId;

    @Column(name = "WORD")
    String word;

    @Column(name = "NOW_DATE")
    String nowDate;
}
