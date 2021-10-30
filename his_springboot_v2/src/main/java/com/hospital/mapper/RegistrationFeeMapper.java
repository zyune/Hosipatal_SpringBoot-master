package com.hospital.mapper;

import com.hospital.model.RegistrationFee;
import com.hospital.model.RegistrationFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationFeeMapper {
    long countByExample(RegistrationFeeExample example);

    int deleteByExample(RegistrationFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegistrationFee record);

    int insertSelective(RegistrationFee record);

    List<RegistrationFee> selectByExample(RegistrationFeeExample example);

    RegistrationFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegistrationFee record, @Param("example") RegistrationFeeExample example);

    int updateByExample(@Param("record") RegistrationFee record, @Param("example") RegistrationFeeExample example);

    int updateByPrimaryKeySelective(RegistrationFee record);

    int updateByPrimaryKey(RegistrationFee record);
}