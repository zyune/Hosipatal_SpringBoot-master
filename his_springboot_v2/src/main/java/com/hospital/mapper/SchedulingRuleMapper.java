package com.hospital.mapper;

import com.hospital.model.SchedulingRule;
import com.hospital.model.SchedulingRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulingRuleMapper {
    long countByExample(SchedulingRuleExample example);

    int deleteByExample(SchedulingRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SchedulingRule record);

    int insertSelective(SchedulingRule record);

    List<SchedulingRule> selectByExample(SchedulingRuleExample example);

    SchedulingRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SchedulingRule record, @Param("example") SchedulingRuleExample example);

    int updateByExample(@Param("record") SchedulingRule record, @Param("example") SchedulingRuleExample example);

    int updateByPrimaryKeySelective(SchedulingRule record);

    int updateByPrimaryKey(SchedulingRule record);
}