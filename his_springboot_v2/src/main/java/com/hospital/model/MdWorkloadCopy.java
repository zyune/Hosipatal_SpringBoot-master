package com.hospital.model;

import java.math.BigDecimal;
import java.util.Date;

public class MdWorkloadCopy {
    private Integer id;

    private Integer medicalDoctorNo;

    private Date startTime;

    private Date endTime;

    private Integer patientNum;

    private BigDecimal sumPrice;

    private BigDecimal checkPrice;

    private BigDecimal testPrice;

    private Date createTime;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalDoctorNo() {
        return medicalDoctorNo;
    }

    public void setMedicalDoctorNo(Integer medicalDoctorNo) {
        this.medicalDoctorNo = medicalDoctorNo;
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

    public Integer getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(Integer patientNum) {
        this.patientNum = patientNum;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public BigDecimal getCheckPrice() {
        return checkPrice;
    }

    public void setCheckPrice(BigDecimal checkPrice) {
        this.checkPrice = checkPrice;
    }

    public BigDecimal getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(BigDecimal testPrice) {
        this.testPrice = testPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}