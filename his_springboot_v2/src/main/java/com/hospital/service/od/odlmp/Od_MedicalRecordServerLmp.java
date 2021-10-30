package com.hospital.service.od.odlmp;

import com.hospital.mapper.*;
import com.hospital.model.*;
import com.hospital.service.od.Od_MedicalRecordServer;
import com.hospital.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_MedicalRecordServerlmp
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/5 18:46
 * @Version 1.0
 **/
@Service
public class Od_MedicalRecordServerLmp implements Od_MedicalRecordServer {

    Logger logger = LoggerFactory.getLogger(Od_MedicalRecordServerLmp.class);

    @Resource
    MedicalRecordPageMapper odMapper;
    @Resource
    MedicalRecordPageTemplateMapper mrpTeplateMapper;
    @Resource
    MedicalRecordPageMapper medicalRecordPageMapper;
    @Resource
    RegistrationInfoMapper reginstrMapper;
    @Resource
    DiagnosiMapper diagnosiMapper; // 诊断
    @Resource
    UsedDiagnosiMapper usedDiagnosiMapper;//常用诊断
    @Resource
    DiseaseMapper diseaseMapper;//诊断list


    @Override
    public String test() {
        return null;
    }

    @Override
    public List<RegistrationInfo> getWaitPatient(int od_id, String today) {
        RegistrationInfoExample example = new RegistrationInfoExample();
        RegistrationInfoExample.Criteria c = example.createCriteria();
//        选择条件
        c.andOutpatientDoctorNoEqualTo(od_id);
        c.andCreateTimeBetween(DateUtils.getSqlDate(today + " 00:00:00"), DateUtils.getSqlDate(DateUtils.getDate()));
        c.andStateEqualTo("1");//1 是有效的
        c.andIsSeenDocatorEqualTo("1");

        List<RegistrationInfo> registrationInfos = reginstrMapper.selectByExample(example);

        return registrationInfos;

    }

    @Override
    public List<RegistrationInfo> getSeeEdPatient(int od_id, String today) {

        RegistrationInfoExample example = new RegistrationInfoExample();
        RegistrationInfoExample.Criteria c = example.createCriteria();
//        选择条件
        c.andOutpatientDoctorNoEqualTo(od_id);
        c.andCreateTimeBetween(DateUtils.getSqlDate(today + " 00:00:00"), DateUtils.getSqlDate(DateUtils.getDate()));

        c.andStateEqualTo("1");// 是有效的

        List<String> s = new ArrayList<>();
        s.add("2");
        s.add("3");
        c.andIsSeenDocatorIn(s);

        List<RegistrationInfo> registrationInfos = reginstrMapper.selectByExample(example);

        return registrationInfos;


    }

    @Override
    public MedicalRecordPage getMedicalRecordPageByPatientBLH(String blh) {

        MedicalRecordPageExample ex = new MedicalRecordPageExample();
        MedicalRecordPageExample.Criteria c = ex.createCriteria();

        c.andStateEqualTo("1");
        c.andMedicalRecordEqualTo(blh);
        List<MedicalRecordPage> medicalRecordPages = odMapper.selectByExample(ex);
        if (medicalRecordPages == null)
            return null;
        else {
            return medicalRecordPages.get(0);
        }
    }



