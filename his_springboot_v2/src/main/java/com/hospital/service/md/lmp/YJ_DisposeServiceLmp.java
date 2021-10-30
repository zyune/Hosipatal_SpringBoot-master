package com.hospital.service.md.lmp;

import com.hospital.mapper.CheckApplicationMapper;
import com.hospital.mapper.CheckItemMapper;
import com.hospital.mapper.CheckResultMapper;
import com.hospital.mapper.RegistrationInfoMapper;
import com.hospital.model.*;
import com.hospital.service.md.YJ_DisposeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class YJ_DisposeServiceLmp implements YJ_DisposeService {

    @Resource
    CheckApplicationMapper checkApplicationMapper;
    @Resource
    RegistrationInfoMapper registrationInfoMapper;
    @Resource
    CheckItemMapper checkItemMapper;
    @Resource
    CheckResultMapper checkResultMapper;
    @Override
    public List<CheckApplication> getWaitYjPatient() {
        CheckApplicationExample ex = new CheckApplicationExample();
        CheckApplicationExample.Criteria c = ex.createCriteria();
        c.andIsFeeEqualTo("2");
        c.andStateEqualTo("1");
        c.andCheckTypeEqualTo("2");
        List<CheckApplication> checkApplications = checkApplicationMapper.selectByExample(ex);
        return checkApplications;
    }

    @Override
    public Map<String, String> getPatientSexAndAge(String medicalRecord) {
        RegistrationInfoExample ex=new RegistrationInfoExample();
        RegistrationInfoExample.Criteria c=ex.createCriteria();
        c.andMedicalRecordEqualTo(medicalRecord);
        List<RegistrationInfo> registrationInfos=registrationInfoMapper.selectByExample(ex);
        Map<String,String> s=new HashMap<>();
        s.put("patientSex",""+registrationInfos.get(0).getPatientSex());
        s.put("patientAge",""+registrationInfos.get(0).getPatientAge());
        return s;

    }

    @Override
    public Map<String, String> getPatientOtherInfo(String id) {
        CheckApplicationExample ex=new CheckApplicationExample();
        CheckApplicationExample.Criteria c= ex.createCriteria();
        c.andIdEqualTo(Integer.parseInt(id));
        List<CheckApplication> checkApplications=checkApplicationMapper.selectByExample(ex);
        Map<String,String> s=new HashMap<>();
        s.put("patientName",""+checkApplications.get(0).getPatientName());
        s.put("medicalRecord",""+checkApplications.get(0).getMedicalRecord());
        s.put("departmentName",""+checkApplications.get(0).getDepartmentName());
        s.put("createTime",""+checkApplications.get(0).getCreateTime());
        return s;

    }

    @Override
    public List<CheckItem> getCheckItem(String id) {
        CheckApplicationExample ex=new CheckApplicationExample();
        CheckApplicationExample.Criteria c=ex.createCriteria();
        c.andIdEqualTo(Integer.parseInt(id));
        List<CheckApplication> checkApplications=checkApplicationMapper.selectByExample(ex);
        String[] checkItemNos=checkApplications.get(0).getCheckItemNos().split("\\|");
        System.out.println(Arrays.toString(checkItemNos));
        List<CheckItem> clist = new ArrayList<>();
        for (int i = 0; i < checkItemNos.length; i++) {
            //从数据库中通过id获得item
            int i1 = Integer.parseInt(checkItemNos[i]);
            CheckItem checkItem = checkItemMapper.selectByPrimaryKey(i1);
            clist.add(checkItem);
        }
        return clist;

    }

    @Override
    public void putItemHandleState(String id) {
        CheckItemExample ex=new CheckItemExample();
        CheckItemExample.Criteria c=ex.createCriteria();
        c.andIdEqualTo(Integer.parseInt(id));
        CheckItem checkItem=checkItemMapper.selectByPrimaryKey(Integer.parseInt(id));
        checkItem.setItemHandleState("2");
        checkItemMapper.updateByExample(checkItem,ex);
    }

    @Override
    public void postCheckResult(CheckResult checkResult) {
        checkResult.setState("1");
        checkResultMapper.insert(checkResult);
        CheckItemExample ex=new CheckItemExample();
        CheckItemExample.Criteria c=ex.createCriteria();
        c.andIdEqualTo(checkResult.getCheckItemNo());
        CheckItem checkItem=checkItemMapper.selectByPrimaryKey(checkResult.getCheckItemNo());
        checkItem.setItemHandleState("3");
        checkItemMapper.updateByExample(checkItem,ex);

    }

}
