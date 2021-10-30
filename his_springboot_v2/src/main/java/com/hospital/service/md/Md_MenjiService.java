package com.hospital.service.md;

import com.hospital.model.MedicinePrescriptionApplication;
import com.hospital.model.MedicinePrescriptionDrugsCopy1;

import java.util.List;
import java.util.Map;

public interface Md_MenjiService {
    public List<MedicinePrescriptionApplication> getWaitFyPatient();

    Map<String, String> getPatientAgeAndSex(String blh);



    public List<MedicinePrescriptionApplication> getDrugs(String blh);

   public Map<String, String> getPatientOtherInfo(String blh);

    public List<MedicinePrescriptionDrugsCopy1> getDrugsDetail(String cfh);

    public void putDistState(String cfh);

    public List<MedicinePrescriptionApplication> getWaitFyPatientById(String medicalRecord);
}
