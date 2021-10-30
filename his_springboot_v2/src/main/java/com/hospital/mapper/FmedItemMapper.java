package com.hospital.mapper;

import com.hospital.model.FmedItem;
import com.hospital.model.FmedItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmedItemMapper {
    long countByExample(FmedItemExample example);

    int deleteByExample(FmedItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FmedItem record);

    int insertSelective(FmedItem record);

    List<FmedItem> selectByExample(FmedItemExample example);

    FmedItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmedItem record, @Param("example") FmedItemExample example);

    int updateByExample(@Param("record") FmedItem record, @Param("example") FmedItemExample example);

    int updateByPrimaryKeySelective(FmedItem record);

    int updateByPrimaryKey(FmedItem record);
}