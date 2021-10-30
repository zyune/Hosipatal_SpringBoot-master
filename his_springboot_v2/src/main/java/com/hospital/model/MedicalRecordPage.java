package com.hospital.model;

import java.util.Date;

public class MedicalRecordPage {
    private Integer id;

    private Integer registrationInfo;

    private String patientName;

    private String medicalRecord;

    private Integer outpatientDoctorNo;

    private String chiefComplaint;

    private String historyPresentIllness;

    private String historyIllness;

    private String healthExamine;

    private String assistExamine;

    private String diagnosiNos;

    private Date createTime;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(Integer registrationInfo) {
        this.registrationInfo = registrationInfo;
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

    public Integer getOutpatientDoctorNo() {
        return outpatientDoctorNo;
    }

    public void setOutpatientDoctorNo(Integer outpatientDoctorNo) {
        this.outpatientDoctorNo = outpatientDoctorNo;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint == null ? null : chiefComplaint.trim();
    }

    public String getHistoryPresentIllness() {
        return historyPresentIllness;
    }

    public void setHistoryPresentIllness(String historyPresentIllness) {
        this.historyPresentIllness = historyPresentIllness == null ? null : historyPresentIllness.trim();
    }

    public String getHistoryIllness() {
        return historyIllness;
    }

    public void setHistoryIllness(String historyIllness) {
        this.historyIllness = historyIllness == null ? null : historyIllness.trim();
    }

    public String getHealthExamine() {
        return healthExamine;
    }

    public void setHealthExamine(String healthExamine) {
        this.healthExamine = healthExamine == null ? null : healthExamine.trim();
    }

    public String getAssistExamine() {
        return assistExamine;
    }

    public void setAssistExamine(String assistExamine) {
        this.assistExamine = assistExamine == null ? null : assistExamine.trim();
    }

    public String getDiagnosiNos() {
        return diagnosiNos;
    }

    public void setDiagnosiNos(String diagnosiNos) {
        this.diagnosiNos = diagnosiNos == null ? null : diagnosiNos.trim();
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