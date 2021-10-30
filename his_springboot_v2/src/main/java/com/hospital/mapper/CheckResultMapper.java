package com.hospital.mapper;

import com.hospital.model.CheckResult;
import com.hospital.model.CheckResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckResultMapper {
    long countByExample(CheckResultExample example);

    int deleteByExample(CheckResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckResult record);

    int insertSelective(CheckResult record);

    List<CheckResult> selectByExample(CheckResultExample example);

    CheckResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckResult record, @Param("example") CheckResultExample example);

    int updateByExample(@Param("record") CheckResult record, @Param("example") CheckResultExample example);

    int updateByPrimaryKeySelective(CheckResult record);

    int updateByPrimaryKey(CheckResult record);
}