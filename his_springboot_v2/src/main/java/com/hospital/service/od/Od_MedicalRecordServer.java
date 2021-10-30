package com.hospital.service.od;

import com.hospital.model.*;

import java.util.List;

public interface Od_MedicalRecordServer {
    String test();

    List<RegistrationInfo> getWaitPatient(int od_id, String today);

    List<RegistrationInfo> getSeeEdPatient(int od_id, String today);

    MedicalRecordPage getMedicalRecordPageByPatientBLH(String blh);

    /**
     * @Description 该方法是暂存病历号,需要更换用户is_see_doctor的状态为2
     * @Date 14:45 2019/6/13
     * @Param [blh]
     * @return void
     **/

    List<RegistrationInfo> getDePartMentPatient(int dePartMent_id, String today);

    void postMRPTemplate(MedicalRecordPageTemplate mrpTemplate, List<Diagnosi> diagnosiList);

    List<MedicalRecordPageTemplate> getMRPDePartMentTmplate(int doctorDePartMentID);

    List<MedicalRecordPageTemplate> getMRPMyTemplate(int doctorID);

    MedicalRecordPageTemplate getMRPTmplateByID(int id);

    List<MedicalRecordPageTemplate> getMRPTmplateByDoctorID(int doctorID);

    List<Disease> getDisease(String code, String name);

    void postUsedDiagnosi(UsedDiagnosi dia);

    List<UsedDiagnosi> getUsedDiagnosi(int doctorID);

    void PutMedicalRecordPage(MedicalRecordPage mrp, List<Diagnosi> diagnosiList);

    List<MedicalRecordPageTemplate> getMRPTmplateDePartMentID(int doctorDePartMentID);

    List<MedicalRecordPageTemplate> getMRPTmplateAll();

    List<RegistrationInfo> getSearchPatientByName(String searchName);

    void PutMedicalRecordPageEnd(MedicalRecordPage mrp, List<Diagnosi> diagnosiList);

    void surePatientOkPut(String infoId);


    //需要对于以下的每一个方法名进行注释

}
