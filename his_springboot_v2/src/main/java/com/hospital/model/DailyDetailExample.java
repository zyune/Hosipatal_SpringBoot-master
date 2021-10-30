package com.hospital.model;

import java.util.ArrayList;
import java.util.List;

public class DailyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyDetailExample() {
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

        public Criteria andDailySettlementNoIsNull() {
            addCriterion("daily_settlement_no is null");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoIsNotNull() {
            addCriterion("daily_settlement_no is not null");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoEqualTo(Integer value) {
            addCriterion("daily_settlement_no =", value, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoNotEqualTo(Integer value) {
            addCriterion("daily_settlement_no <>", value, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoGreaterThan(Integer value) {
            addCriterion("daily_settlement_no >", value, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_settlement_no >=", value, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoLessThan(Integer value) {
            addCriterion("daily_settlement_no <", value, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoLessThanOrEqualTo(Integer value) {
            addCriterion("daily_settlement_no <=", value, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoIn(List<Integer> values) {
            addCriterion("daily_settlement_no in", values, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoNotIn(List<Integer> values) {
            addCriterion("daily_settlement_no not in", values, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoBetween(Integer value1, Integer value2) {
            addCriterion("daily_settlement_no between", value1, value2, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andDailySettlementNoNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_settlement_no not between", value1, value2, "dailySettlementNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNull() {
            addCriterion("medical_record is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNotNull() {
            addCriterion("medical_record is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordEqualTo(String value) {
            addCriterion("medical_record =", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotEqualTo(String value) {
            addCriterion("medical_record <>", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThan(String value) {
            addCriterion("medical_record >", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("medical_record >=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThan(String value) {
            addCriterion("medical_record <", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThanOrEqualTo(String value) {
            addCriterion("medical_record <=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLike(String value) {
            addCriterion("medical_record like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotLike(String value) {
            addCriterion("medical_record not like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIn(List<String> values) {
            addCriterion("medical_record in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotIn(List<String> values) {
            addCriterion("medical_record not in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordBetween(String value1, String value2) {
            addCriterion("medical_record between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotBetween(String value1, String value2) {
            addCriterion("medical_record not between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryIsNull() {
            addCriterion("settlement_category is null");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryIsNotNull() {
            addCriterion("settlement_category is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryEqualTo(String value) {
            addCriterion("settlement_category =", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryNotEqualTo(String value) {
            addCriterion("settlement_category <>", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryGreaterThan(String value) {
            addCriterion("settlement_category >", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_category >=", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryLessThan(String value) {
            addCriterion("settlement_category <", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryLessThanOrEqualTo(String value) {
            addCriterion("settlement_category <=", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryLike(String value) {
            addCriterion("settlement_category like", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryNotLike(String value) {
            addCriterion("settlement_category not like", value, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryIn(List<String> values) {
            addCriterion("settlement_category in", values, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryNotIn(List<String> values) {
            addCriterion("settlement_category not in", values, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryBetween(String value1, String value2) {
            addCriterion("settlement_category between", value1, value2, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andSettlementCategoryNotBetween(String value1, String value2) {
            addCriterion("settlement_category not between", value1, value2, "settlementCategory");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(Double value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(Double value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(Double value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(Double value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(Double value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<Double> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<Double> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(Double value1, Double value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(Double value1, Double value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountToPayIsNull() {
            addCriterion("account_to_pay is null");
            return (Criteria) this;
        }

        public Criteria andAccountToPayIsNotNull() {
            addCriterion("account_to_pay is not null");
            return (Criteria) this;
        }

        public Criteria andAccountToPayEqualTo(String value) {
            addCriterion("account_to_pay =", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayNotEqualTo(String value) {
            addCriterion("account_to_pay <>", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayGreaterThan(String value) {
            addCriterion("account_to_pay >", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayGreaterThanOrEqualTo(String value) {
            addCriterion("account_to_pay >=", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayLessThan(String value) {
            addCriterion("account_to_pay <", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayLessThanOrEqualTo(String value) {
            addCriterion("account_to_pay <=", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayLike(String value) {
            addCriterion("account_to_pay like", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayNotLike(String value) {
            addCriterion("account_to_pay not like", value, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayIn(List<String> values) {
            addCriterion("account_to_pay in", values, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayNotIn(List<String> values) {
            addCriterion("account_to_pay not in", values, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayBetween(String value1, String value2) {
            addCriterion("account_to_pay between", value1, value2, "accountToPay");
            return (Criteria) this;
        }

        public Criteria andAccountToPayNotBetween(String value1, String value2) {
            addCriterion("account_to_pay not between", value1, value2, "accountToPay");
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