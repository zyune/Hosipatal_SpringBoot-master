package com.hospital.model.od;

import com.hospital.model.CheckStack;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName AcceptCheckTemplate
 * @Description 自定义对象，进行接收checkTemplate对象
 * @Author 方聪
 * @Date 2019/6/22 16:42
 * @Version 1.0
 **/

public class AcceptCheckTemplate {
    //首先要具有
    CheckStack checkStack ;
    List<String[]> itemCodeList = null;


    public CheckStack getCheckStack() {
        return checkStack;
    }

    public void setCheckStack(CheckStack checkStack) {
        this.checkStack = checkStack;
    }

    public List<String[]> getItemCodeList() {
        return itemCodeList;
    }

    public void setItemCodeList(List<String[]> itemCodeList) {
        this.itemCodeList = itemCodeList;
    }
}
