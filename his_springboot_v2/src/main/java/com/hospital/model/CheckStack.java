package com.hospital.model;

import java.util.Date;

public class CheckStack {
    private Integer id;

    private String checkStackName;

    private String usableRange;

    private String departmentNo;

    private String departmentName;

    private Integer outpatientDoctorNo;

    private String outpatientDoctorName;

    private String requirements;

    private String fmedItemNos;

    private String fmedItemNames;

    private Date createTime;

    private String checkType;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckStackName() {
        return checkStackName;
    }

    public void setCheckStackName(String checkStackName) {
        this.checkStackName = checkStackName == null ? null : checkStackName.trim();
    }

    public String getUsableRange() {
        return usableRange;
    }

    public void setUsableRange(String usableRange) {
        this.usableRange = usableRange == null ? null : usableRange.trim();
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo == null ? null : departmentNo.trim();
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

    public String getFmedItemNos() {
        return fmedItemNos;
    }

    public void setFmedItemNos(String fmedItemNos) {
        this.fmedItemNos = fmedItemNos == null ? null : fmedItemNos.trim();
    }

    public String getFmedItemNames() {
        return fmedItemNames;
    }

    public void setFmedItemNames(String fmedItemNames) {
        this.fmedItemNames = fmedItemNames == null ? null : fmedItemNames.trim();
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
}