package com.hospital.service.md;

import com.hospital.model.CheckApplication;
import com.hospital.model.CheckItem;
import com.hospital.model.CheckResult;

import java.util.List;
import java.util.Map;

public interface YJ_CheckService {
    public List<CheckApplication> getWaitYjPatient();

    public Map<String, String> getPatientSexAndAge(String medicalRecord);

    public Map<String, String> getPatientOtherInfo(String id);

    public List<CheckItem> getCheckItem(String id);


    public void putItemHandleState(String id);

    public void postCheckResult(CheckResult checkResult);

    public List<CheckApplication> getWaitFyPatientById(String medicalRecord);

    public List<CheckApplication> getWaitFyPatientByName(String patientName);
}
