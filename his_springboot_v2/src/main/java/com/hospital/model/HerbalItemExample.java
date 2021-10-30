package com.hospital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HerbalItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HerbalItemExample() {
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

        public Criteria andDrugsNoIsNull() {
            addCriterion("drugs_no is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNoIsNotNull() {
            addCriterion("drugs_no is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNoEqualTo(Integer value) {
            addCriterion("drugs_no =", value, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoNotEqualTo(Integer value) {
            addCriterion("drugs_no <>", value, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoGreaterThan(Integer value) {
            addCriterion("drugs_no >", value, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugs_no >=", value, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoLessThan(Integer value) {
            addCriterion("drugs_no <", value, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoLessThanOrEqualTo(Integer value) {
            addCriterion("drugs_no <=", value, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoIn(List<Integer> values) {
            addCriterion("drugs_no in", values, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoNotIn(List<Integer> values) {
            addCriterion("drugs_no not in", values, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoBetween(Integer value1, Integer value2) {
            addCriterion("drugs_no between", value1, value2, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNoNotBetween(Integer value1, Integer value2) {
            addCriterion("drugs_no not between", value1, value2, "drugsNo");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNull() {
            addCriterion("drugs_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNotNull() {
            addCriterion("drugs_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameEqualTo(String value) {
            addCriterion("drugs_name =", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotEqualTo(String value) {
            addCriterion("drugs_name <>", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThan(String value) {
            addCriterion("drugs_name >", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_name >=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThan(String value) {
            addCriterion("drugs_name <", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThanOrEqualTo(String value) {
            addCriterion("drugs_name <=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLike(String value) {
            addCriterion("drugs_name like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotLike(String value) {
            addCriterion("drugs_name not like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIn(List<String> values) {
            addCriterion("drugs_name in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotIn(List<String> values) {
            addCriterion("drugs_name not in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameBetween(String value1, String value2) {
            addCriterion("drugs_name between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotBetween(String value1, String value2) {
            addCriterion("drugs_name not between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNull() {
            addCriterion("drugs_format is null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNotNull() {
            addCriterion("drugs_format is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatEqualTo(String value) {
            addCriterion("drugs_format =", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotEqualTo(String value) {
            addCriterion("drugs_format <>", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThan(String value) {
            addCriterion("drugs_format >", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_format >=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThan(String value) {
            addCriterion("drugs_format <", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThanOrEqualTo(String value) {
            addCriterion("drugs_format <=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLike(String value) {
            addCriterion("drugs_format like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotLike(String value) {
            addCriterion("drugs_format not like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIn(List<String> values) {
            addCriterion("drugs_format in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotIn(List<String> values) {
            addCriterion("drugs_format not in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatBetween(String value1, String value2) {
            addCriterion("drugs_format between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotBetween(String value1, String value2) {
            addCriterion("drugs_format not between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNull() {
            addCriterion("drugs_price is null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNotNull() {
            addCriterion("drugs_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceEqualTo(Double value) {
            addCriterion("drugs_price =", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotEqualTo(Double value) {
            addCriterion("drugs_price <>", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThan(Double value) {
            addCriterion("drugs_price >", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("drugs_price >=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThan(Double value) {
            addCriterion("drugs_price <", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThanOrEqualTo(Double value) {
            addCriterion("drugs_price <=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIn(List<Double> values) {
            addCriterion("drugs_price in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotIn(List<Double> values) {
            addCriterion("drugs_price not in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceBetween(Double value1, Double value2) {
            addCriterion("drugs_price between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotBetween(Double value1, Double value2) {
            addCriterion("drugs_price not between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayIsNull() {
            addCriterion("drugs_use_way is null");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayIsNotNull() {
            addCriterion("drugs_use_way is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayEqualTo(String value) {
            addCriterion("drugs_use_way =", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayNotEqualTo(String value) {
            addCriterion("drugs_use_way <>", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayGreaterThan(String value) {
            addCriterion("drugs_use_way >", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_use_way >=", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayLessThan(String value) {
            addCriterion("drugs_use_way <", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayLessThanOrEqualTo(String value) {
            addCriterion("drugs_use_way <=", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayLike(String value) {
            addCriterion("drugs_use_way like", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayNotLike(String value) {
            addCriterion("drugs_use_way not like", value, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayIn(List<String> values) {
            addCriterion("drugs_use_way in", values, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayNotIn(List<String> values) {
            addCriterion("drugs_use_way not in", values, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayBetween(String value1, String value2) {
            addCriterion("drugs_use_way between", value1, value2, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsUseWayNotBetween(String value1, String value2) {
            addCriterion("drugs_use_way not between", value1, value2, "drugsUseWay");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitIsNull() {
            addCriterion("drugs_nuit is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitIsNotNull() {
            addCriterion("drugs_nuit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitEqualTo(String value) {
            addCriterion("drugs_nuit =", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitNotEqualTo(String value) {
            addCriterion("drugs_nuit <>", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitGreaterThan(String value) {
            addCriterion("drugs_nuit >", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_nuit >=", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitLessThan(String value) {
            addCriterion("drugs_nuit <", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitLessThanOrEqualTo(String value) {
            addCriterion("drugs_nuit <=", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitLike(String value) {
            addCriterion("drugs_nuit like", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitNotLike(String value) {
            addCriterion("drugs_nuit not like", value, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitIn(List<String> values) {
            addCriterion("drugs_nuit in", values, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitNotIn(List<String> values) {
            addCriterion("drugs_nuit not in", values, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitBetween(String value1, String value2) {
            addCriterion("drugs_nuit between", value1, value2, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNuitNotBetween(String value1, String value2) {
            addCriterion("drugs_nuit not between", value1, value2, "drugsNuit");
            return (Criteria) this;
        }

        public Criteria andDrugsNumIsNull() {
            addCriterion("drugs_num is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNumIsNotNull() {
            addCriterion("drugs_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNumEqualTo(BigDecimal value) {
            addCriterion("drugs_num =", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumNotEqualTo(BigDecimal value) {
            addCriterion("drugs_num <>", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumGreaterThan(BigDecimal value) {
            addCriterion("drugs_num >", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugs_num >=", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumLessThan(BigDecimal value) {
            addCriterion("drugs_num <", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugs_num <=", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumIn(List<BigDecimal> values) {
            addCriterion("drugs_num in", values, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumNotIn(List<BigDecimal> values) {
            addCriterion("drugs_num not in", values, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugs_num between", value1, value2, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugs_num not between", value1, value2, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceIsNull() {
            addCriterion("drugs_total_price is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceIsNotNull() {
            addCriterion("drugs_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceEqualTo(Double value) {
            addCriterion("drugs_total_price =", value, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceNotEqualTo(Double value) {
            addCriterion("drugs_total_price <>", value, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceGreaterThan(Double value) {
            addCriterion("drugs_total_price >", value, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("drugs_total_price >=", value, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceLessThan(Double value) {
            addCriterion("drugs_total_price <", value, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("drugs_total_price <=", value, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceIn(List<Double> values) {
            addCriterion("drugs_total_price in", values, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceNotIn(List<Double> values) {
            addCriterion("drugs_total_price not in", values, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceBetween(Double value1, Double value2) {
            addCriterion("drugs_total_price between", value1, value2, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("drugs_total_price not between", value1, value2, "drugsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUseWarnIsNull() {
            addCriterion("use_warn is null");
            return (Criteria) this;
        }

        public Criteria andUseWarnIsNotNull() {
            addCriterion("use_warn is not null");
            return (Criteria) this;
        }

        public Criteria andUseWarnEqualTo(String value) {
            addCriterion("use_warn =", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnNotEqualTo(String value) {
            addCriterion("use_warn <>", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnGreaterThan(String value) {
            addCriterion("use_warn >", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnGreaterThanOrEqualTo(String value) {
            addCriterion("use_warn >=", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnLessThan(String value) {
            addCriterion("use_warn <", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnLessThanOrEqualTo(String value) {
            addCriterion("use_warn <=", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnLike(String value) {
            addCriterion("use_warn like", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnNotLike(String value) {
            addCriterion("use_warn not like", value, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnIn(List<String> values) {
            addCriterion("use_warn in", values, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnNotIn(List<String> values) {
            addCriterion("use_warn not in", values, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnBetween(String value1, String value2) {
            addCriterion("use_warn between", value1, value2, "useWarn");
            return (Criteria) this;
        }

        public Criteria andUseWarnNotBetween(String value1, String value2) {
            addCriterion("use_warn not between", value1, value2, "useWarn");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNull() {
            addCriterion("handle_state is null");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNotNull() {
            addCriterion("handle_state is not null");
            return (Criteria) this;
        }

        public Criteria andHandleStateEqualTo(String value) {
            addCriterion("handle_state =", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotEqualTo(String value) {
            addCriterion("handle_state <>", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThan(String value) {
            addCriterion("handle_state >", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThanOrEqualTo(String value) {
            addCriterion("handle_state >=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThan(String value) {
            addCriterion("handle_state <", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThanOrEqualTo(String value) {
            addCriterion("handle_state <=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLike(String value) {
            addCriterion("handle_state like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotLike(String value) {
            addCriterion("handle_state not like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateIn(List<String> values) {
            addCriterion("handle_state in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotIn(List<String> values) {
            addCriterion("handle_state not in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateBetween(String value1, String value2) {
            addCriterion("handle_state between", value1, value2, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotBetween(String value1, String value2) {
            addCriterion("handle_state not between", value1, value2, "handleState");
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