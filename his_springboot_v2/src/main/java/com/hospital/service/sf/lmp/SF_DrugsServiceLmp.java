package com.hospital.service.sf.lmp;

import com.hospital.mapper.DrugsMapper;
import com.hospital.mapper.FmedItemMapper;
import com.hospital.model.Drugs;
import com.hospital.model.DrugsExample;
import com.hospital.model.FmedItem;
import com.hospital.model.FmedItemExample;
import com.hospital.service.sf.SF_DrugsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SF_DrugsServiceLmp implements SF_DrugsService {
    @Resource
    DrugsMapper drugsMapper;

    @Resource
    FmedItemMapper fmedItemMapper;

    public List<Drugs> listDrugs(){
        DrugsExample drugsExample = new DrugsExample();
        List<Drugs> drugs = drugsMapper.selectByExample (drugsExample);
        return drugs;

    }

    @Override
    public List<Drugs> listDrugsByDrugsName(String drugsName) {
        DrugsExample drugsExample = new DrugsExample ();
        DrugsExample.Criteria criteria = drugsExample.createCriteria ();
        criteria.andDrugsNameLike ("%"+drugsName+"%");
        List<Drugs> drugs = drugsMapper.selectByExample (drugsExample);
        return drugs;
    }

    @Override
    public List<FmedItem> listFmedItem() {
        FmedItemExample fmedItem = new FmedItemExample ();
        List<FmedItem> fmedItems = fmedItemMapper.selectByExample (fmedItem);
        return  fmedItems;


    }

    @Override
    public List<FmedItem> listFmedItemByItemname(String itemname) {
        FmedItemExample fmedItemExample = new FmedItemExample ();
        FmedItemExample.Criteria criteria = fmedItemExample.createCriteria ();
        criteria.andItemnameLike ("%"+itemname+"%");
        List<FmedItem> fmedItems = fmedItemMapper.selectByExample (fmedItemExample);
        return fmedItems;
    }

    @Override
    public void putDrugsUseDrugsPrice(Drugs drug) {

        drugsMapper.updateByPrimaryKey (drug);

    }

    @Override
    public List<Drugs> listDrugsByDrugsType(String drugsType) {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria ();
        criteria.andDrugsTypeEqualTo (drugsType);
        List<Drugs> drugs = drugsMapper.selectByExample (drugsExample);
        return  drugs;
    }

    @Override
    public  List<FmedItem> listFmedItemByRecordtype(Integer recordtype){
        FmedItemExample fmedItemExample = new FmedItemExample ();
        FmedItemExample.Criteria criteria = fmedItemExample.createCriteria ();
        criteria.andRecordtypeEqualTo (recordtype);
        List<FmedItem> fmedItems = fmedItemMapper.selectByExample (fmedItemExample);
        return fmedItems;
    }

    @Override
    public void putFmedItemUseprice(FmedItem fmedItem) {
        fmedItemMapper.updateByPrimaryKey (fmedItem);
    }
}
