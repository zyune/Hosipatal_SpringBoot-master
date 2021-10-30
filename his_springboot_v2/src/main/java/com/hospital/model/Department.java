package com.hospital.model;

public class Department {
    private Integer id;

    private String deptCode;

    private String deptName;

    private Integer deptCategoryId;

    private Integer deptType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDeptCategoryId() {
        return deptCategoryId;
    }

    public void setDeptCategoryId(Integer deptCategoryId) {
        this.deptCategoryId = deptCategoryId;
    }

    public Integer getDeptType() {
        return deptType;
    }

    public void setDeptType(Integer deptType) {
        this.deptType = deptType;
    }
}