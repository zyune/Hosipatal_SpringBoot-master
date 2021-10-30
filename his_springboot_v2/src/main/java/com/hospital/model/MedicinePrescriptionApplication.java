package com.hospital.model;

import java.util.Date;

public class MedicinePrescriptionApplication {
    private Integer id;

    private Integer registrationInfoNo;

    private String medicalRecord;

    private String patientName;

    private String departmentName;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private String clinicalImpression;

    private String clinicalDiagnosis;

    private String requirements;

    private String medicinePrescriptionDrugsNos;

    private String medicinePrescriptionDrugsNames;

    private String isFee;

    private Date createTime;

    private String state;

    private String distributionState;

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

    public String getClinicalImpression() {
        return clinicalImpression;
    }

    public void setClinicalImpression(String clinicalImpression) {
        this.clinicalImpression = clinicalImpression == null ? null : clinicalImpression.trim();
    }

    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis == null ? null : clinicalDiagnosis.trim();
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements == null ? null : requirements.trim();
    }

    public String getMedicinePrescriptionDrugsNos() {
        return medicinePrescriptionDrugsNos;
    }

    public void setMedicinePrescriptionDrugsNos(String medicinePrescriptionDrugsNos) {
        this.medicinePrescriptionDrugsNos = medicinePrescriptionDrugsNos == null ? null : medicinePrescriptionDrugsNos.trim();
    }

    public String getMedicinePrescriptionDrugsNames() {
        return medicinePrescriptionDrugsNames;
    }

    public void setMedicinePrescriptionDrugsNames(String medicinePrescriptionDrugsNames) {
        this.medicinePrescriptionDrugsNames = medicinePrescriptionDrugsNames == null ? null : medicinePrescriptionDrugsNames.trim();
    }

    public String getIsFee() {
        return isFee;
    }

    public void setIsFee(String isFee) {
        this.isFee = isFee == null ? null : isFee.trim();
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

    public String getDistributionState() {
        return distributionState;
    }

    public void setDistributionState(String distributionState) {
        this.distributionState = distributionState == null ? null : distributionState.trim();
    }
}