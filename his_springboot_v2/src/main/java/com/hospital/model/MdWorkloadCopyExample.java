package com.hospital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MdWorkloadCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdWorkloadCopyExample() {
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

        public Criteria andMedicalDoctorNoIsNull() {
            addCriterion("medical_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoIsNotNull() {
            addCriterion("medical_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoEqualTo(Integer value) {
            addCriterion("medical_doctor_no =", value, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoNotEqualTo(Integer value) {
            addCriterion("medical_doctor_no <>", value, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoGreaterThan(Integer value) {
            addCriterion("medical_doctor_no >", value, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("medical_doctor_no >=", value, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoLessThan(Integer value) {
            addCriterion("medical_doctor_no <", value, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoLessThanOrEqualTo(Integer value) {
            addCriterion("medical_doctor_no <=", value, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoIn(List<Integer> values) {
            addCriterion("medical_doctor_no in", values, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoNotIn(List<Integer> values) {
            addCriterion("medical_doctor_no not in", values, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoBetween(Integer value1, Integer value2) {
            addCriterion("medical_doctor_no between", value1, value2, "medicalDoctorNo");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("medical_doctor_no not between", value1, value2, "medicalDoctorNo");
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

        public Criteria andPatientNumIsNull() {
            addCriterion("patient_num is null");
            return (Criteria) this;
        }

        public Criteria andPatientNumIsNotNull() {
            addCriterion("patient_num is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNumEqualTo(Integer value) {
            addCriterion("patient_num =", value, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumNotEqualTo(Integer value) {
            addCriterion("patient_num <>", value, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumGreaterThan(Integer value) {
            addCriterion("patient_num >", value, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_num >=", value, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumLessThan(Integer value) {
            addCriterion("patient_num <", value, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumLessThanOrEqualTo(Integer value) {
            addCriterion("patient_num <=", value, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumIn(List<Integer> values) {
            addCriterion("patient_num in", values, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumNotIn(List<Integer> values) {
            addCriterion("patient_num not in", values, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumBetween(Integer value1, Integer value2) {
            addCriterion("patient_num between", value1, value2, "patientNum");
            return (Criteria) this;
        }

        public Criteria andPatientNumNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_num not between", value1, value2, "patientNum");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNull() {
            addCriterion("sum_price is null");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNotNull() {
            addCriterion("sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andSumPriceEqualTo(BigDecimal value) {
            addCriterion("sum_price =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("sum_price <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(BigDecimal value) {
            addCriterion("sum_price >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_price >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(BigDecimal value) {
            addCriterion("sum_price <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_price <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<BigDecimal> values) {
            addCriterion("sum_price in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("sum_price not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_price between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_price not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceIsNull() {
            addCriterion("check_price is null");
            return (Criteria) this;
        }

        public Criteria andCheckPriceIsNotNull() {
            addCriterion("check_price is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPriceEqualTo(BigDecimal value) {
            addCriterion("check_price =", value, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceNotEqualTo(BigDecimal value) {
            addCriterion("check_price <>", value, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceGreaterThan(BigDecimal value) {
            addCriterion("check_price >", value, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("check_price >=", value, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceLessThan(BigDecimal value) {
            addCriterion("check_price <", value, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("check_price <=", value, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceIn(List<BigDecimal> values) {
            addCriterion("check_price in", values, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceNotIn(List<BigDecimal> values) {
            addCriterion("check_price not in", values, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_price between", value1, value2, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andCheckPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_price not between", value1, value2, "checkPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceIsNull() {
            addCriterion("test_price is null");
            return (Criteria) this;
        }

        public Criteria andTestPriceIsNotNull() {
            addCriterion("test_price is not null");
            return (Criteria) this;
        }

        public Criteria andTestPriceEqualTo(BigDecimal value) {
            addCriterion("test_price =", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotEqualTo(BigDecimal value) {
            addCriterion("test_price <>", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceGreaterThan(BigDecimal value) {
            addCriterion("test_price >", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("test_price >=", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceLessThan(BigDecimal value) {
            addCriterion("test_price <", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("test_price <=", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceIn(List<BigDecimal> values) {
            addCriterion("test_price in", values, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotIn(List<BigDecimal> values) {
            addCriterion("test_price not in", values, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("test_price between", value1, value2, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("test_price not between", value1, value2, "testPrice");
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