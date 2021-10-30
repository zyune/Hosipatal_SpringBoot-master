package com.hospital.model;

import java.util.Date;

public class CheckItem {
    private Integer id;

    private String itemName;

    private String itemCode;

    private String itemHandleState;

    private Double itemPrice;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemHandleState() {
        return itemHandleState;
    }

    public void setItemHandleState(String itemHandleState) {
        this.itemHandleState = itemHandleState == null ? null : itemHandleState.trim();
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}