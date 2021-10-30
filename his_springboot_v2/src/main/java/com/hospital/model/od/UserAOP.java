package com.hospital.model.od;

import java.util.Date;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName UserAOP
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/7 22:47
 * @Version 1.0
 **/

public class UserAOP {

    private String name;
    private Date date;
    private String adderst;

    public UserAOP(String name) {
        this.name = name;
    }

    public UserAOP(String name, Date date, String adderst) {
        this.name = name;
        this.date = date;
        this.adderst = adderst;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdderst() {
        return adderst;
    }

    public void setAdderst(String adderst) {
        this.adderst = adderst;
    }
}
