package com.hospital.service.sf;

import com.hospital.model.DailyDetail;
import com.hospital.model.DailySettlement;

import java.util.Date;
import java.util.List;

public interface SF_DailySettlementService {
    List<DailySettlement> listDailySettlement();

    List<DailyDetail> listDailyDetailByRegistrarNo(Integer dailySettlementNo);

    void listDailyDetailByRegistrar(Date startDate, Date endDate, String id);
}
