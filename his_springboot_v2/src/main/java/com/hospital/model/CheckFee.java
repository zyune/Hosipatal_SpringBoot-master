package com.hospital.model;

import java.util.Date;

public class CheckFee {
    private Integer id;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private String patientName;

    private Integer checkApplicationNo;

    private Integer departmentNo;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private Integer registrarNo;

    private String registrarName;

    private Integer medicalDoctorNo;

    private String medicalDoctorName;

    private Double price;

    private Date createTime;

    private String checkType;

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

    public Integer getCheckApplicationNo() {
        return checkApplicationNo;
    }

    public void setCheckApplicationNo(Integer checkApplicationNo) {
        this.checkApplicationNo = checkApplicationNo;
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

    public Integer getMedicalDoctorNo() {
        return medicalDoctorNo;
    }

    public void setMedicalDoctorNo(Integer medicalDoctorNo) {
        this.medicalDoctorNo = medicalDoctorNo;
    }

    public String getMedicalDoctorName() {
        return medicalDoctorName;
    }

    public void setMedicalDoctorName(String medicalDoctorName) {
        this.medicalDoctorName = medicalDoctorName == null ? null : medicalDoctorName.trim();
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

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
    }
}