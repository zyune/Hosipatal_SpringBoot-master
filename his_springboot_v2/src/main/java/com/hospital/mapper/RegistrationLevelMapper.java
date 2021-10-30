package com.hospital.mapper;

import com.hospital.model.RegistrationLevel;
import com.hospital.model.RegistrationLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationLevelMapper {
    long countByExample(RegistrationLevelExample example);

    int deleteByExample(RegistrationLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegistrationLevel record);

    int insertSelective(RegistrationLevel record);

    List<RegistrationLevel> selectByExample(RegistrationLevelExample example);

    RegistrationLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegistrationLevel record, @Param("example") RegistrationLevelExample example);

    int updateByExample(@Param("record") RegistrationLevel record, @Param("example") RegistrationLevelExample example);

    int updateByPrimaryKeySelective(RegistrationLevel record);

    int updateByPrimaryKey(RegistrationLevel record);
}