package com.hospital.model.od;

import com.hospital.model.HerbalApplication;
import com.hospital.model.HerbalItem;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName CheckAppliacationSUm
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/20 21:45
 * @Version 1.0
 **/

public class HerbalAppliacationSUm {
    //这个是application的总和
    HerbalApplication herbalApplication = null;
    List<HerbalItem> herbalItemList = null;

    public HerbalApplication getHerbalApplication() {
        return herbalApplication;
    }

    public void setHerbalApplication(HerbalApplication herbalApplication) {
        this.herbalApplication = herbalApplication;
    }

    public List<HerbalItem> getHerbalItemList() {
        return herbalItemList;
    }

    public void setHerbalItemList(List<HerbalItem> herbalItemList) {
        this.herbalItemList = herbalItemList;
    }
}
