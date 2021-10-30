package com.hospital.mapper;

import com.hospital.model.CheckStack;
import com.hospital.model.CheckStackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckStackMapper {
    long countByExample(CheckStackExample example);

    int deleteByExample(CheckStackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckStack record);

    int insertSelective(CheckStack record);

    List<CheckStack> selectByExample(CheckStackExample example);

    CheckStack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckStack record, @Param("example") CheckStackExample example);

    int updateByExample(@Param("record") CheckStack record, @Param("example") CheckStackExample example);

    int updateByPrimaryKeySelective(CheckStack record);

    int updateByPrimaryKey(CheckStack record);
}