package com.hospital.mapper;

import com.hospital.model.UsedDiagnosi;
import com.hospital.model.UsedDiagnosiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsedDiagnosiMapper {
    long countByExample(UsedDiagnosiExample example);

    int deleteByExample(UsedDiagnosiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsedDiagnosi record);

    int insertSelective(UsedDiagnosi record);

    List<UsedDiagnosi> selectByExample(UsedDiagnosiExample example);

    UsedDiagnosi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsedDiagnosi record, @Param("example") UsedDiagnosiExample example);

    int updateByExample(@Param("record") UsedDiagnosi record, @Param("example") UsedDiagnosiExample example);

    int updateByPrimaryKeySelective(UsedDiagnosi record);

    int updateByPrimaryKey(UsedDiagnosi record);
}