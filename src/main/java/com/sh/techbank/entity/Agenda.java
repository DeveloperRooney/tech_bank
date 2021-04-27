package com.sh.techbank.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private int MinPay;

    @Column
    private int MaxPay;

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
                  String agendaStartDate, String agendaEndDate, int minPay,
                  int maxPay, String agendaSkill, String agendaCategory,
                  int agendaInterviewNumber, String agendaEtc) {
        this.agendaNumber = agendaNumber;
        this.agendaName = agendaName;
        this.agendaPlace = agendaPlace;
        this.agendaStartDate = agendaStartDate;
        this.agendaEndDate = agendaEndDate;
        MinPay = minPay;
        MaxPay = maxPay;
        this.agendaSkill = agendaSkill;
        this.agendaCategory = agendaCategory;
        this.agendaInterviewNumber = agendaInterviewNumber;
        this.agendaEtc = agendaEtc;
    }
}
