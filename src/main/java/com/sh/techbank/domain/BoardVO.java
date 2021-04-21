package com.sh.techbank.domain;

import com.sh.techbank.entity.Board;

public class BoardVO {

    private String subject;
    private String term;
    private String loc;
    private Integer monthlv;
    private String skill;
    private String category;
    private Integer consultcnt;
    private String etc;

    @Override
    public String toString() {
        return "BoardVO{" +
                "subject='" + subject + '\'' +
                ", term='" + term + '\'' +
                ", loc='" + loc + '\'' +
                ", monthlv=" + monthlv +
                ", skill='" + skill + '\'' +
                ", category='" + category + '\'' +
                ", consultcnt=" + consultcnt +
                ", etc='" + etc + '\'' +
                '}';
    }



    public Board toEntity() {
        return new Board(null, subject, term, loc, monthlv, skill, category, consultcnt, etc);
    }
}
