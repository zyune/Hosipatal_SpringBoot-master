package com.hospital.mapper;

import com.hospital.model.RegistrationInfo;
import com.hospital.model.RegistrationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationInfoMapper {
    long countByExample(RegistrationInfoExample example);

    int deleteByExample(RegistrationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegistrationInfo record);

    int insertSelective(RegistrationInfo record);

    List<RegistrationInfo> selectByExample(RegistrationInfoExample example);

    RegistrationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegistrationInfo record, @Param("example") RegistrationInfoExample example);

    int updateByExample(@Param("record") RegistrationInfo record, @Param("example") RegistrationInfoExample example);

    int updateByPrimaryKeySelective(RegistrationInfo record);

    int updateByPrimaryKey(RegistrationInfo record);
}