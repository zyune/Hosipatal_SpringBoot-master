package com.hospital.mapper;

import com.hospital.model.PatientFeeDetail;
import com.hospital.model.PatientFeeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientFeeDetailMapper {
    long countByExample(PatientFeeDetailExample example);

    int deleteByExample(PatientFeeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatientFeeDetail record);

    int insertSelective(PatientFeeDetail record);

    List<PatientFeeDetail> selectByExample(PatientFeeDetailExample example);

    PatientFeeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatientFeeDetail record, @Param("example") PatientFeeDetailExample example);

    int updateByExample(@Param("record") PatientFeeDetail record, @Param("example") PatientFeeDetailExample example);

    int updateByPrimaryKeySelective(PatientFeeDetail record);

    int updateByPrimaryKey(PatientFeeDetail record);
}