package com.hospital.mapper;

import com.hospital.model.CheckImg;
import com.hospital.model.CheckImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckImgMapper {
    long countByExample(CheckImgExample example);

    int deleteByExample(CheckImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckImg record);

    int insertSelective(CheckImg record);

    List<CheckImg> selectByExample(CheckImgExample example);

    CheckImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckImg record, @Param("example") CheckImgExample example);

    int updateByExample(@Param("record") CheckImg record, @Param("example") CheckImgExample example);

    int updateByPrimaryKeySelective(CheckImg record);

    int updateByPrimaryKey(CheckImg record);
}