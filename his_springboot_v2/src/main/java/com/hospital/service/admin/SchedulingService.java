package com.hospital.service.admin;


import com.hospital.model.SchedulingRule;

import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/
public interface SchedulingService {

    List<SchedulingRule> findAll();
    void addShedulingrule(SchedulingRule schedulingRule);
    void updataSchedulrule(SchedulingRule schedulingRule);
    void delSchedulrule(SchedulingRule schedulingRule);

}
