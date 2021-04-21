package com.sh.techbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {

    @Id
    @GeneratedValue
    private Integer idx;

    @Column
    private String subject;

    @Column
    private String term;

    @Column
    private String loc;

    @Column
    private int monthlv;

    @Column
    private String skill;

    @Column
    private String category;

    @Column
    private int consultcnt;

    @Column
    String etc;

    public Board(Integer idx, String subject, String term, String loc, int monthlv, String skill, String category, int consultcnt, String etc) {
        this.idx = idx;
        this.subject = subject;
        this.term = term;
        this.loc = loc;
        this.monthlv = monthlv;
        this.skill = skill;
        this.category = category;
        this.consultcnt = consultcnt;
        this.etc = etc;
    }

    public Board() {

    }
}
