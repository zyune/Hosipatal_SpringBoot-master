package com.hospital.model;

import java.math.BigDecimal;
import java.util.Date;

public class MedicinePrescriptionFee {
    private Integer id;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private String patientName;

    private Integer medicinePrescriptionApplicationNo;

    private Integer departmentNo;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private Integer registrationPayWayNo;

    private String medicinePrescriptionDrugsNames;

    private Integer registrarNo;

    private String registrarName;

    private Integer drugDoctorNo;

    private String drugDoctorName;

    private BigDecimal price;

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

    public Integer getMedicinePrescriptionApplicationNo() {
        return medicinePrescriptionApplicationNo;
    }

    public void setMedicinePrescriptionApplicationNo(Integer medicinePrescriptionApplicationNo) {
        this.medicinePrescriptionApplicationNo = medicinePrescriptionApplicationNo;
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

    public Integer getRegistrationPayWayNo() {
        return registrationPayWayNo;
    }

    public void setRegistrationPayWayNo(Integer registrationPayWayNo) {
        this.registrationPayWayNo = registrationPayWayNo;
    }

    public String getMedicinePrescriptionDrugsNames() {
        return medicinePrescriptionDrugsNames;
    }

    public void setMedicinePrescriptionDrugsNames(String medicinePrescriptionDrugsNames) {
        this.medicinePrescriptionDrugsNames = medicinePrescriptionDrugsNames == null ? null : medicinePrescriptionDrugsNames.trim();
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}