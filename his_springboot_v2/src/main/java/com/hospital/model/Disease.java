package com.hospital.model;

public class Disease {
    private Integer id;

    private String diseaseCode;

    private String diseaseName;

    private String diseaseIcd;

    private Integer diseCategoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode == null ? null : diseaseCode.trim();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getDiseaseIcd() {
        return diseaseIcd;
    }

    public void setDiseaseIcd(String diseaseIcd) {
        this.diseaseIcd = diseaseIcd == null ? null : diseaseIcd.trim();
    }

    public Integer getDiseCategoryId() {
        return diseCategoryId;
    }

    public void setDiseCategoryId(Integer diseCategoryId) {
        this.diseCategoryId = diseCategoryId;
    }
}