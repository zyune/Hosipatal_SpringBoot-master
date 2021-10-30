package com.hospital.model;

import java.math.BigDecimal;

public class MedicinePrescriptionDrugsCopy1 {
    private Integer id;

    private Integer drugsNo;

    private String drugsName;

    private String drugsFormat;

    private String drugsUsage;

    private String drugsDosage;

    private Integer drugsNum;

    private BigDecimal drugsPrice;

    private String userWarns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugsNo() {
        return drugsNo;
    }

    public void setDrugsNo(Integer drugsNo) {
        this.drugsNo = drugsNo;
    }

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName == null ? null : drugsName.trim();
    }

    public String getDrugsFormat() {
        return drugsFormat;
    }

    public void setDrugsFormat(String drugsFormat) {
        this.drugsFormat = drugsFormat == null ? null : drugsFormat.trim();
    }

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage == null ? null : drugsUsage.trim();
    }

    public String getDrugsDosage() {
        return drugsDosage;
    }

    public void setDrugsDosage(String drugsDosage) {
        this.drugsDosage = drugsDosage == null ? null : drugsDosage.trim();
    }

    public Integer getDrugsNum() {
        return drugsNum;
    }

    public void setDrugsNum(Integer drugsNum) {
        this.drugsNum = drugsNum;
    }

    public BigDecimal getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(BigDecimal drugsPrice) {
        this.drugsPrice = drugsPrice;
    }

    public String getUserWarns() {
        return userWarns;
    }

    public void setUserWarns(String userWarns) {
        this.userWarns = userWarns == null ? null : userWarns.trim();
    }
}