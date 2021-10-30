package com.hospital.model;

public class User {
    private Integer id;

    private String username;

    private String userpassword;

    private Integer role;

    private String position;

    private String isSchedul;

    private Integer departmentNo;

    private String departmentName;

    private String name;

    private String iphone;

    private String adderst;

    private String mes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getIsSchedul() {
        return isSchedul;
    }

    public void setIsSchedul(String isSchedul) {
        this.isSchedul = isSchedul == null ? null : isSchedul.trim();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone == null ? null : iphone.trim();
    }

    public String getAdderst() {
        return adderst;
    }

    public void setAdderst(String adderst) {
        this.adderst = adderst == null ? null : adderst.trim();
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes == null ? null : mes.trim();
    }
}