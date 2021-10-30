package com.hospital.mapper;

import com.hospital.model.MedicinePrescriptionFee;
import com.hospital.model.MedicinePrescriptionFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinePrescriptionFeeMapper {
    long countByExample(MedicinePrescriptionFeeExample example);

    int deleteByExample(MedicinePrescriptionFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicinePrescriptionFee record);

    int insertSelective(MedicinePrescriptionFee record);

    List<MedicinePrescriptionFee> selectByExample(MedicinePrescriptionFeeExample example);

    MedicinePrescriptionFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicinePrescriptionFee record, @Param("example") MedicinePrescriptionFeeExample example);

    int updateByExample(@Param("record") MedicinePrescriptionFee record, @Param("example") MedicinePrescriptionFeeExample example);

    int updateByPrimaryKeySelective(MedicinePrescriptionFee record);

    int updateByPrimaryKey(MedicinePrescriptionFee record);
}