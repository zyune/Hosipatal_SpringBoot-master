package com.hospital.model;

import java.util.Date;

public class OdWorkload {
    private Integer id;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private Date startTime;

    private Date endTime;

    private Integer patientNum;

    private Double checkSumPrice;

    private Double disposeSumPrice;

    private Double inspectionSumPrice;

    private Double herbalSumPrice;

    private Double medicalSumPrice;

    private Double surgerySumPrice;

    private Double registeredSumPrice;

    private Double sumPrice;

    private Double otherSumPrice;

    private Date createTime;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOutpatientDoctorNo() {
        return outpatientDoctorNo;
    }

    public void setOutpatientDoctorNo(Integer outpatientDoctorNo) {
        this.outpatientDoctorNo = outpatientDoctorNo;
    }

    public String getOutpatientDoctorName() {
        return outpatientDoctorName;
    }

    public void setOutpatientDoctorName(String outpatientDoctorName) {
        this.outpatientDoctorName = outpatientDoctorName == null ? null : outpatientDoctorName.trim();
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

    public Double getCheckSumPrice() {
        return checkSumPrice;
    }

    public void setCheckSumPrice(Double checkSumPrice) {
        this.checkSumPrice = checkSumPrice;
    }

    public Double getDisposeSumPrice() {
        return disposeSumPrice;
    }

    public void setDisposeSumPrice(Double disposeSumPrice) {
        this.disposeSumPrice = disposeSumPrice;
    }

    public Double getInspectionSumPrice() {
        return inspectionSumPrice;
    }

    public void setInspectionSumPrice(Double inspectionSumPrice) {
        this.inspectionSumPrice = inspectionSumPrice;
    }

    public Double getHerbalSumPrice() {
        return herbalSumPrice;
    }

    public void setHerbalSumPrice(Double herbalSumPrice) {
        this.herbalSumPrice = herbalSumPrice;
    }

    public Double getMedicalSumPrice() {
        return medicalSumPrice;
    }

    public void setMedicalSumPrice(Double medicalSumPrice) {
        this.medicalSumPrice = medicalSumPrice;
    }

    public Double getSurgerySumPrice() {
        return surgerySumPrice;
    }

    public void setSurgerySumPrice(Double surgerySumPrice) {
        this.surgerySumPrice = surgerySumPrice;
    }

    public Double getRegisteredSumPrice() {
        return registeredSumPrice;
    }

    public void setRegisteredSumPrice(Double registeredSumPrice) {
        this.registeredSumPrice = registeredSumPrice;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Double getOtherSumPrice() {
        return otherSumPrice;
    }

    public void setOtherSumPrice(Double otherSumPrice) {
        this.otherSumPrice = otherSumPrice;
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