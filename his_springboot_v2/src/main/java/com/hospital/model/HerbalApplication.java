package com.hospital.model;

import java.util.Date;

public class HerbalApplication {
    private Integer id;

    private String applicationName;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private String patientName;

    private String departmentName;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private String herbalItemNos;

    private String herbalItemNames;

    private String isFee;

    private Double price;

    private Date createTime;

    private String useState;

    private String herbalType;

    private String handleState;

    private String state;

    private String bank2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
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

    public String getHerbalItemNos() {
        return herbalItemNos;
    }

    public void setHerbalItemNos(String herbalItemNos) {
        this.herbalItemNos = herbalItemNos == null ? null : herbalItemNos.trim();
    }

    public String getHerbalItemNames() {
        return herbalItemNames;
    }

    public void setHerbalItemNames(String herbalItemNames) {
        this.herbalItemNames = herbalItemNames == null ? null : herbalItemNames.trim();
    }

    public String getIsFee() {
        return isFee;
    }

    public void setIsFee(String isFee) {
        this.isFee = isFee == null ? null : isFee.trim();
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

    public String getUseState() {
        return useState;
    }

    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
    }

    public String getHerbalType() {
        return herbalType;
    }

    public void setHerbalType(String herbalType) {
        this.herbalType = herbalType == null ? null : herbalType.trim();
    }

    public String getHandleState() {
        return handleState;
    }

    public void setHandleState(String handleState) {
        this.handleState = handleState == null ? null : handleState.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBank2() {
        return bank2;
    }

    public void setBank2(String bank2) {
        this.bank2 = bank2 == null ? null : bank2.trim();
    }
}