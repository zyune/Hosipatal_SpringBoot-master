package com.hospital.model;

import java.util.Date;

public class DailySettlement {
    private Integer id;

    private Double fee;

    private Integer registrarNo;

    private String registrarName;

    private Date startTime;

    private Date endTime;

    private String bank1;

    private String bank2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Integer getRegistrarNo() {
        return registrarNo;
    }

    public void setRegistrarNo(Integer registrarNo) {
        this.registrarNo = registrarNo;
    }

    public String getRegistrarName() {
        return registrarName;
    }

    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName == null ? null : registrarName.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getBank1() {
        return bank1;
    }

    public void setBank1(String bank1) {
        this.bank1 = bank1 == null ? null : bank1.trim();
    }

    public String getBank2() {
        return bank2;
    }

    public void setBank2(String bank2) {
        this.bank2 = bank2 == null ? null : bank2.trim();
    }
}