package com.hospital.model;

import java.math.BigDecimal;
import java.util.Date;

public class PatientFeeDetail {
    private Integer id;

    private Integer registrationInfoNo;

    private String patientName;

    private String medicalRecord;

    private Integer checkFeeNo;

    private BigDecimal checkFeePrice;

    private Integer herbalPrescriptionFeeNo;

    private BigDecimal herbalPrescriptionFeePrice;

    private Integer medicinePrescriptionFeeNo;

    private BigDecimal medicinePrescriptionFeePrice;

    private Integer disposPrescriptionFeeNo;

    private BigDecimal disposPrescriptionFeePrice;

    private BigDecimal sumPrice;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistrationInfoNo() {
        return registrationInfoNo;
    }

    public void setRegistrationInfoNo(Integer registrationInfoNo) {
        this.registrationInfoNo = registrationInfoNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public Integer getCheckFeeNo() {
        return checkFeeNo;
    }

    public void setCheckFeeNo(Integer checkFeeNo) {
        this.checkFeeNo = checkFeeNo;
    }

    public BigDecimal getCheckFeePrice() {
        return checkFeePrice;
    }

    public void setCheckFeePrice(BigDecimal checkFeePrice) {
        this.checkFeePrice = checkFeePrice;
    }

    public Integer getHerbalPrescriptionFeeNo() {
        return herbalPrescriptionFeeNo;
    }

    public void setHerbalPrescriptionFeeNo(Integer herbalPrescriptionFeeNo) {
        this.herbalPrescriptionFeeNo = herbalPrescriptionFeeNo;
    }

    public BigDecimal getHerbalPrescriptionFeePrice() {
        return herbalPrescriptionFeePrice;
    }

    public void setHerbalPrescriptionFeePrice(BigDecimal herbalPrescriptionFeePrice) {
        this.herbalPrescriptionFeePrice = herbalPrescriptionFeePrice;
    }

    public Integer getMedicinePrescriptionFeeNo() {
        return medicinePrescriptionFeeNo;
    }

    public void setMedicinePrescriptionFeeNo(Integer medicinePrescriptionFeeNo) {
        this.medicinePrescriptionFeeNo = medicinePrescriptionFeeNo;
    }

    public BigDecimal getMedicinePrescriptionFeePrice() {
        return medicinePrescriptionFeePrice;
    }

    public void setMedicinePrescriptionFeePrice(BigDecimal medicinePrescriptionFeePrice) {
        this.medicinePrescriptionFeePrice = medicinePrescriptionFeePrice;
    }

    public Integer getDisposPrescriptionFeeNo() {
        return disposPrescriptionFeeNo;
    }

    public void setDisposPrescriptionFeeNo(Integer disposPrescriptionFeeNo) {
        this.disposPrescriptionFeeNo = disposPrescriptionFeeNo;
    }

    public BigDecimal getDisposPrescriptionFeePrice() {
        return disposPrescriptionFeePrice;
    }

    public void setDisposPrescriptionFeePrice(BigDecimal disposPrescriptionFeePrice) {
        this.disposPrescriptionFeePrice = disposPrescriptionFeePrice;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}