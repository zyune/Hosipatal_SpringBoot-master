package com.hospital.model;

import java.util.Date;

public class RegistrationFee {
    private Integer id;

    private Integer registrationInfoNo;

    private Integer departmentNo;

    private String medicalRecord;

    private String patientName;

    private Integer registrationLevelNo;

    private Integer registrarNo;

    private String registrarName;

    private Double price;

    private Date createTime;

    private String state;

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

    public Integer getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Integer departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Integer getRegistrationLevelNo() {
        return registrationLevelNo;
    }

    public void setRegistrationLevelNo(Integer registrationLevelNo) {
        this.registrationLevelNo = registrationLevelNo;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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