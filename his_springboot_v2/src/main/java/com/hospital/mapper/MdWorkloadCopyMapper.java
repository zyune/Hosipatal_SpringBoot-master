package com.hospital.mapper;

import com.hospital.model.MdWorkloadCopy;
import com.hospital.model.MdWorkloadCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdWorkloadCopyMapper {
    long countByExample(MdWorkloadCopyExample example);

    int deleteByExample(MdWorkloadCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MdWorkloadCopy record);

    int insertSelective(MdWorkloadCopy record);

    List<MdWorkloadCopy> selectByExample(MdWorkloadCopyExample example);

    MdWorkloadCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MdWorkloadCopy record, @Param("example") MdWorkloadCopyExample example);

    int updateByExample(@Param("record") MdWorkloadCopy record, @Param("example") MdWorkloadCopyExample example);

    int updateByPrimaryKeySelective(MdWorkloadCopy record);

    int updateByPrimaryKey(MdWorkloadCopy record);
}