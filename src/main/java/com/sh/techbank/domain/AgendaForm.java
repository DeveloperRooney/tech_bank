package com.sh.techbank.domain;

import com.sh.techbank.entity.Agenda;

public class AgendaForm {

    AgendaForm() {}

    private int agendaNumber;
    private String agendaName;
    private String agendaPlace;
    private String agendaStartDate;
    private String agendaEndDate;
    private int MinPay;
    private int MaxPay;
    private String agendaSkill;
    private String agendaCategory;
    private int agendaInterviewNumber;
    private String agendaEtc;

    public int getAgendaNumber() {
        return agendaNumber;
    }

    public void setAgendaNumber(int agendaNumber) {
        this.agendaNumber = agendaNumber;
    }

    public String getAgendaName() {
        return agendaName;
    }

    public void setAgendaName(String agendaName) {
        this.agendaName = agendaName;
    }

    public String getAgendaPlace() {
        return agendaPlace;
    }

    public void setAgendaPlace(String agendaPlace) {
        this.agendaPlace = agendaPlace;
    }

    public String getAgendaStartDate() {
        return agendaStartDate;
    }

    public void setAgendaStartDate(String agendaStartDate) {
        this.agendaStartDate = agendaStartDate;
    }

    public String getAgendaEndDate() {
        return agendaEndDate;
    }

    public void setAgendaEndDate(String agendaEndDate) {
        this.agendaEndDate = agendaEndDate;
    }

    public int getMinPay() {
        return MinPay;
    }

    public void setMinPay(int minPay) {
        MinPay = minPay;
    }

    public int getMaxPay() {
        return MaxPay;
    }

    public void setMaxPay(int maxPay) {
        MaxPay = maxPay;
    }

    public String getAgendaSkill() {
        return agendaSkill;
    }

    public void setAgendaSkill(String agendaSkill) {
        this.agendaSkill = agendaSkill;
    }

    public String getAgendaCategory() {
        return agendaCategory;
    }

    public void setAgendaCategory(String agendaCategory) {
        this.agendaCategory = agendaCategory;
    }

    public int getAgendaInterviewNumber() {
        return agendaInterviewNumber;
    }

    public void setAgendaInterviewNumber(int agendaInterviewNumber) {
        this.agendaInterviewNumber = agendaInterviewNumber;
    }

    public String getAgendaEtc() {
        return agendaEtc;
    }

    public void setAgendaEtc(String agendaEtc) {
        this.agendaEtc = agendaEtc;
    }

    @Override
    public String toString() {
        return "AgendaForm{" +
                "agendaNumber=" + agendaNumber +
                ", agendaName='" + agendaName + '\'' +
                ", agendaPlace='" + agendaPlace + '\'' +
                ", agendaStartDate='" + agendaStartDate + '\'' +
                ", agendaEndDate='" + agendaEndDate + '\'' +
                ", MinPay=" + MinPay +
                ", MaxPay=" + MaxPay +
                ", agendaSkill='" + agendaSkill + '\'' +
                ", agendaCategory='" + agendaCategory + '\'' +
                ", agendaInterviewNumber=" + agendaInterviewNumber +
                ", agendaEtc='" + agendaEtc + '\'' +
                '}';
    }

    public Agenda toEntity() {
        return new Agenda(agendaNumber, agendaName, agendaPlace, agendaStartDate, agendaEndDate, MinPay, MaxPay, agendaSkill,
                agendaCategory, agendaInterviewNumber, agendaEtc);
    }
}
