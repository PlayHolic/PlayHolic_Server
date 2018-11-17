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
    private Long id;

    // TODO user 테이블을 만든다면 참조 무결성 필요
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "WORD")
    private String word;

    @Column(name = "NOW_DATE")
    private String nowDate;
}
