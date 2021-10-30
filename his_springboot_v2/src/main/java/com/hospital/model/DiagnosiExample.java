package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiagnosiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiagnosiExample() {
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

        public Criteria andIcdIsNull() {
            addCriterion("icd is null");
            return (Criteria) this;
        }

        public Criteria andIcdIsNotNull() {
            addCriterion("icd is not null");
            return (Criteria) this;
        }

        public Criteria andIcdEqualTo(String value) {
            addCriterion("icd =", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdNotEqualTo(String value) {
            addCriterion("icd <>", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdGreaterThan(String value) {
            addCriterion("icd >", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdGreaterThanOrEqualTo(String value) {
            addCriterion("icd >=", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdLessThan(String value) {
            addCriterion("icd <", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdLessThanOrEqualTo(String value) {
            addCriterion("icd <=", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdLike(String value) {
            addCriterion("icd like", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdNotLike(String value) {
            addCriterion("icd not like", value, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdIn(List<String> values) {
            addCriterion("icd in", values, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdNotIn(List<String> values) {
            addCriterion("icd not in", values, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdBetween(String value1, String value2) {
            addCriterion("icd between", value1, value2, "icd");
            return (Criteria) this;
        }

        public Criteria andIcdNotBetween(String value1, String value2) {
            addCriterion("icd not between", value1, value2, "icd");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNull() {
            addCriterion("disease_name is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNotNull() {
            addCriterion("disease_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameEqualTo(String value) {
            addCriterion("disease_name =", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotEqualTo(String value) {
            addCriterion("disease_name <>", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThan(String value) {
            addCriterion("disease_name >", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("disease_name >=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThan(String value) {
            addCriterion("disease_name <", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThanOrEqualTo(String value) {
            addCriterion("disease_name <=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLike(String value) {
            addCriterion("disease_name like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotLike(String value) {
            addCriterion("disease_name not like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIn(List<String> values) {
            addCriterion("disease_name in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotIn(List<String> values) {
            addCriterion("disease_name not in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameBetween(String value1, String value2) {
            addCriterion("disease_name between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotBetween(String value1, String value2) {
            addCriterion("disease_name not between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNull() {
            addCriterion("is_main is null");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNotNull() {
            addCriterion("is_main is not null");
            return (Criteria) this;
        }

        public Criteria andIsMainEqualTo(String value) {
            addCriterion("is_main =", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotEqualTo(String value) {
            addCriterion("is_main <>", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThan(String value) {
            addCriterion("is_main >", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThanOrEqualTo(String value) {
            addCriterion("is_main >=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThan(String value) {
            addCriterion("is_main <", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThanOrEqualTo(String value) {
            addCriterion("is_main <=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLike(String value) {
            addCriterion("is_main like", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotLike(String value) {
            addCriterion("is_main not like", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainIn(List<String> values) {
            addCriterion("is_main in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotIn(List<String> values) {
            addCriterion("is_main not in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainBetween(String value1, String value2) {
            addCriterion("is_main between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotBetween(String value1, String value2) {
            addCriterion("is_main not between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsFuIsNull() {
            addCriterion("is_fu is null");
            return (Criteria) this;
        }

        public Criteria andIsFuIsNotNull() {
            addCriterion("is_fu is not null");
            return (Criteria) this;
        }

        public Criteria andIsFuEqualTo(String value) {
            addCriterion("is_fu =", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuNotEqualTo(String value) {
            addCriterion("is_fu <>", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuGreaterThan(String value) {
            addCriterion("is_fu >", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuGreaterThanOrEqualTo(String value) {
            addCriterion("is_fu >=", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuLessThan(String value) {
            addCriterion("is_fu <", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuLessThanOrEqualTo(String value) {
            addCriterion("is_fu <=", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuLike(String value) {
            addCriterion("is_fu like", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuNotLike(String value) {
            addCriterion("is_fu not like", value, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuIn(List<String> values) {
            addCriterion("is_fu in", values, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuNotIn(List<String> values) {
            addCriterion("is_fu not in", values, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuBetween(String value1, String value2) {
            addCriterion("is_fu between", value1, value2, "isFu");
            return (Criteria) this;
        }

        public Criteria andIsFuNotBetween(String value1, String value2) {
            addCriterion("is_fu not between", value1, value2, "isFu");
            return (Criteria) this;
        }

        public Criteria andOnsetDateIsNull() {
            addCriterion("onset_date is null");
            return (Criteria) this;
        }

        public Criteria andOnsetDateIsNotNull() {
            addCriterion("onset_date is not null");
            return (Criteria) this;
        }

        public Criteria andOnsetDateEqualTo(Date value) {
            addCriterionForJDBCDate("onset_date =", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("onset_date <>", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("onset_date >", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("onset_date >=", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateLessThan(Date value) {
            addCriterionForJDBCDate("onset_date <", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("onset_date <=", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateIn(List<Date> values) {
            addCriterionForJDBCDate("onset_date in", values, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("onset_date not in", values, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("onset_date between", value1, value2, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("onset_date not between", value1, value2, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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