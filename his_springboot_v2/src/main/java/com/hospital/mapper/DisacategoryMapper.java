package com.hospital.mapper;

import com.hospital.model.Disacategory;
import com.hospital.model.DisacategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisacategoryMapper {
    long countByExample(DisacategoryExample example);

    int deleteByExample(DisacategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disacategory record);

    int insertSelective(Disacategory record);

    List<Disacategory> selectByExample(DisacategoryExample example);

    Disacategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Disacategory record, @Param("example") DisacategoryExample example);

    int updateByExample(@Param("record") Disacategory record, @Param("example") DisacategoryExample example);

    int updateByPrimaryKeySelective(Disacategory record);

    int updateByPrimaryKey(Disacategory record);
}