package com.hospital.model;

import java.util.ArrayList;
import java.util.List;

public class DisacategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisacategoryExample() {
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

        public Criteria andDicaCodeIsNull() {
            addCriterion("dica_code is null");
            return (Criteria) this;
        }

        public Criteria andDicaCodeIsNotNull() {
            addCriterion("dica_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicaCodeEqualTo(String value) {
            addCriterion("dica_code =", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeNotEqualTo(String value) {
            addCriterion("dica_code <>", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeGreaterThan(String value) {
            addCriterion("dica_code >", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dica_code >=", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeLessThan(String value) {
            addCriterion("dica_code <", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeLessThanOrEqualTo(String value) {
            addCriterion("dica_code <=", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeLike(String value) {
            addCriterion("dica_code like", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeNotLike(String value) {
            addCriterion("dica_code not like", value, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeIn(List<String> values) {
            addCriterion("dica_code in", values, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeNotIn(List<String> values) {
            addCriterion("dica_code not in", values, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeBetween(String value1, String value2) {
            addCriterion("dica_code between", value1, value2, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaCodeNotBetween(String value1, String value2) {
            addCriterion("dica_code not between", value1, value2, "dicaCode");
            return (Criteria) this;
        }

        public Criteria andDicaNameIsNull() {
            addCriterion("dica_name is null");
            return (Criteria) this;
        }

        public Criteria andDicaNameIsNotNull() {
            addCriterion("dica_name is not null");
            return (Criteria) this;
        }

        public Criteria andDicaNameEqualTo(String value) {
            addCriterion("dica_name =", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameNotEqualTo(String value) {
            addCriterion("dica_name <>", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameGreaterThan(String value) {
            addCriterion("dica_name >", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameGreaterThanOrEqualTo(String value) {
            addCriterion("dica_name >=", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameLessThan(String value) {
            addCriterion("dica_name <", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameLessThanOrEqualTo(String value) {
            addCriterion("dica_name <=", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameLike(String value) {
            addCriterion("dica_name like", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameNotLike(String value) {
            addCriterion("dica_name not like", value, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameIn(List<String> values) {
            addCriterion("dica_name in", values, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameNotIn(List<String> values) {
            addCriterion("dica_name not in", values, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameBetween(String value1, String value2) {
            addCriterion("dica_name between", value1, value2, "dicaName");
            return (Criteria) this;
        }

        public Criteria andDicaNameNotBetween(String value1, String value2) {
            addCriterion("dica_name not between", value1, value2, "dicaName");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNull() {
            addCriterion("sequence_no is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNotNull() {
            addCriterion("sequence_no is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoEqualTo(Integer value) {
            addCriterion("sequence_no =", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotEqualTo(Integer value) {
            addCriterion("sequence_no <>", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThan(Integer value) {
            addCriterion("sequence_no >", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence_no >=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThan(Integer value) {
            addCriterion("sequence_no <", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThanOrEqualTo(Integer value) {
            addCriterion("sequence_no <=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIn(List<Integer> values) {
            addCriterion("sequence_no in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotIn(List<Integer> values) {
            addCriterion("sequence_no not in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoBetween(Integer value1, Integer value2) {
            addCriterion("sequence_no between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence_no not between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIsNull() {
            addCriterion("dica_type is null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIsNotNull() {
            addCriterion("dica_type is not null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeEqualTo(Integer value) {
            addCriterion("dica_type =", value, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNotEqualTo(Integer value) {
            addCriterion("dica_type <>", value, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeGreaterThan(Integer value) {
            addCriterion("dica_type >", value, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dica_type >=", value, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeLessThan(Integer value) {
            addCriterion("dica_type <", value, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dica_type <=", value, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIn(List<Integer> values) {
            addCriterion("dica_type in", values, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNotIn(List<Integer> values) {
            addCriterion("dica_type not in", values, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeBetween(Integer value1, Integer value2) {
            addCriterion("dica_type between", value1, value2, "dicaType");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dica_type not between", value1, value2, "dicaType");
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