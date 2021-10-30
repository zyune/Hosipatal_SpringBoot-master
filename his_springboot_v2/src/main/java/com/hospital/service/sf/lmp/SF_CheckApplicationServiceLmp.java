package com.hospital.service.sf.lmp;

import com.hospital.mapper.CheckApplicationMapper;
import com.hospital.mapper.CheckFeeMapper;
import com.hospital.model.CheckApplication;
import com.hospital.model.CheckApplicationExample;
import com.hospital.model.CheckFee;
import com.hospital.model.CheckFeeExample;
import com.hospital.service.sf.SF_CheckApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SF_CheckApplicationServiceLmp implements SF_CheckApplicationService {
    @Resource
    CheckApplicationMapper checkApplicationMapper;
    @Resource
    CheckFeeMapper checkFeeMapper;

    @Override
    public  List<CheckFee> listCheckFeeByPatientName(String patientName , String type){
        CheckFeeExample checkFeeExample = new CheckFeeExample ();
        CheckFeeExample.Criteria criteria = checkFeeExample.createCriteria ();
        criteria.andPatientNameLike ("%"+patientName+"%");
        criteria.andCheckTypeEqualTo (type);
        List<CheckFee> checkFees = checkFeeMapper.selectByExample (checkFeeExample);
        return checkFees;
    }

    @Override
    public  List<CheckFee> listAllCheckFee(String type){
        CheckFeeExample checkFeeExample = new CheckFeeExample ();
        CheckFeeExample.Criteria c = checkFeeExample.createCriteria ();
        c.andCheckTypeEqualTo (type);
        List<CheckFee> checkFees = checkFeeMapper.selectByExample (checkFeeExample);
        return checkFees;
    }

    @Override
    public List<CheckApplication> listCheck() {
        CheckApplicationExample checkApplicationExample = new CheckApplicationExample ();
        CheckApplicationExample.Criteria criteria = checkApplicationExample.createCriteria ();
        //（有效   暂存  付费）
        criteria.andStateEqualTo ("1");
        criteria.andUseStateEqualTo ("2");
         criteria.andIsFeeEqualTo ("1");
        List<CheckApplication> checkApplications = checkApplicationMapper.selectByExample (checkApplicationExample);
        return   checkApplications;


    }

    @Override
    public List<CheckApplication> listPatientName(String patientName) {
        CheckApplicationExample checkApplicationExample = new CheckApplicationExample();
        CheckApplicationExample.Criteria criteria = checkApplicationExample.createCriteria ();
        //（病人姓名模糊查询   有效   暂存  付费）
        criteria.andPatientNameLike ("%" + patientName + "%");
        criteria.andStateEqualTo ("1");
        criteria.andUseStateEqualTo ("2");
        criteria.andIsFeeEqualTo ("1");
        List<CheckApplication> list = checkApplicationMapper.selectByExample(checkApplicationExample);

        return list;


    }

    @Override
    public void addCheckFee(CheckFee checkFee){
        //假数据需要处理

        checkFee.setRegistrarNo (11);
        checkFee.setRegistrarName ("ss");

        //解决is fee 更新
        Integer checkApplicationNo = checkFee.getCheckApplicationNo ();
        CheckApplication checkApplication = checkApplicationMapper.selectByPrimaryKey (checkApplicationNo);
        checkApplication.setIsFee ("2");
        checkApplicationMapper.updateByPrimaryKey (checkApplication);
        //------
        checkFee.setCreateTime (new Date ());
        checkFeeMapper.insert(checkFee);
    }
}