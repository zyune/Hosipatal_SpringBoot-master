package com.hospital.model;

public class DailyDetail {
    private Integer id;

    private Integer dailySettlementNo;

    private String medicalRecord;

    private String patientName;

    private Double price;

    private String settlementCategory;

    private Double discountAmount;

    private String accountToPay;

    private String bank1;

    private String bank2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDailySettlementNo() {
        return dailySettlementNo;
    }

    public void setDailySettlementNo(Integer dailySettlementNo) {
        this.dailySettlementNo = dailySettlementNo;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSettlementCategory() {
        return settlementCategory;
    }

    public void setSettlementCategory(String settlementCategory) {
        this.settlementCategory = settlementCategory == null ? null : settlementCategory.trim();
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getAccountToPay() {
        return accountToPay;
    }

    public void setAccountToPay(String accountToPay) {
        this.accountToPay = accountToPay == null ? null : accountToPay.trim();
    }

    public String getBank1() {
        return bank1;
    }

    public void setBank1(String bank1) {
        this.bank1 = bank1 == null ? null : bank1.trim();
    }

    public String getBank2() {
        return bank2;
    }

    public void setBank2(String bank2) {
        this.bank2 = bank2 == null ? null : bank2.trim();
    }
}