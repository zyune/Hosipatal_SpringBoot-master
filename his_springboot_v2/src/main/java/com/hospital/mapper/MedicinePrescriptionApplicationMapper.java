package com.hospital.mapper;

import com.hospital.model.MedicinePrescriptionApplication;
import com.hospital.model.MedicinePrescriptionApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinePrescriptionApplicationMapper {
    long countByExample(MedicinePrescriptionApplicationExample example);

    int deleteByExample(MedicinePrescriptionApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicinePrescriptionApplication record);

    int insertSelective(MedicinePrescriptionApplication record);

    List<MedicinePrescriptionApplication> selectByExample(MedicinePrescriptionApplicationExample example);

    MedicinePrescriptionApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicinePrescriptionApplication record, @Param("example") MedicinePrescriptionApplicationExample example);

    int updateByExample(@Param("record") MedicinePrescriptionApplication record, @Param("example") MedicinePrescriptionApplicationExample example);

    int updateByPrimaryKeySelective(MedicinePrescriptionApplication record);

    int updateByPrimaryKey(MedicinePrescriptionApplication record);
}