package com.hospital.mapper;

import com.hospital.model.MedicalRecordPage;
import com.hospital.model.MedicalRecordPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalRecordPageMapper {
    long countByExample(MedicalRecordPageExample example);

    int deleteByExample(MedicalRecordPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecordPage record);

    int insertSelective(MedicalRecordPage record);

    List<MedicalRecordPage> selectByExample(MedicalRecordPageExample example);

    MedicalRecordPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalRecordPage record, @Param("example") MedicalRecordPageExample example);

    int updateByExample(@Param("record") MedicalRecordPage record, @Param("example") MedicalRecordPageExample example);

    int updateByPrimaryKeySelective(MedicalRecordPage record);

    int updateByPrimaryKey(MedicalRecordPage record);
}