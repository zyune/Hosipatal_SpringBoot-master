package com.hospital.service.md;

import com.hospital.model.Drugs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface Drugs_Service {
    public List<Drugs> getAllDrugs();


    public  void addDrug(Drugs drug);

    public void deleteDrugByCode(String drugCode);


    public  Map<String, String> getDrugByCode(String drugCode);

    public void changeDrug(Drugs drugs);

    public List<Drugs> getDrugByCode1(String drugCode);
}

