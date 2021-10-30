package com.hospital.service.md;
import com.hospital.model.CheckApplication;
import com.hospital.model.CheckItem;
import com.hospital.model.CheckResult;

import java.util.List;
import java.util.Map;

public interface YJ_DisposeService {
    List<CheckApplication> getWaitYjPatient();

    Map<String, String> getPatientSexAndAge(String medicalRecord);

    Map<String, String> getPatientOtherInfo(String id);

    List<CheckItem> getCheckItem(String id);

    void putItemHandleState(String id);

    void postCheckResult(CheckResult checkResult);
}
