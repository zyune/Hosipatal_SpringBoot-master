package com.hospital.mapper;

import com.hospital.model.MedicalRecordPageTemplate;
import com.hospital.model.MedicalRecordPageTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalRecordPageTemplateMapper {
    long countByExample(MedicalRecordPageTemplateExample example);

    int deleteByExample(MedicalRecordPageTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecordPageTemplate record);

    int insertSelective(MedicalRecordPageTemplate record);

    List<MedicalRecordPageTemplate> selectByExample(MedicalRecordPageTemplateExample example);

    MedicalRecordPageTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalRecordPageTemplate record, @Param("example") MedicalRecordPageTemplateExample example);

    int updateByExample(@Param("record") MedicalRecordPageTemplate record, @Param("example") MedicalRecordPageTemplateExample example);

    int updateByPrimaryKeySelective(MedicalRecordPageTemplate record);

    int updateByPrimaryKey(MedicalRecordPageTemplate record);
}