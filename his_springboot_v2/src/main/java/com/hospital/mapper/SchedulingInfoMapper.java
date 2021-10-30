package com.hospital.mapper;

import com.hospital.model.SchedulingInfo;
import com.hospital.model.SchedulingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulingInfoMapper {
    long countByExample(SchedulingInfoExample example);

    int deleteByExample(SchedulingInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SchedulingInfo record);

    int insertSelective(SchedulingInfo record);

    List<SchedulingInfo> selectByExample(SchedulingInfoExample example);

    SchedulingInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SchedulingInfo record, @Param("example") SchedulingInfoExample example);

    int updateByExample(@Param("record") SchedulingInfo record, @Param("example") SchedulingInfoExample example);

    int updateByPrimaryKeySelective(SchedulingInfo record);

    int updateByPrimaryKey(SchedulingInfo record);
}