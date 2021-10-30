package com.hospital.mapper;

import com.hospital.model.DailyDetail;
import com.hospital.model.DailyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyDetailMapper {
    long countByExample(DailyDetailExample example);

    int deleteByExample(DailyDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DailyDetail record);

    int insertSelective(DailyDetail record);

    List<DailyDetail> selectByExample(DailyDetailExample example);

    DailyDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DailyDetail record, @Param("example") DailyDetailExample example);

    int updateByExample(@Param("record") DailyDetail record, @Param("example") DailyDetailExample example);

    int updateByPrimaryKeySelective(DailyDetail record);

    int updateByPrimaryKey(DailyDetail record);
}