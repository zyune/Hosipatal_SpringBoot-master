package com.hospital.service.sf;

import com.hospital.model.CheckApplication;
import com.hospital.model.CheckFee;
import com.hospital.model.od.*;

import java.util.List;

public interface SF_CheckApplicationService {
    List<CheckApplication> listCheck();
    List<CheckApplication> listPatientName(String patientName);
    void addCheckFee(CheckFee checkFee);

//检查收费
    List<CheckFee> listAllCheckFee(String type);

    List<CheckFee> listCheckFeeByPatientName(String patientName, String type);

}