    @Override
    public List<RegistrationInfo> getDePartMentPatient(int dePartMent_id, String today) {
        List<RegistrationInfo> registrationInfo = null;
        try {
            System.out.println(dePartMent_id + today);

            RegistrationInfoExample ex = new RegistrationInfoExample();
            RegistrationInfoExample.Criteria c = ex.createCriteria();
            c.andStateEqualTo("1");
            c.andDepartmentNoEqualTo(dePartMent_id);

            c.andCreateTimeBetween(DateUtils.getSqlDate(today + " 00:00:00"), DateUtils.getSqlDate(DateUtils.getDate()));
            registrationInfo = reginstrMapper.selectByExample(ex);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return registrationInfo;
    }

    /**
     * @return void
     * @Description 上传模板
     * @Date 11:22 2019/6/14
     * @Param [mrpTemplate]
     **/
    @Override
    public void postMRPTemplate(MedicalRecordPageTemplate mrpTemplate, List<Diagnosi> diagnosiList) {
        if (diagnosiList.size() == 0) {
            mrpTemplate.setDiagnosiNos("");
            mrpTeplateMapper.insert(mrpTemplate);
        } else {
            //把dianosiList插入到数据库中并且返回id
            StringBuilder sb = new StringBuilder();
            for (Diagnosi d : diagnosiList) {
                int id = diagnosiMapper.insert(d);
                sb.append(d.getId() + "|");
            }
            System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
            mrpTemplate.setDiagnosiNos(sb.toString().substring(0, sb.toString().length() - 1));
            mrpTeplateMapper.insert(mrpTemplate);
        }
    }

    @Override
    public List<MedicalRecordPageTemplate> getMRPDePartMentTmplate(int doctorDePartMentID) {

        MedicalRecordPageTemplateExample ex = new MedicalRecordPageTemplateExample();
        MedicalRecordPageTemplateExample.Criteria c = ex.createCriteria();

        c.andStateNotEqualTo("1");
        c.andDepartmentNoEqualTo(doctorDePartMentID);
        List<MedicalRecordPageTemplate> medicalRecordPageTemplates = mrpTeplateMapper.selectByExample(ex);

        return medicalRecordPageTemplates;
    }

    @Override
    public List<MedicalRecordPageTemplate> getMRPMyTemplate(int doctorID) {
        //sql
        MedicalRecordPageTemplateExample ex = new MedicalRecordPageTemplateExample();
        MedicalRecordPageTemplateExample.Criteria c = ex.createCriteria();
        c.andOutpatientDoctorNoEqualTo(doctorID);
        List<MedicalRecordPageTemplate> medicalRecordPageTemplates = mrpTeplateMapper.selectByExample(ex);
        return medicalRecordPageTemplates;
    }

    @Override
    public MedicalRecordPageTemplate getMRPTmplateByID(int id) {
        //通过模板id获得模板

        //none 不需要做
        return null;
    }

    @Override
    public List<MedicalRecordPageTemplate> getMRPTmplateByDoctorID(int doctorID) {

        MedicalRecordPageTemplateExample ex = new MedicalRecordPageTemplateExample();
        MedicalRecordPageTemplateExample.Criteria c = ex.createCriteria();
        c.andOutpatientDoctorNoEqualTo(doctorID);
        List<MedicalRecordPageTemplate> medicalRecordPageTemplates = mrpTeplateMapper.selectByExample(ex);
        return medicalRecordPageTemplates;
    }

    @Override
    public List<Disease> getDisease(String code, String name) {
        DiseaseExample ex = new DiseaseExample();

        DiseaseExample.Criteria c = ex.createCriteria();
        if (code != null && !code.trim().equals("")) {
            c.andDiseaseCodeLike("%" + code + "%");
        } else {
            c.andDiseaseNameLike("%" + name + "%");
        }
        //select * from user where code like "%v%"
        List<Disease> diseases = diseaseMapper.selectByExample(ex);
        return diseases;
    }

    @Override
    public void postUsedDiagnosi(UsedDiagnosi dia) {
        //新增加常用诊断
        usedDiagnosiMapper.insert(dia);
    }

    @Override
    public List<UsedDiagnosi> getUsedDiagnosi(int doctorID) {
        UsedDiagnosiExample ex = new UsedDiagnosiExample();
        UsedDiagnosiExample.Criteria c = ex.createCriteria();
        c.andDoctorNoEqualTo(doctorID);
        List<UsedDiagnosi> diseases = usedDiagnosiMapper.selectByExample(ex);
        return diseases;

    }
//暂存
    @Override
    public void PutMedicalRecordPage(MedicalRecordPage mrp, List<Diagnosi> diagnosiList) {

        System.out.println("暂存的数据来了："+mrp.toString());
        if(mrp.getId() == null){
            //说明是新增加的
            if(diagnosiList == null){
                mrp.setDiagnosiNos("");
            } else{
                StringBuilder sb = new StringBuilder();
                for (Diagnosi d : diagnosiList) {
                    diagnosiMapper.insert(d);
                    sb.append(d.getId() + "|");
                }
                mrp.setDiagnosiNos(sb.toString().substring(0, sb.toString().length() - 1));
            }
            medicalRecordPageMapper.insert(mrp);
        } else {
            //也就是更新数据
            //但是这里有一个问题就是？不能重新insert之前已经insert过的诊断，那么就需要判断那些是没有insert过的数据即可
            if(diagnosiList == null){
                mrp.setDiagnosiNos("");
            }else {

                StringBuilder sb = new StringBuilder();
                if (!mrp.getDiagnosiNos().equals("")) {
                    sb.append(mrp.getDiagnosiNos() + "|");
                }
                for (Diagnosi d : diagnosiList) {
                    if (d.getId() == null) {
                        diagnosiMapper.insert(d);
                        sb.append(d.getId() + "|");
                    }
                }

                mrp.setDiagnosiNos(sb.toString().substring(0, sb.toString().length() - 1));
            }
            medicalRecordPageMapper.updateByPrimaryKey(mrp);
        }

    }
    @Override
    public void PutMedicalRecordPageEnd(MedicalRecordPage mrp, List<Diagnosi> diagnosiList) {
        this.PutMedicalRecordPage(mrp,diagnosiList);
        //然后再通过mrp
        MedicalRecordPageExample ex =new MedicalRecordPageExample();
        MedicalRecordPageExample.Criteria c = ex.createCriteria();
        c.andMedicalRecordEqualTo(mrp.getMedicalRecord());
        List<MedicalRecordPage> medicalRecordPages = medicalRecordPageMapper.selectByExample(ex);
        MedicalRecordPage m = medicalRecordPages.get(0);
        m.setState("2");
        medicalRecordPageMapper.updateByPrimaryKey(m);
        RegistrationInfo registrationInfo = reginstrMapper.selectByPrimaryKey(m.getRegistrationInfo());
        registrationInfo.setIsSeenDocator("2");
        reginstrMapper.updateByPrimaryKey(registrationInfo);
    }

    @Override
    public void surePatientOkPut(String infoId) {
        RegistrationInfo registrationInfo = reginstrMapper.selectByPrimaryKey(Integer.parseInt(infoId));
        registrationInfo.setIsSeenDocator("3");
        reginstrMapper.updateByPrimaryKey(registrationInfo);
    }


    @Override
    public List<MedicalRecordPageTemplate> getMRPTmplateDePartMentID(int doctorDePartMentID) {
        MedicalRecordPageTemplateExample ex = new MedicalRecordPageTemplateExample();
        MedicalRecordPageTemplateExample.Criteria c = ex.createCriteria();
        c.andDepartmentNoEqualTo(doctorDePartMentID);
        List<MedicalRecordPageTemplate> medicalRecordPageTemplates = mrpTeplateMapper.selectByExample(ex);
        return medicalRecordPageTemplates;
    }

    @Override
    public List<MedicalRecordPageTemplate> getMRPTmplateAll() {
        MedicalRecordPageTemplateExample ex = new MedicalRecordPageTemplateExample();
        MedicalRecordPageTemplateExample.Criteria c = ex.createCriteria();
        List<MedicalRecordPageTemplate> medicalRecordPageTemplates = mrpTeplateMapper.selectByExample(ex);
        return medicalRecordPageTemplates;
    }

    @Override
    public List<RegistrationInfo> getSearchPatientByName(String searchName) {
        // 判断什么表
        RegistrationInfoExample ex = new RegistrationInfoExample();
        RegistrationInfoExample.Criteria c = ex.createCriteria();//创建查询条件的对象的构造器
        c.andStateEqualTo("1");//state = 1
        c.andPatientNameLike("%" + searchName + "%");//name like "%ss%"
        //select * from user where state = 1 and name like "%ss%"
        //ex == select * from user where state = 1 and name like "%ss%"
        List<RegistrationInfo> registrationInfos = reginstrMapper.selectByExample(ex);
        return registrationInfos;
    }



}
