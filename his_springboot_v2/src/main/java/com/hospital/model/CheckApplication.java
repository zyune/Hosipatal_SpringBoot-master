package com.hospital.model;

import java.util.Date;

public class CheckApplication {
    private Integer id;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private String checkApplicationName;

    private String patientName;

    private String departmentName;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private String requirements;

    private String checkItemNos;

    private String checkItemNames;

    private String useState;

    private String isFee;

    private Double price;

    private Date createTime;

    private String checkType;

    private String state;

    private String bank2;

    private String bank3;

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

    public String getCheckApplicationName() {
        return checkApplicationName;
    }

    public void setCheckApplicationName(String checkApplicationName) {
        this.checkApplicationName = checkApplicationName == null ? null : checkApplicationName.trim();
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

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements == null ? null : requirements.trim();
    }

    public String getCheckItemNos() {
        return checkItemNos;
    }

    public void setCheckItemNos(String checkItemNos) {
        this.checkItemNos = checkItemNos == null ? null : checkItemNos.trim();
    }

    public String getCheckItemNames() {
        return checkItemNames;
    }

    public void setCheckItemNames(String checkItemNames) {
        this.checkItemNames = checkItemNames == null ? null : checkItemNames.trim();
    }

    public String getUseState() {
        return useState;
    }

    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
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

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
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

    public String getBank3() {
        return bank3;
    }

    public void setBank3(String bank3) {
        this.bank3 = bank3 == null ? null : bank3.trim();
    }
}