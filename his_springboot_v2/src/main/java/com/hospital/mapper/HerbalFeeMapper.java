package com.hospital.mapper;

import com.hospital.model.HerbalFee;
import com.hospital.model.HerbalFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbalFeeMapper {
    long countByExample(HerbalFeeExample example);

    int deleteByExample(HerbalFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HerbalFee record);

    int insertSelective(HerbalFee record);

    List<HerbalFee> selectByExample(HerbalFeeExample example);

    HerbalFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HerbalFee record, @Param("example") HerbalFeeExample example);

    int updateByExample(@Param("record") HerbalFee record, @Param("example") HerbalFeeExample example);

    int updateByPrimaryKeySelective(HerbalFee record);

    int updateByPrimaryKey(HerbalFee record);
}