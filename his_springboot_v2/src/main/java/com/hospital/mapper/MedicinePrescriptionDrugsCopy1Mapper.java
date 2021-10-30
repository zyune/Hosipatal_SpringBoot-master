package com.hospital.mapper;

import com.hospital.model.MedicinePrescriptionDrugsCopy1;
import com.hospital.model.MedicinePrescriptionDrugsCopy1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinePrescriptionDrugsCopy1Mapper {
    long countByExample(MedicinePrescriptionDrugsCopy1Example example);

    int deleteByExample(MedicinePrescriptionDrugsCopy1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicinePrescriptionDrugsCopy1 record);

    int insertSelective(MedicinePrescriptionDrugsCopy1 record);

    List<MedicinePrescriptionDrugsCopy1> selectByExample(MedicinePrescriptionDrugsCopy1Example example);

    MedicinePrescriptionDrugsCopy1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicinePrescriptionDrugsCopy1 record, @Param("example") MedicinePrescriptionDrugsCopy1Example example);

    int updateByExample(@Param("record") MedicinePrescriptionDrugsCopy1 record, @Param("example") MedicinePrescriptionDrugsCopy1Example example);

    int updateByPrimaryKeySelective(MedicinePrescriptionDrugsCopy1 record);

    int updateByPrimaryKey(MedicinePrescriptionDrugsCopy1 record);
}