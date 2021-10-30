package com.hospital.service.md.lmp;

import com.hospital.mapper.DrugsMapper;
import com.hospital.model.Drugs;
import com.hospital.model.DrugsExample;
import com.hospital.service.md.Drugs_Service;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DrugsServiceLmp implements Drugs_Service {
    @Resource
    DrugsMapper drugsMapper;
    @Override
    public List<Drugs> getAllDrugs(){

        DrugsExample ex = new DrugsExample();
        DrugsExample.Criteria c = ex.createCriteria();
        List<Drugs> drugs = drugsMapper.selectByExample(ex);
        return drugs;
    }

    @Override
    public void addDrug(Drugs drug) {
        drugsMapper.insert(drug);
    }

    @Override
    public void deleteDrugByCode(String drugCode) {
        DrugsExample ex =new DrugsExample();
        DrugsExample.Criteria c =ex.createCriteria();
        c.andDrugsCodeEqualTo(drugCode);
        drugsMapper.deleteByExample(ex);
    }

    @Override
    public Map<String, String> getDrugByCode(String drugCode) {
        DrugsExample ex =new DrugsExample();
        DrugsExample.Criteria c =ex.createCriteria();
        c.andDrugsCodeEqualTo(drugCode);
        List<Drugs> drugs=drugsMapper.selectByExample(ex);
        Map<String, String> s = new HashMap<>();
        s.put("id",""+drugs.get(0).getId());
        s.put("drugsCode",""+drugs.get(0).getDrugsCode());
        s.put("drugsName",""+drugs.get(0).getDrugsName());
        s.put("drugsFormat",""+drugs.get(0).getDrugsFormat());
        s.put("drugsUnit",""+drugs.get(0).getDrugsUnit());
        s.put("manufacturer",""+drugs.get(0).getManufacturer());
        s.put("drugsDosage",""+drugs.get(0).getDrugsDosage());
        s.put("drugsType",""+drugs.get(0).getDrugsType());
        s.put("drugsPrice",""+drugs.get(0).getDrugsPrice());
        s.put("mnemonicCode",""+drugs.get(0).getMnemonicCode());
        s.put("creationdate",""+drugs.get(0).getCreationdate());
        return s;
    }

    @Override
    public void changeDrug(Drugs drugs) {
       DrugsExample ex=new DrugsExample();
       DrugsExample.Criteria c=ex.createCriteria();
       c.andDrugsCodeEqualTo(drugs.getDrugsCode());
      Drugs drugs1=drugsMapper.selectByPrimaryKey(drugs.getId());
        drugs1.setDrugsCode(drugs.getDrugsCode());
        drugs1.setDrugsName(drugs.getDrugsName());
        drugs1.setDrugsDosage(drugs.getDrugsDosage());
        drugs1.setDrugsFormat(drugs.getDrugsFormat());
        drugs1.setDrugsPrice(drugs.getDrugsPrice());
        drugs1.setDrugsType(drugs.getDrugsType());
        drugs1.setDrugsUnit(drugs.getDrugsUnit());
        drugs1.setCreationdate(drugs.getCreationdate());
        drugs1.setManufacturer(drugs.getManufacturer());
        drugs1.setMnemonicCode(drugs.getMnemonicCode());
        drugsMapper.updateByExample(drugs1,ex);
    }

    @Override
    public List<Drugs> getDrugByCode1(String drugCode) {
        DrugsExample ex =new DrugsExample();
        DrugsExample.Criteria c =ex.createCriteria();
        c.andDrugsCodeEqualTo(drugCode);
        List<Drugs> drugs=drugsMapper.selectByExample(ex);
        return drugs;
    }


}
