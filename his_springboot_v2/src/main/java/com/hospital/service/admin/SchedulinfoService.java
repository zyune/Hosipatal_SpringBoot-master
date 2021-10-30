package com.hospital.service.admin;


import com.hospital.model.SchedulingInfo;

import java.util.Date;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/
public interface SchedulinfoService {
    List<SchedulingInfo> findAll();
    void addShedulInfor(SchedulingInfo schedulingInfo);
    void updataSchedulInfor(SchedulingInfo schedulingInfo);
    void delSchedulInfor(SchedulingInfo schedulingInfo);

    Date getchedulingInfoLastDate();
}
