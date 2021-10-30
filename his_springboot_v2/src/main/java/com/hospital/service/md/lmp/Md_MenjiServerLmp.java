package com.hospital.service.md.lmp;

import com.hospital.mapper.MedicinePrescriptionApplicationMapper;
import com.hospital.mapper.MedicinePrescriptionDrugsCopy1Mapper;
import com.hospital.mapper.RegistrationInfoMapper;
import com.hospital.model.*;
import com.hospital.service.md.Md_MenjiService;
import org.omg.CORBA.INTERNAL;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Md_MenjiServerLmp implements Md_MenjiService {

    @Resource
    MedicinePrescriptionApplicationMapper medicinePrescriptionApplicationMapper;

    @Resource
    RegistrationInfoMapper registrationInfoMapper;
    @Resource
    MedicinePrescriptionDrugsCopy1Mapper medicinePrescriptionDrugsCopy1Mapper;


    @Override
    public List<MedicinePrescriptionApplication> getWaitFyPatient(){
        //西药申请表 今天  已经付费 1 2
        MedicinePrescriptionApplicationExample ex = new MedicinePrescriptionApplicationExample();
        MedicinePrescriptionApplicationExample.Criteria c = ex.createCriteria();
        c.andIsFeeEqualTo("1");
        List<MedicinePrescriptionApplication> medicinePrescriptionApplications = medicinePrescriptionApplicationMapper.selectByExample(ex);
        return medicinePrescriptionApplications;
    }



    @Override
    public List<MedicinePrescriptionApplication> getDrugs(String blh) {
        MedicinePrescriptionApplicationExample ex=new MedicinePrescriptionApplicationExample();
        MedicinePrescriptionApplicationExample.Criteria c=ex.createCriteria();
        c.andMedicalRecordEqualTo(blh);
        List<MedicinePrescriptionApplication> medicinePrescriptionApplications =medicinePrescriptionApplicationMapper.selectByExample(ex);
        return medicinePrescriptionApplications;
    }


    @Override
    public Map<String, String> getPatientAgeAndSex(String blh) {
        RegistrationInfoExample ex = new RegistrationInfoExample();
        RegistrationInfoExample.Criteria c = ex.createCriteria();
        c.andMedicalRecordEqualTo(blh);
        // select *  from info where medicalRecord = blh and state =1;
        List<RegistrationInfo> registrationInfos =  registrationInfoMapper.selectByExample(ex);
        Map<String, String> s = new HashMap<>();
        //因为在挂号表中对应的病历号的数据只能有一个也就是使用get(0)
        s.put("patientSex",registrationInfos.get(0).getPatientSex());
        s.put("patientAge", ""+registrationInfos.get(0).getPatientAge());
        return s;
    }
    @Override
    public  Map<String,String> getPatientOtherInfo(String blh){
        MedicinePrescriptionApplicationExample ex=new MedicinePrescriptionApplicationExample();
        MedicinePrescriptionApplicationExample.Criteria c=ex.createCriteria();
        c.andMedicalRecordEqualTo(blh);
        List<MedicinePrescriptionApplication> medicinePrescriptionApplications=medicinePrescriptionApplicationMapper.selectByExample(ex);
        Map<String, String> s = new HashMap<>();
        s.put("medicalRecord",""+medicinePrescriptionApplications.get(0).getMedicalRecord());
        s.put("patientName",""+medicinePrescriptionApplications.get(0).getPatientName());
        s.put("departmentName",""+medicinePrescriptionApplications.get(0).getDepartmentName());
        s.put("state",medicinePrescriptionApplications.get(0).getState());
        s.put("createTime",""+medicinePrescriptionApplications.get(0).getCreateTime());
                return s;
    }
    @Override
    public List<MedicinePrescriptionDrugsCopy1> getDrugsDetail(String cfh){
        System.out.println("cccc:"+cfh);
        MedicinePrescriptionDrugsCopy1Example ex=new MedicinePrescriptionDrugsCopy1Example();
        MedicinePrescriptionDrugsCopy1Example.Criteria c=ex.createCriteria();
        c.andDrugsNoEqualTo(Integer.parseInt(cfh));
        List<MedicinePrescriptionDrugsCopy1> medicinePrescriptionDrugsCopy1s=medicinePrescriptionDrugsCopy1Mapper.selectByExample(ex);
        return medicinePrescriptionDrugsCopy1s;

    }
    @Override
    public void putDistState(String cfh) {

        MedicinePrescriptionApplicationExample ex = new MedicinePrescriptionApplicationExample();
        MedicinePrescriptionApplicationExample.Criteria c = ex.createCriteria();
        c.andIdEqualTo(Integer.parseInt(cfh));
        MedicinePrescriptionApplication medicinePrescriptionApplication = medicinePrescriptionApplicationMapper.selectByPrimaryKey(Integer.parseInt(cfh));
        medicinePrescriptionApplication.setDistributionState("2");
        medicinePrescriptionApplicationMapper.updateByExample(medicinePrescriptionApplication,ex);

    }
    @Override
    public List<MedicinePrescriptionApplication> getWaitFyPatientById(String medicalRecord) {
        MedicinePrescriptionApplicationExample ex = new MedicinePrescriptionApplicationExample();
        MedicinePrescriptionApplicationExample.Criteria c = ex.createCriteria();
        c.andIsFeeEqualTo("1");
        c.andMedicalRecordEqualTo(medicalRecord);
        List<MedicinePrescriptionApplication> medicinePrescriptionApplications = medicinePrescriptionApplicationMapper.selectByExample(ex);
        return medicinePrescriptionApplications;
    }

}
