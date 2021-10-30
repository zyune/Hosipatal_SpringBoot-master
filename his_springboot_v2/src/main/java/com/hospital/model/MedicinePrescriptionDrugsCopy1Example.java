package com.hospital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MedicinePrescriptionDrugsCopy1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicinePrescriptionDrugsCopy1Example() {
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

        public Criteria andDrugsUsageIsNull() {
            addCriterion("drugs_usage is null");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageIsNotNull() {
            addCriterion("drugs_usage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageEqualTo(String value) {
            addCriterion("drugs_usage =", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotEqualTo(String value) {
            addCriterion("drugs_usage <>", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageGreaterThan(String value) {
            addCriterion("drugs_usage >", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_usage >=", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageLessThan(String value) {
            addCriterion("drugs_usage <", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageLessThanOrEqualTo(String value) {
            addCriterion("drugs_usage <=", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageLike(String value) {
            addCriterion("drugs_usage like", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotLike(String value) {
            addCriterion("drugs_usage not like", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageIn(List<String> values) {
            addCriterion("drugs_usage in", values, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotIn(List<String> values) {
            addCriterion("drugs_usage not in", values, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageBetween(String value1, String value2) {
            addCriterion("drugs_usage between", value1, value2, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotBetween(String value1, String value2) {
            addCriterion("drugs_usage not between", value1, value2, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIsNull() {
            addCriterion("drugs_dosage is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIsNotNull() {
            addCriterion("drugs_dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageEqualTo(String value) {
            addCriterion("drugs_dosage =", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotEqualTo(String value) {
            addCriterion("drugs_dosage <>", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageGreaterThan(String value) {
            addCriterion("drugs_dosage >", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_dosage >=", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLessThan(String value) {
            addCriterion("drugs_dosage <", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLessThanOrEqualTo(String value) {
            addCriterion("drugs_dosage <=", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLike(String value) {
            addCriterion("drugs_dosage like", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotLike(String value) {
            addCriterion("drugs_dosage not like", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIn(List<String> values) {
            addCriterion("drugs_dosage in", values, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotIn(List<String> values) {
            addCriterion("drugs_dosage not in", values, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageBetween(String value1, String value2) {
            addCriterion("drugs_dosage between", value1, value2, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotBetween(String value1, String value2) {
            addCriterion("drugs_dosage not between", value1, value2, "drugsDosage");
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

        public Criteria andDrugsNumEqualTo(Integer value) {
            addCriterion("drugs_num =", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumNotEqualTo(Integer value) {
            addCriterion("drugs_num <>", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumGreaterThan(Integer value) {
            addCriterion("drugs_num >", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugs_num >=", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumLessThan(Integer value) {
            addCriterion("drugs_num <", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumLessThanOrEqualTo(Integer value) {
            addCriterion("drugs_num <=", value, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumIn(List<Integer> values) {
            addCriterion("drugs_num in", values, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumNotIn(List<Integer> values) {
            addCriterion("drugs_num not in", values, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumBetween(Integer value1, Integer value2) {
            addCriterion("drugs_num between", value1, value2, "drugsNum");
            return (Criteria) this;
        }

        public Criteria andDrugsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("drugs_num not between", value1, value2, "drugsNum");
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

        public Criteria andDrugsPriceEqualTo(BigDecimal value) {
            addCriterion("drugs_price =", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotEqualTo(BigDecimal value) {
            addCriterion("drugs_price <>", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThan(BigDecimal value) {
            addCriterion("drugs_price >", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugs_price >=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThan(BigDecimal value) {
            addCriterion("drugs_price <", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugs_price <=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIn(List<BigDecimal> values) {
            addCriterion("drugs_price in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotIn(List<BigDecimal> values) {
            addCriterion("drugs_price not in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugs_price between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugs_price not between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andUserWarnsIsNull() {
            addCriterion("user_warns is null");
            return (Criteria) this;
        }

        public Criteria andUserWarnsIsNotNull() {
            addCriterion("user_warns is not null");
            return (Criteria) this;
        }

        public Criteria andUserWarnsEqualTo(String value) {
            addCriterion("user_warns =", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsNotEqualTo(String value) {
            addCriterion("user_warns <>", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsGreaterThan(String value) {
            addCriterion("user_warns >", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsGreaterThanOrEqualTo(String value) {
            addCriterion("user_warns >=", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsLessThan(String value) {
            addCriterion("user_warns <", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsLessThanOrEqualTo(String value) {
            addCriterion("user_warns <=", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsLike(String value) {
            addCriterion("user_warns like", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsNotLike(String value) {
            addCriterion("user_warns not like", value, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsIn(List<String> values) {
            addCriterion("user_warns in", values, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsNotIn(List<String> values) {
            addCriterion("user_warns not in", values, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsBetween(String value1, String value2) {
            addCriterion("user_warns between", value1, value2, "userWarns");
            return (Criteria) this;
        }

        public Criteria andUserWarnsNotBetween(String value1, String value2) {
            addCriterion("user_warns not between", value1, value2, "userWarns");
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