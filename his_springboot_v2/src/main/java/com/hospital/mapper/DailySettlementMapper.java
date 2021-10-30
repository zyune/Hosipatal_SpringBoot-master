package com.hospital.mapper;

import com.hospital.model.DailySettlement;
import com.hospital.model.DailySettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailySettlementMapper {
    long countByExample(DailySettlementExample example);

    int deleteByExample(DailySettlementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DailySettlement record);

    int insertSelective(DailySettlement record);

    List<DailySettlement> selectByExample(DailySettlementExample example);

    DailySettlement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DailySettlement record, @Param("example") DailySettlementExample example);

    int updateByExample(@Param("record") DailySettlement record, @Param("example") DailySettlementExample example);

    int updateByPrimaryKeySelective(DailySettlement record);

    int updateByPrimaryKey(DailySettlement record);
}