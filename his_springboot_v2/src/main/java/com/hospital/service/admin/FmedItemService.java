package com.hospital.service.admin;


import com.hospital.model.FmedItem;
import com.hospital.model.MedicinePrescriptionFee;

import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/
public interface FmedItemService {

    List<FmedItem> findAll();
    void addFmeditem(FmedItem fmedItem);
    void updataFmeditem(FmedItem fmedItem);
}
