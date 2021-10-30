package com.hospital.mapper;

import com.hospital.model.Diagnosi;
import com.hospital.model.DiagnosiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiagnosiMapper {
    long countByExample(DiagnosiExample example);

    int deleteByExample(DiagnosiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Diagnosi record);

    int insertSelective(Diagnosi record);

    List<Diagnosi> selectByExample(DiagnosiExample example);

    Diagnosi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Diagnosi record, @Param("example") DiagnosiExample example);

    int updateByExample(@Param("record") Diagnosi record, @Param("example") DiagnosiExample example);

    int updateByPrimaryKeySelective(Diagnosi record);

    int updateByPrimaryKey(Diagnosi record);
}