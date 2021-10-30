package com.hospital.model;

import java.math.BigDecimal;

public class HerbalItem {
    private Integer id;

    private Integer drugsNo;

    private String drugsName;

    private String drugsFormat;

    private Double drugsPrice;

    private String drugsUseWay;

    private String drugsNuit;

    private BigDecimal drugsNum;

    private Double drugsTotalPrice;

    private String useWarn;

    private String handleState;

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

    public Double getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(Double drugsPrice) {
        this.drugsPrice = drugsPrice;
    }

    public String getDrugsUseWay() {
        return drugsUseWay;
    }

    public void setDrugsUseWay(String drugsUseWay) {
        this.drugsUseWay = drugsUseWay == null ? null : drugsUseWay.trim();
    }

    public String getDrugsNuit() {
        return drugsNuit;
    }

    public void setDrugsNuit(String drugsNuit) {
        this.drugsNuit = drugsNuit == null ? null : drugsNuit.trim();
    }

    public BigDecimal getDrugsNum() {
        return drugsNum;
    }

    public void setDrugsNum(BigDecimal drugsNum) {
        this.drugsNum = drugsNum;
    }

    public Double getDrugsTotalPrice() {
        return drugsTotalPrice;
    }

    public void setDrugsTotalPrice(Double drugsTotalPrice) {
        this.drugsTotalPrice = drugsTotalPrice;
    }

    public String getUseWarn() {
        return useWarn;
    }

    public void setUseWarn(String useWarn) {
        this.useWarn = useWarn == null ? null : useWarn.trim();
    }

    public String getHandleState() {
        return handleState;
    }

    public void setHandleState(String handleState) {
        this.handleState = handleState == null ? null : handleState.trim();
    }
}