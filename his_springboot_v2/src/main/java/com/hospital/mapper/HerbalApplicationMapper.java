package com.hospital.mapper;

import com.hospital.model.HerbalApplication;
import com.hospital.model.HerbalApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbalApplicationMapper {
    long countByExample(HerbalApplicationExample example);

    int deleteByExample(HerbalApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HerbalApplication record);

    int insertSelective(HerbalApplication record);

    List<HerbalApplication> selectByExample(HerbalApplicationExample example);

    HerbalApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HerbalApplication record, @Param("example") HerbalApplicationExample example);

    int updateByExample(@Param("record") HerbalApplication record, @Param("example") HerbalApplicationExample example);

    int updateByPrimaryKeySelective(HerbalApplication record);

    int updateByPrimaryKey(HerbalApplication record);
}