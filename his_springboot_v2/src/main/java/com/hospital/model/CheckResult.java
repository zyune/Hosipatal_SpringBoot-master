package com.hospital.model;

import java.util.Date;

public class CheckResult {
    private Integer id;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private Integer checkApplicationNo;

    private String requirements;

    private Integer checkItemNo;

    private String checkItemName;

    private String patientName;

    private String departmentName;

    private String outpatientDoctorName;

    private Integer medicalDoctorNo;

    private String medicalDoctorName;

    private String checkResult;

    private String checkResultImgs;

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

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public Integer getCheckApplicationNo() {
        return checkApplicationNo;
    }

    public void setCheckApplicationNo(Integer checkApplicationNo) {
        this.checkApplicationNo = checkApplicationNo;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements == null ? null : requirements.trim();
    }

    public Integer getCheckItemNo() {
        return checkItemNo;
    }

    public void setCheckItemNo(Integer checkItemNo) {
        this.checkItemNo = checkItemNo;
    }

    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName == null ? null : checkItemName.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getOutpatientDoctorName() {
        return outpatientDoctorName;
    }

    public void setOutpatientDoctorName(String outpatientDoctorName) {
        this.outpatientDoctorName = outpatientDoctorName == null ? null : outpatientDoctorName.trim();
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

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }

    public String getCheckResultImgs() {
        return checkResultImgs;
    }

    public void setCheckResultImgs(String checkResultImgs) {
        this.checkResultImgs = checkResultImgs == null ? null : checkResultImgs.trim();
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