package com.hospital.mapper;

import com.hospital.model.CheckApplication;
import com.hospital.model.CheckApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckApplicationMapper {
    long countByExample(CheckApplicationExample example);

    int deleteByExample(CheckApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckApplication record);

    int insertSelective(CheckApplication record);

    List<CheckApplication> selectByExample(CheckApplicationExample example);

    CheckApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckApplication record, @Param("example") CheckApplicationExample example);

    int updateByExample(@Param("record") CheckApplication record, @Param("example") CheckApplicationExample example);

    int updateByPrimaryKeySelective(CheckApplication record);

    int updateByPrimaryKey(CheckApplication record);
}