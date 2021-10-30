package com.hospital.service.admin.adminlmp;


import com.hospital.mapper.SchedulingRuleMapper;
import com.hospital.model.SchedulingRule;
import com.hospital.model.SchedulingRuleExample;
import com.hospital.service.admin.SchedulingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@Service
public class SchedulingServicelmp implements SchedulingService {

    @Resource
    SchedulingRuleMapper schedulingRuleMapper ;
    SchedulingRuleExample schedulingRuleExample =new SchedulingRuleExample();
    SchedulingRuleExample.Criteria criteria = schedulingRuleExample.createCriteria();

    @Override
    public List<SchedulingRule> findAll(){
        return schedulingRuleMapper.selectByExample(schedulingRuleExample);
    }

    @Override
    public void addShedulingrule(SchedulingRule schedulingRule){
        schedulingRuleMapper.insert(schedulingRule);
    }

    @Override
    public void updataSchedulrule(SchedulingRule schedulingRule){
        schedulingRuleMapper.updateByPrimaryKey(schedulingRule);
    }

    @Override
    public void delSchedulrule(SchedulingRule schedulingRule){
        schedulingRuleMapper.deleteByPrimaryKey(schedulingRule.getId());

    }

}
