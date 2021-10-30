package com.hospital.model;

import java.util.Date;

public class FmedItem {
    private Integer id;

    private String itemcode;

    private String itemname;

    private String format;

    private Double price;

    private Integer expclassid;

    private Integer deptid;

    private String memoniccode;

    private Integer recordtype;

    private Date creationdate;

    private String isRegistraion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getExpclassid() {
        return expclassid;
    }

    public void setExpclassid(Integer expclassid) {
        this.expclassid = expclassid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getMemoniccode() {
        return memoniccode;
    }

    public void setMemoniccode(String memoniccode) {
        this.memoniccode = memoniccode == null ? null : memoniccode.trim();
    }

    public Integer getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getIsRegistraion() {
        return isRegistraion;
    }

    public void setIsRegistraion(String isRegistraion) {
        this.isRegistraion = isRegistraion == null ? null : isRegistraion.trim();
    }
}