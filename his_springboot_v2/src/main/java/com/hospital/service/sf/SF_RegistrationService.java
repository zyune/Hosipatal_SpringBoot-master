package com.hospital.service.sf;

import com.github.pagehelper.PageInfo;
import com.hospital.model.RegistrationInfo;
import com.hospital.model.RegistrationLevel;

import java.util.List;

public interface SF_RegistrationService {

    void addRegistration(RegistrationInfo registrationInfo, String registrarName, int no);

    List<RegistrationInfo> getListRegistrationByPatientName(String patientNam);
    List<RegistrationInfo> listRegistration();
    List<RegistrationLevel> listRegistrationLevel();

    List<RegistrationInfo> getRegistrationByMedicalRecord(String medicalRecord);

    void putRegistrationInfoUseState(Integer id);
    //    void withDrawRegistration(Integer id);

}
