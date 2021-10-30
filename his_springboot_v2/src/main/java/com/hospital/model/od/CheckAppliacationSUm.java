package com.hospital.model.od;

import com.hospital.model.CheckApplication;
import com.hospital.model.CheckItem;

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

public class CheckAppliacationSUm {
    //这个是application的总和
    CheckApplication checkApplication = null;
    List<CheckItem> checkItemList = null;

    public CheckApplication getCheckApplication() {
        return checkApplication;
    }

    public void setCheckApplication(CheckApplication checkApplication) {
        this.checkApplication = checkApplication;
    }

    public List<CheckItem> getCheckItemList() {
        return checkItemList;
    }

    public void setCheckItemList(List<CheckItem> checkItemList) {
        this.checkItemList = checkItemList;
    }
}
