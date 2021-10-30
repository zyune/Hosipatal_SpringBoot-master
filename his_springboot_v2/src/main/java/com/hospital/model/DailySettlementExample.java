package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailySettlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailySettlementExample() {
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

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Double value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Double value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Double value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Double value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Double value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Double> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Double> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Double value1, Double value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Double value1, Double value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoIsNull() {
            addCriterion("registrar_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoIsNotNull() {
            addCriterion("registrar_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoEqualTo(Integer value) {
            addCriterion("registrar_no =", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoNotEqualTo(Integer value) {
            addCriterion("registrar_no <>", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoGreaterThan(Integer value) {
            addCriterion("registrar_no >", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrar_no >=", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoLessThan(Integer value) {
            addCriterion("registrar_no <", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoLessThanOrEqualTo(Integer value) {
            addCriterion("registrar_no <=", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoIn(List<Integer> values) {
            addCriterion("registrar_no in", values, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoNotIn(List<Integer> values) {
            addCriterion("registrar_no not in", values, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoBetween(Integer value1, Integer value2) {
            addCriterion("registrar_no between", value1, value2, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoNotBetween(Integer value1, Integer value2) {
            addCriterion("registrar_no not between", value1, value2, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameIsNull() {
            addCriterion("registrar_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameIsNotNull() {
            addCriterion("registrar_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameEqualTo(String value) {
            addCriterion("registrar_name =", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotEqualTo(String value) {
            addCriterion("registrar_name <>", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameGreaterThan(String value) {
            addCriterion("registrar_name >", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameGreaterThanOrEqualTo(String value) {
            addCriterion("registrar_name >=", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameLessThan(String value) {
            addCriterion("registrar_name <", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameLessThanOrEqualTo(String value) {
            addCriterion("registrar_name <=", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameLike(String value) {
            addCriterion("registrar_name like", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotLike(String value) {
            addCriterion("registrar_name not like", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameIn(List<String> values) {
            addCriterion("registrar_name in", values, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotIn(List<String> values) {
            addCriterion("registrar_name not in", values, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameBetween(String value1, String value2) {
            addCriterion("registrar_name between", value1, value2, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotBetween(String value1, String value2) {
            addCriterion("registrar_name not between", value1, value2, "registrarName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBank1IsNull() {
            addCriterion("bank1 is null");
            return (Criteria) this;
        }

        public Criteria andBank1IsNotNull() {
            addCriterion("bank1 is not null");
            return (Criteria) this;
        }

        public Criteria andBank1EqualTo(String value) {
            addCriterion("bank1 =", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1NotEqualTo(String value) {
            addCriterion("bank1 <>", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1GreaterThan(String value) {
            addCriterion("bank1 >", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1GreaterThanOrEqualTo(String value) {
            addCriterion("bank1 >=", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1LessThan(String value) {
            addCriterion("bank1 <", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1LessThanOrEqualTo(String value) {
            addCriterion("bank1 <=", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1Like(String value) {
            addCriterion("bank1 like", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1NotLike(String value) {
            addCriterion("bank1 not like", value, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1In(List<String> values) {
            addCriterion("bank1 in", values, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1NotIn(List<String> values) {
            addCriterion("bank1 not in", values, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1Between(String value1, String value2) {
            addCriterion("bank1 between", value1, value2, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank1NotBetween(String value1, String value2) {
            addCriterion("bank1 not between", value1, value2, "bank1");
            return (Criteria) this;
        }

        public Criteria andBank2IsNull() {
            addCriterion("bank2 is null");
            return (Criteria) this;
        }

        public Criteria andBank2IsNotNull() {
            addCriterion("bank2 is not null");
            return (Criteria) this;
        }

        public Criteria andBank2EqualTo(String value) {
            addCriterion("bank2 =", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2NotEqualTo(String value) {
            addCriterion("bank2 <>", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2GreaterThan(String value) {
            addCriterion("bank2 >", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2GreaterThanOrEqualTo(String value) {
            addCriterion("bank2 >=", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2LessThan(String value) {
            addCriterion("bank2 <", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2LessThanOrEqualTo(String value) {
            addCriterion("bank2 <=", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2Like(String value) {
            addCriterion("bank2 like", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2NotLike(String value) {
            addCriterion("bank2 not like", value, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2In(List<String> values) {
            addCriterion("bank2 in", values, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2NotIn(List<String> values) {
            addCriterion("bank2 not in", values, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2Between(String value1, String value2) {
            addCriterion("bank2 between", value1, value2, "bank2");
            return (Criteria) this;
        }

        public Criteria andBank2NotBetween(String value1, String value2) {
            addCriterion("bank2 not between", value1, value2, "bank2");
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