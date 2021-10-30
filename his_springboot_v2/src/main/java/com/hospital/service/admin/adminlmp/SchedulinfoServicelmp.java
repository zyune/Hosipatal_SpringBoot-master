package com.hospital.service.admin.adminlmp;

import com.hospital.mapper.SchedulingInfoMapper;
import com.hospital.model.SchedulingInfo;
import com.hospital.model.SchedulingInfoExample;
import com.hospital.service.admin.SchedulinfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@Service
public class SchedulinfoServicelmp implements SchedulinfoService {
    @Resource
    SchedulingInfoMapper schedulingInfoMapper;
    SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
    SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();

    @Override
    public List<SchedulingInfo> findAll(){

        return schedulingInfoMapper.selectByExample(schedulingInfoExample);
    }

    @Override
    public void addShedulInfor(SchedulingInfo schedulingInfo){
        schedulingInfoMapper.insert(schedulingInfo);
    }

    @Override
    public void updataSchedulInfor(SchedulingInfo schedulingInfo){
        schedulingInfoMapper.updateByPrimaryKey(schedulingInfo);
    }

    @Override
    public void delSchedulInfor(SchedulingInfo schedulingInfo){

    }

    @Override
    public Date getchedulingInfoLastDate() {
        SchedulingInfoExample ex = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria c = ex.createCriteria();

        List<SchedulingInfo> schedulingInfos = schedulingInfoMapper.selectByExample(ex);

        return schedulingInfos.get(schedulingInfos.size()-1).getSchedulingDate();
    }
}
