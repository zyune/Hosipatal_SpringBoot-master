package com.hospital.service.sf;

import com.hospital.model.Drugs;
import com.hospital.model.FmedItem;

import java.math.BigDecimal;
import java.util.List;

public interface SF_DrugsService {
    List<Drugs> listDrugs();
    List<Drugs> listDrugsByDrugsName(String drugsName);


    List<FmedItem> listFmedItem();


    List<FmedItem> listFmedItemByItemname(String itemname);

    void putDrugsUseDrugsPrice(Drugs drugs);

    List<Drugs> listDrugsByDrugsType(String drugsType);

    List<FmedItem> listFmedItemByRecordtype(Integer recordtype);

    void putFmedItemUseprice(FmedItem fmedItem);
}
