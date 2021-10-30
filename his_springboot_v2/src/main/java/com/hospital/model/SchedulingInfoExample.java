package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoIsNull() {
            addCriterion("scheduling_rule_no is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoIsNotNull() {
            addCriterion("scheduling_rule_no is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoEqualTo(Integer value) {
            addCriterion("scheduling_rule_no =", value, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoNotEqualTo(Integer value) {
            addCriterion("scheduling_rule_no <>", value, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoGreaterThan(Integer value) {
            addCriterion("scheduling_rule_no >", value, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduling_rule_no >=", value, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoLessThan(Integer value) {
            addCriterion("scheduling_rule_no <", value, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoLessThanOrEqualTo(Integer value) {
            addCriterion("scheduling_rule_no <=", value, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoIn(List<Integer> values) {
            addCriterion("scheduling_rule_no in", values, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoNotIn(List<Integer> values) {
            addCriterion("scheduling_rule_no not in", values, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_rule_no between", value1, value2, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_rule_no not between", value1, value2, "schedulingRuleNo");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateIsNull() {
            addCriterion("scheduling_date is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateIsNotNull() {
            addCriterion("scheduling_date is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateEqualTo(Date value) {
            addCriterionForJDBCDate("scheduling_date =", value, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("scheduling_date <>", value, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("scheduling_date >", value, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scheduling_date >=", value, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateLessThan(Date value) {
            addCriterionForJDBCDate("scheduling_date <", value, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scheduling_date <=", value, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateIn(List<Date> values) {
            addCriterionForJDBCDate("scheduling_date in", values, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("scheduling_date not in", values, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scheduling_date between", value1, value2, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scheduling_date not between", value1, value2, "schedulingDate");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIsNull() {
            addCriterion("department_no is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIsNotNull() {
            addCriterion("department_no is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoEqualTo(Integer value) {
            addCriterion("department_no =", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotEqualTo(Integer value) {
            addCriterion("department_no <>", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoGreaterThan(Integer value) {
            addCriterion("department_no >", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_no >=", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLessThan(Integer value) {
            addCriterion("department_no <", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLessThanOrEqualTo(Integer value) {
            addCriterion("department_no <=", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIn(List<Integer> values) {
            addCriterion("department_no in", values, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotIn(List<Integer> values) {
            addCriterion("department_no not in", values, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoBetween(Integer value1, Integer value2) {
            addCriterion("department_no between", value1, value2, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotBetween(Integer value1, Integer value2) {
            addCriterion("department_no not between", value1, value2, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andOdNoIsNull() {
            addCriterion("od_no is null");
            return (Criteria) this;
        }

        public Criteria andOdNoIsNotNull() {
            addCriterion("od_no is not null");
            return (Criteria) this;
        }

        public Criteria andOdNoEqualTo(Integer value) {
            addCriterion("od_no =", value, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoNotEqualTo(Integer value) {
            addCriterion("od_no <>", value, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoGreaterThan(Integer value) {
            addCriterion("od_no >", value, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("od_no >=", value, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoLessThan(Integer value) {
            addCriterion("od_no <", value, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoLessThanOrEqualTo(Integer value) {
            addCriterion("od_no <=", value, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoIn(List<Integer> values) {
            addCriterion("od_no in", values, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoNotIn(List<Integer> values) {
            addCriterion("od_no not in", values, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoBetween(Integer value1, Integer value2) {
            addCriterion("od_no between", value1, value2, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNoNotBetween(Integer value1, Integer value2) {
            addCriterion("od_no not between", value1, value2, "odNo");
            return (Criteria) this;
        }

        public Criteria andOdNameIsNull() {
            addCriterion("od_name is null");
            return (Criteria) this;
        }

        public Criteria andOdNameIsNotNull() {
            addCriterion("od_name is not null");
            return (Criteria) this;
        }

        public Criteria andOdNameEqualTo(String value) {
            addCriterion("od_name =", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameNotEqualTo(String value) {
            addCriterion("od_name <>", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameGreaterThan(String value) {
            addCriterion("od_name >", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameGreaterThanOrEqualTo(String value) {
            addCriterion("od_name >=", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameLessThan(String value) {
            addCriterion("od_name <", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameLessThanOrEqualTo(String value) {
            addCriterion("od_name <=", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameLike(String value) {
            addCriterion("od_name like", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameNotLike(String value) {
            addCriterion("od_name not like", value, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameIn(List<String> values) {
            addCriterion("od_name in", values, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameNotIn(List<String> values) {
            addCriterion("od_name not in", values, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameBetween(String value1, String value2) {
            addCriterion("od_name between", value1, value2, "odName");
            return (Criteria) this;
        }

        public Criteria andOdNameNotBetween(String value1, String value2) {
            addCriterion("od_name not between", value1, value2, "odName");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNull() {
            addCriterion("level_type is null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNotNull() {
            addCriterion("level_type is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeEqualTo(String value) {
            addCriterion("level_type =", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotEqualTo(String value) {
            addCriterion("level_type <>", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThan(String value) {
            addCriterion("level_type >", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("level_type >=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThan(String value) {
            addCriterion("level_type <", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThanOrEqualTo(String value) {
            addCriterion("level_type <=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLike(String value) {
            addCriterion("level_type like", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotLike(String value) {
            addCriterion("level_type not like", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIn(List<String> values) {
            addCriterion("level_type in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotIn(List<String> values) {
            addCriterion("level_type not in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeBetween(String value1, String value2) {
            addCriterion("level_type between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotBetween(String value1, String value2) {
            addCriterion("level_type not between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(String value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(String value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(String value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(String value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(String value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(String value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLike(String value) {
            addCriterion("day like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotLike(String value) {
            addCriterion("day not like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<String> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<String> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(String value1, String value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(String value1, String value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(Integer value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(Integer value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(Integer value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(Integer value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<Integer> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<Integer> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(Integer value1, Integer value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaIsNull() {
            addCriterion("left_quota is null");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaIsNotNull() {
            addCriterion("left_quota is not null");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaEqualTo(Integer value) {
            addCriterion("left_quota =", value, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaNotEqualTo(Integer value) {
            addCriterion("left_quota <>", value, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaGreaterThan(Integer value) {
            addCriterion("left_quota >", value, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_quota >=", value, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaLessThan(Integer value) {
            addCriterion("left_quota <", value, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("left_quota <=", value, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaIn(List<Integer> values) {
            addCriterion("left_quota in", values, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaNotIn(List<Integer> values) {
            addCriterion("left_quota not in", values, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaBetween(Integer value1, Integer value2) {
            addCriterion("left_quota between", value1, value2, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andLeftQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("left_quota not between", value1, value2, "leftQuota");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}