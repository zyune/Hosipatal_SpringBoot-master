package com.hospital.service.sf.lmp;


import cn.hutool.core.date.DateTime;
import com.hospital.mapper.*;
import com.hospital.model.*;
import com.hospital.service.sf.SF_RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SF_RegistrationServiceLmp implements SF_RegistrationService {
    @Resource
    RegistrationInfoMapper registrationInfoMapper;
    @Resource
    DepartmentMapper departmentMapper;
    @Resource
    UserMapper userMapper;
    @Resource
    RegistrationLevelMapper registrationLevelMapper;
    @Resource
    RegistrationFeeMapper registrationFeeMapperMaaper;



    @Override
    public List<RegistrationInfo> getRegistrationByMedicalRecord(String medicalRecord){
        RegistrationInfoExample registrationInfoExample = new RegistrationInfoExample();
        RegistrationInfoExample.Criteria criteria = registrationInfoExample.createCriteria();
        criteria.andMedicalRecordEqualTo(medicalRecord);
        //状态1 是有效
        criteria.andStateEqualTo("1");
        List<RegistrationInfo> list = registrationInfoMapper.selectByExample(registrationInfoExample);
        return list;

    }

    @Override
    public void putRegistrationInfoUseState(Integer id) {
        RegistrationInfo registrationInfo = registrationInfoMapper.selectByPrimaryKey (id);
        //状态2是无效
        registrationInfo.setState ("2");
        //fee
        //状态2是退号
        RegistrationFee registrationFee = registrationFeeMapperMaaper.selectByPrimaryKey (Integer.parseInt (registrationInfo.getRegistrationFeeNo ()));
        registrationFee.setState("2");
        registrationFeeMapperMaaper.updateByPrimaryKey (registrationFee);
        registrationInfoMapper.updateByPrimaryKey (registrationInfo);
    }

    @Override
    public List<RegistrationInfo> getListRegistrationByPatientName(String patientName ) {
        RegistrationInfoExample ex = new RegistrationInfoExample();
        RegistrationInfoExample.Criteria c = ex.createCriteria();
        //模糊查询
        c.andPatientNameLike("%" + patientName + "%");
        c.andStateEqualTo("1");
        List<RegistrationInfo> list = registrationInfoMapper.selectByExample(ex);
        return list;
    }

    @Override
    public void addRegistration(RegistrationInfo registrationInfo,String registrarName,int no){


        Integer outpatientDoctorNo = registrationInfo.getOutpatientDoctorNo ();
        User user = userMapper.selectByPrimaryKey (outpatientDoctorNo);
        registrationInfo.setOutpatientDoctorName (user.getName ());


        Integer departMentID = registrationInfo.getDepartmentNo ();
        Department department = departmentMapper.selectByPrimaryKey (departMentID);
        registrationInfo.setDepartmentName (department.getDeptName ());
        registrationInfo.setState ("1");
        registrationInfo.setIsSeenDocator ("1");
        registrationInfo.setCreateTime (new DateTime ());
        //生成一个费用数据 也就是挂号数据
        RegistrationFee fee = new RegistrationFee ();
        fee.setMedicalRecord (registrationInfo.getMedicalRecord ());
        fee.setPatientName (registrationInfo.getPatientName ());
        fee.setCreateTime (new DateTime ());
        fee.setDepartmentNo (registrationInfo.getDepartmentNo ());
        fee.setPrice (Double.parseDouble (registrationInfo.getBlank1 ()));
        fee.setRegistrarName (registrarName);
        fee.setRegistrarNo (no);
        fee.setRegistrationInfoNo (-1);
        fee.setRegistrationLevelNo (Integer.parseInt (registrationInfo.getBlank2 ()));

        registrationFeeMapperMaaper.insert (fee);
        registrationInfo.setRegistrationFeeNo (""+fee.getId ());
        registrationInfoMapper.insert(registrationInfo);
        fee.setRegistrationInfoNo (registrationInfo.getId ());
        registrationFeeMapperMaaper.updateByPrimaryKey (fee);
    }




    @Override
    public List<RegistrationInfo> listRegistration(){
        RegistrationInfoExample registrationInfoExample = new RegistrationInfoExample();
        //通过id进行查找，确保最新的挂号信息显示在最前面
        registrationInfoExample.setOrderByClause("id desc");
        List<RegistrationInfo> registrationInfos = registrationInfoMapper.selectByExample(registrationInfoExample);
        return registrationInfos;
    }


@Override
    public List<RegistrationLevel> listRegistrationLevel(){
    RegistrationLevelExample registrationLevelExample = new RegistrationLevelExample();
    List<RegistrationLevel> registrationLevels=registrationLevelMapper.selectByExample(registrationLevelExample);
    return registrationLevels;

}

}
