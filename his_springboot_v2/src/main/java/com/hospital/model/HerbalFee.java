package com.hospital.model;

import java.util.Date;

public class HerbalFee {
    private Integer id;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private String patientName;

    private Integer herbalApplicationNo;

    private Integer departmentNo;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private Integer registrarNo;

    private String registrarName;

    private Integer drugDoctorNo;

    private String drugDoctorName;

    private Double price;

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

    public Integer getHerbalApplicationNo() {
        return herbalApplicationNo;
    }

    public void setHerbalApplicationNo(Integer herbalApplicationNo) {
        this.herbalApplicationNo = herbalApplicationNo;
    }

    public Integer getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Integer departmentNo) {
        this.departmentNo = departmentNo;
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

    public Integer getDrugDoctorNo() {
        return drugDoctorNo;
    }

    public void setDrugDoctorNo(Integer drugDoctorNo) {
        this.drugDoctorNo = drugDoctorNo;
    }

    public String getDrugDoctorName() {
        return drugDoctorName;
    }

    public void setDrugDoctorName(String drugDoctorName) {
        this.drugDoctorName = drugDoctorName == null ? null : drugDoctorName.trim();
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
}