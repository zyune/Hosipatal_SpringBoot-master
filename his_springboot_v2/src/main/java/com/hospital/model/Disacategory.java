package com.hospital.model;

public class Disacategory {
    private Integer id;

    private String dicaCode;

    private String dicaName;

    private Integer sequenceNo;

    private Integer dicaType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDicaCode() {
        return dicaCode;
    }

    public void setDicaCode(String dicaCode) {
        this.dicaCode = dicaCode == null ? null : dicaCode.trim();
    }

    public String getDicaName() {
        return dicaName;
    }

    public void setDicaName(String dicaName) {
        this.dicaName = dicaName == null ? null : dicaName.trim();
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public Integer getDicaType() {
        return dicaType;
    }

    public void setDicaType(Integer dicaType) {
        this.dicaType = dicaType;
    }
}