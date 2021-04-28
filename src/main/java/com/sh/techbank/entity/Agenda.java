package com.sh.techbank.entity;

import javax.persistence.*;


@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int agendaNumber;

    @Column
    private String agendaName;

    @Column
    private String agendaPlace;

    @Column
    private String agendaStartDate;

    @Column
    private String agendaEndDate;

    @Column
    private int agendaMinPay;

    @Column
    private int agendaMaxPay;

    @Column
    private String agendaSkill;

    @Column
    private String agendaCategory;

    @Column
    private int agendaInterviewNumber;

    @Column
    private String agendaEtc;

    public Agenda() {}

    public Agenda(int agendaNumber, String agendaName, String agendaPlace,
                  String agendaStartDate, String agendaEndDate, int agendaMinPay,
                  int agendaMaxPay, String agendaSkill, String agendaCategory,
                  int agendaInterviewNumber, String agendaEtc) {
        this.agendaNumber = agendaNumber;
        this.agendaName = agendaName;
        this.agendaPlace = agendaPlace;
        this.agendaStartDate = agendaStartDate;
        this.agendaEndDate = agendaEndDate;
        this.agendaMinPay = agendaMinPay;
        this.agendaMaxPay = agendaMaxPay;
        this.agendaSkill = agendaSkill;
        this.agendaCategory = agendaCategory;
        this.agendaInterviewNumber = agendaInterviewNumber;
        this.agendaEtc = agendaEtc;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agendaNumber=" + agendaNumber +
                ", agendaName='" + agendaName + '\'' +
                ", agendaPlace='" + agendaPlace + '\'' +
                ", agendaStartDate='" + agendaStartDate + '\'' +
                ", agendaEndDate='" + agendaEndDate + '\'' +
                ", agendaMinPay=" + agendaMinPay +
                ", agendaMaxPay=" + agendaMaxPay +
                ", agendaSkill='" + agendaSkill + '\'' +
                ", agendaCategory='" + agendaCategory + '\'' +
                ", agendaInterviewNumber=" + agendaInterviewNumber +
                ", agendaEtc='" + agendaEtc + '\'' +
                '}';
    }
}
