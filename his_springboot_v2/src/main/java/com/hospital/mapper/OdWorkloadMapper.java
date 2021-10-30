package com.hospital.mapper;

import com.hospital.model.OdWorkload;
import com.hospital.model.OdWorkloadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OdWorkloadMapper {
    long countByExample(OdWorkloadExample example);

    int deleteByExample(OdWorkloadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OdWorkload record);

    int insertSelective(OdWorkload record);

    List<OdWorkload> selectByExample(OdWorkloadExample example);

    OdWorkload selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OdWorkload record, @Param("example") OdWorkloadExample example);

    int updateByExample(@Param("record") OdWorkload record, @Param("example") OdWorkloadExample example);

    int updateByPrimaryKeySelective(OdWorkload record);

    int updateByPrimaryKey(OdWorkload record);
}