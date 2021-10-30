package com.hospital.service.sf.lmp;

import cn.hutool.core.date.DateUtil;
import com.hospital.mapper.RegistrationLevelMapper;
import com.hospital.mapper.SchedulingInfoMapper;
import com.hospital.model.RegistrationLevel;
import com.hospital.model.RegistrationLevelExample;
import com.hospital.model.SchedulingInfo;
import com.hospital.model.SchedulingInfoExample;
import com.hospital.model.od.ResultRegistrationLevelOptions;
import com.hospital.service.sf.SF_SchedulingInfoService;
import com.hospital.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service

public class SF_SchedulingInfoServiceLmp implements SF_SchedulingInfoService {
    @Resource
    SchedulingInfoMapper schedulingInfoMapper;

    @Resource
    RegistrationLevelMapper registrationLevelMapper;

    @Override
    public ArrayList<Object> getSchedulingInfoByDay(String day) {
        ResultRegistrationLevelOptions resultRegistrationLevelOptions = new ResultRegistrationLevelOptions();

        //创建空的数组对象
        ArrayList<Object> options = new ArrayList<> ();
        //首先获得level
        RegistrationLevelExample ex = new RegistrationLevelExample ();
        List<RegistrationLevel> registrationLevels = registrationLevelMapper.selectByExample (ex);
        //获得有效的排班数据
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria c = schedulingInfoExample.createCriteria ();
        String today= DateUtil.today();
        //查找在两个时间段内的数据
        c.andSchedulingDateBetween (DateUtils.getSqlDate(today+" 00:00:00"),DateUtils.getSqlDate(today+" 24:00:00"));
        ArrayList<String> a = new ArrayList<> ();
        //符合 day 和 day=3的数据
        a.add (day);
        a.add ("3");
        c.andDayIn (a);
        List<SchedulingInfo> schedulingInfos = schedulingInfoMapper.selectByExample (schedulingInfoExample);

        registrationLevels.forEach (e ->{
            ArrayList<Object> levels = new ArrayList<> ();
            levels.add ("A"+e.getId ());
            levels.add (e.getLevelName ());

            ArrayList<Object> departments = getDepartmentByschedulingInfos(schedulingInfos,e.getId ());
            levels.add (departments);
            options.add (levels);
        });
        return options;
    }

    private ArrayList<Object> getDepartmentByschedulingInfos(List<SchedulingInfo> schedulingInfos, Integer levelID) {
        List<SchedulingInfo> schedulingInfos2=  schedulingInfos;
        ArrayList<Object> departments = new ArrayList<> ();
        ArrayList<Object> department = new ArrayList<> ();
        schedulingInfos.forEach (e -> {
            if(e.getLevelType ().equals (levelID+"") ){
                department.add ("B"+e.getDepartmentNo ());
                department.add (e.getDepartmentName ());
                department.add(getDoctorsByschedulingInfos(schedulingInfos2,levelID,e.getDepartmentNo ()));
                departments.add(department);
            }
        });



        return departments;


    }

    private ArrayList<Object> getDoctorsByschedulingInfos(List<SchedulingInfo> schedulingInfos,int levelID,int departmentID) {
        System.out.println ("执行了"+levelID+","+departmentID);
        ArrayList<Object> doctors = new ArrayList<> ();
        ArrayList<Object> doctor = new ArrayList<> ();
        schedulingInfos.forEach (e -> {
            System.out.println (e.getLevelType ()+","+e.getDepartmentNo ());
            if(e.getLevelType ().equals (levelID+"") && e.getDepartmentNo () == departmentID){
                System.out.println (e);
                doctor.add ("C"+e.getOdNo ());
                doctor.add (e.getOdName ());
                doctor.add(e.getLeftQuota ());
                doctors.add (doctor);
            }
        });
        return doctors;
    }


}
