package com.hospital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientFeeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientFeeDetailExample() {
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

        public Criteria andRegistrationInfoNoIsNull() {
            addCriterion("registration_info_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoIsNotNull() {
            addCriterion("registration_info_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoEqualTo(Integer value) {
            addCriterion("registration_info_no =", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoNotEqualTo(Integer value) {
            addCriterion("registration_info_no <>", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoGreaterThan(Integer value) {
            addCriterion("registration_info_no >", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_info_no >=", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoLessThan(Integer value) {
            addCriterion("registration_info_no <", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoLessThanOrEqualTo(Integer value) {
            addCriterion("registration_info_no <=", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoIn(List<Integer> values) {
            addCriterion("registration_info_no in", values, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoNotIn(List<Integer> values) {
            addCriterion("registration_info_no not in", values, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoBetween(Integer value1, Integer value2) {
            addCriterion("registration_info_no between", value1, value2, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_info_no not between", value1, value2, "registrationInfoNo");
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

        public Criteria andCheckFeeNoIsNull() {
            addCriterion("check_fee_no is null");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoIsNotNull() {
            addCriterion("check_fee_no is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoEqualTo(Integer value) {
            addCriterion("check_fee_no =", value, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoNotEqualTo(Integer value) {
            addCriterion("check_fee_no <>", value, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoGreaterThan(Integer value) {
            addCriterion("check_fee_no >", value, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_fee_no >=", value, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoLessThan(Integer value) {
            addCriterion("check_fee_no <", value, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoLessThanOrEqualTo(Integer value) {
            addCriterion("check_fee_no <=", value, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoIn(List<Integer> values) {
            addCriterion("check_fee_no in", values, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoNotIn(List<Integer> values) {
            addCriterion("check_fee_no not in", values, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoBetween(Integer value1, Integer value2) {
            addCriterion("check_fee_no between", value1, value2, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("check_fee_no not between", value1, value2, "checkFeeNo");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceIsNull() {
            addCriterion("check_fee_price is null");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceIsNotNull() {
            addCriterion("check_fee_price is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceEqualTo(BigDecimal value) {
            addCriterion("check_fee_price =", value, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceNotEqualTo(BigDecimal value) {
            addCriterion("check_fee_price <>", value, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceGreaterThan(BigDecimal value) {
            addCriterion("check_fee_price >", value, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("check_fee_price >=", value, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceLessThan(BigDecimal value) {
            addCriterion("check_fee_price <", value, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("check_fee_price <=", value, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceIn(List<BigDecimal> values) {
            addCriterion("check_fee_price in", values, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceNotIn(List<BigDecimal> values) {
            addCriterion("check_fee_price not in", values, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_fee_price between", value1, value2, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andCheckFeePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_fee_price not between", value1, value2, "checkFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoIsNull() {
            addCriterion("herbal_prescription_fee_no is null");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoIsNotNull() {
            addCriterion("herbal_prescription_fee_no is not null");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoEqualTo(Integer value) {
            addCriterion("herbal_prescription_fee_no =", value, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoNotEqualTo(Integer value) {
            addCriterion("herbal_prescription_fee_no <>", value, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoGreaterThan(Integer value) {
            addCriterion("herbal_prescription_fee_no >", value, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("herbal_prescription_fee_no >=", value, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoLessThan(Integer value) {
            addCriterion("herbal_prescription_fee_no <", value, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoLessThanOrEqualTo(Integer value) {
            addCriterion("herbal_prescription_fee_no <=", value, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoIn(List<Integer> values) {
            addCriterion("herbal_prescription_fee_no in", values, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoNotIn(List<Integer> values) {
            addCriterion("herbal_prescription_fee_no not in", values, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoBetween(Integer value1, Integer value2) {
            addCriterion("herbal_prescription_fee_no between", value1, value2, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("herbal_prescription_fee_no not between", value1, value2, "herbalPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceIsNull() {
            addCriterion("herbal_prescription_fee_price is null");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceIsNotNull() {
            addCriterion("herbal_prescription_fee_price is not null");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceEqualTo(BigDecimal value) {
            addCriterion("herbal_prescription_fee_price =", value, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceNotEqualTo(BigDecimal value) {
            addCriterion("herbal_prescription_fee_price <>", value, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceGreaterThan(BigDecimal value) {
            addCriterion("herbal_prescription_fee_price >", value, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("herbal_prescription_fee_price >=", value, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceLessThan(BigDecimal value) {
            addCriterion("herbal_prescription_fee_price <", value, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("herbal_prescription_fee_price <=", value, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceIn(List<BigDecimal> values) {
            addCriterion("herbal_prescription_fee_price in", values, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceNotIn(List<BigDecimal> values) {
            addCriterion("herbal_prescription_fee_price not in", values, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("herbal_prescription_fee_price between", value1, value2, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andHerbalPrescriptionFeePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("herbal_prescription_fee_price not between", value1, value2, "herbalPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoIsNull() {
            addCriterion("medicine_prescription_fee_no is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoIsNotNull() {
            addCriterion("medicine_prescription_fee_no is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoEqualTo(Integer value) {
            addCriterion("medicine_prescription_fee_no =", value, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoNotEqualTo(Integer value) {
            addCriterion("medicine_prescription_fee_no <>", value, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoGreaterThan(Integer value) {
            addCriterion("medicine_prescription_fee_no >", value, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_prescription_fee_no >=", value, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoLessThan(Integer value) {
            addCriterion("medicine_prescription_fee_no <", value, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_prescription_fee_no <=", value, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoIn(List<Integer> values) {
            addCriterion("medicine_prescription_fee_no in", values, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoNotIn(List<Integer> values) {
            addCriterion("medicine_prescription_fee_no not in", values, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoBetween(Integer value1, Integer value2) {
            addCriterion("medicine_prescription_fee_no between", value1, value2, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_prescription_fee_no not between", value1, value2, "medicinePrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceIsNull() {
            addCriterion("medicine_prescription_fee_price is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceIsNotNull() {
            addCriterion("medicine_prescription_fee_price is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceEqualTo(BigDecimal value) {
            addCriterion("medicine_prescription_fee_price =", value, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceNotEqualTo(BigDecimal value) {
            addCriterion("medicine_prescription_fee_price <>", value, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceGreaterThan(BigDecimal value) {
            addCriterion("medicine_prescription_fee_price >", value, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medicine_prescription_fee_price >=", value, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceLessThan(BigDecimal value) {
            addCriterion("medicine_prescription_fee_price <", value, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medicine_prescription_fee_price <=", value, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceIn(List<BigDecimal> values) {
            addCriterion("medicine_prescription_fee_price in", values, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceNotIn(List<BigDecimal> values) {
            addCriterion("medicine_prescription_fee_price not in", values, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medicine_prescription_fee_price between", value1, value2, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionFeePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medicine_prescription_fee_price not between", value1, value2, "medicinePrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoIsNull() {
            addCriterion("dispos_prescription_fee_no is null");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoIsNotNull() {
            addCriterion("dispos_prescription_fee_no is not null");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoEqualTo(Integer value) {
            addCriterion("dispos_prescription_fee_no =", value, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoNotEqualTo(Integer value) {
            addCriterion("dispos_prescription_fee_no <>", value, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoGreaterThan(Integer value) {
            addCriterion("dispos_prescription_fee_no >", value, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispos_prescription_fee_no >=", value, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoLessThan(Integer value) {
            addCriterion("dispos_prescription_fee_no <", value, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoLessThanOrEqualTo(Integer value) {
            addCriterion("dispos_prescription_fee_no <=", value, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoIn(List<Integer> values) {
            addCriterion("dispos_prescription_fee_no in", values, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoNotIn(List<Integer> values) {
            addCriterion("dispos_prescription_fee_no not in", values, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoBetween(Integer value1, Integer value2) {
            addCriterion("dispos_prescription_fee_no between", value1, value2, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("dispos_prescription_fee_no not between", value1, value2, "disposPrescriptionFeeNo");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceIsNull() {
            addCriterion("dispos_prescription_fee_price is null");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceIsNotNull() {
            addCriterion("dispos_prescription_fee_price is not null");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceEqualTo(BigDecimal value) {
            addCriterion("dispos_prescription_fee_price =", value, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceNotEqualTo(BigDecimal value) {
            addCriterion("dispos_prescription_fee_price <>", value, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceGreaterThan(BigDecimal value) {
            addCriterion("dispos_prescription_fee_price >", value, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dispos_prescription_fee_price >=", value, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceLessThan(BigDecimal value) {
            addCriterion("dispos_prescription_fee_price <", value, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dispos_prescription_fee_price <=", value, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceIn(List<BigDecimal> values) {
            addCriterion("dispos_prescription_fee_price in", values, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceNotIn(List<BigDecimal> values) {
            addCriterion("dispos_prescription_fee_price not in", values, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dispos_prescription_fee_price between", value1, value2, "disposPrescriptionFeePrice");
            return (Criteria) this;
        }

        public Criteria andDisposPrescriptionFeePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dispos_prescription_fee_price not between", value1, value2, "disposPrescriptionFeePrice");
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