package com.hospital.model;

import java.util.Date;

public class SchedulingInfo {
    private Integer id;

    private Integer schedulingRuleNo;

    private Date schedulingDate;

    private Integer departmentNo;

    private String departmentName;

    private Integer odNo;

    private String odName;

    private String levelType;

    private String day;

    private Integer quota;

    private Integer leftQuota;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchedulingRuleNo() {
        return schedulingRuleNo;
    }

    public void setSchedulingRuleNo(Integer schedulingRuleNo) {
        this.schedulingRuleNo = schedulingRuleNo;
    }

    public Date getSchedulingDate() {
        return schedulingDate;
    }

    public void setSchedulingDate(Date schedulingDate) {
        this.schedulingDate = schedulingDate;
    }

    public Integer getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Integer departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getOdNo() {
        return odNo;
    }

    public void setOdNo(Integer odNo) {
        this.odNo = odNo;
    }

    public String getOdName() {
        return odName;
    }

    public void setOdName(String odName) {
        this.odName = odName == null ? null : odName.trim();
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType == null ? null : levelType.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getLeftQuota() {
        return leftQuota;
    }

    public void setLeftQuota(Integer leftQuota) {
        this.leftQuota = leftQuota;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}