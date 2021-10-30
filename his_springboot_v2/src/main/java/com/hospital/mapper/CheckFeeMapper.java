package com.hospital.mapper;

import com.hospital.model.CheckFee;
import com.hospital.model.CheckFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckFeeMapper {
    long countByExample(CheckFeeExample example);

    int deleteByExample(CheckFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckFee record);

    int insertSelective(CheckFee record);

    List<CheckFee> selectByExample(CheckFeeExample example);

    CheckFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckFee record, @Param("example") CheckFeeExample example);

    int updateByExample(@Param("record") CheckFee record, @Param("example") CheckFeeExample example);

    int updateByPrimaryKeySelective(CheckFee record);

    int updateByPrimaryKey(CheckFee record);
}