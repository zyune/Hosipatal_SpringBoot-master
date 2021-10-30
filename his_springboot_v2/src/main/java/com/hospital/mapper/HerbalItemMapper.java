package com.hospital.mapper;

import com.hospital.model.HerbalItem;
import com.hospital.model.HerbalItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbalItemMapper {
    long countByExample(HerbalItemExample example);

    int deleteByExample(HerbalItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HerbalItem record);

    int insertSelective(HerbalItem record);

    List<HerbalItem> selectByExample(HerbalItemExample example);

    HerbalItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HerbalItem record, @Param("example") HerbalItemExample example);

    int updateByExample(@Param("record") HerbalItem record, @Param("example") HerbalItemExample example);

    int updateByPrimaryKeySelective(HerbalItem record);

    int updateByPrimaryKey(HerbalItem record);
}