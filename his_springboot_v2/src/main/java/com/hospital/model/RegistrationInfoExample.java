package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationInfoExample() {
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

        public Criteria andRegistrationFeeNoIsNull() {
            addCriterion("registration_fee_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoIsNotNull() {
            addCriterion("registration_fee_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoEqualTo(String value) {
            addCriterion("registration_fee_no =", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoNotEqualTo(String value) {
            addCriterion("registration_fee_no <>", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoGreaterThan(String value) {
            addCriterion("registration_fee_no >", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("registration_fee_no >=", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoLessThan(String value) {
            addCriterion("registration_fee_no <", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoLessThanOrEqualTo(String value) {
            addCriterion("registration_fee_no <=", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoLike(String value) {
            addCriterion("registration_fee_no like", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoNotLike(String value) {
            addCriterion("registration_fee_no not like", value, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoIn(List<String> values) {
            addCriterion("registration_fee_no in", values, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoNotIn(List<String> values) {
            addCriterion("registration_fee_no not in", values, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoBetween(String value1, String value2) {
            addCriterion("registration_fee_no between", value1, value2, "registrationFeeNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNoNotBetween(String value1, String value2) {
            addCriterion("registration_fee_no not between", value1, value2, "registrationFeeNo");
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

        public Criteria andPatientAgeIsNull() {
            addCriterion("patient_age is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("patient_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Integer value) {
            addCriterion("patient_age =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Integer value) {
            addCriterion("patient_age <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Integer value) {
            addCriterion("patient_age >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_age >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Integer value) {
            addCriterion("patient_age <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Integer value) {
            addCriterion("patient_age <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Integer> values) {
            addCriterion("patient_age in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Integer> values) {
            addCriterion("patient_age not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Integer value1, Integer value2) {
            addCriterion("patient_age between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_age not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("patient_sex is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("patient_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(String value) {
            addCriterion("patient_sex =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(String value) {
            addCriterion("patient_sex <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(String value) {
            addCriterion("patient_sex >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(String value) {
            addCriterion("patient_sex >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(String value) {
            addCriterion("patient_sex <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(String value) {
            addCriterion("patient_sex <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLike(String value) {
            addCriterion("patient_sex like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotLike(String value) {
            addCriterion("patient_sex not like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<String> values) {
            addCriterion("patient_sex in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<String> values) {
            addCriterion("patient_sex not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(String value1, String value2) {
            addCriterion("patient_sex between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(String value1, String value2) {
            addCriterion("patient_sex not between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientCardIsNull() {
            addCriterion("patient_card is null");
            return (Criteria) this;
        }

        public Criteria andPatientCardIsNotNull() {
            addCriterion("patient_card is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCardEqualTo(String value) {
            addCriterion("patient_card =", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardNotEqualTo(String value) {
            addCriterion("patient_card <>", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardGreaterThan(String value) {
            addCriterion("patient_card >", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardGreaterThanOrEqualTo(String value) {
            addCriterion("patient_card >=", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardLessThan(String value) {
            addCriterion("patient_card <", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardLessThanOrEqualTo(String value) {
            addCriterion("patient_card <=", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardLike(String value) {
            addCriterion("patient_card like", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardNotLike(String value) {
            addCriterion("patient_card not like", value, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardIn(List<String> values) {
            addCriterion("patient_card in", values, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardNotIn(List<String> values) {
            addCriterion("patient_card not in", values, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardBetween(String value1, String value2) {
            addCriterion("patient_card between", value1, value2, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientCardNotBetween(String value1, String value2) {
            addCriterion("patient_card not between", value1, value2, "patientCard");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNull() {
            addCriterion("patient_address is null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNotNull() {
            addCriterion("patient_address is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressEqualTo(String value) {
            addCriterion("patient_address =", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotEqualTo(String value) {
            addCriterion("patient_address <>", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThan(String value) {
            addCriterion("patient_address >", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("patient_address >=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThan(String value) {
            addCriterion("patient_address <", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThanOrEqualTo(String value) {
            addCriterion("patient_address <=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLike(String value) {
            addCriterion("patient_address like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotLike(String value) {
            addCriterion("patient_address not like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIn(List<String> values) {
            addCriterion("patient_address in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotIn(List<String> values) {
            addCriterion("patient_address not in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressBetween(String value1, String value2) {
            addCriterion("patient_address between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotBetween(String value1, String value2) {
            addCriterion("patient_address not between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoIsNull() {
            addCriterion("outpatient_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoIsNotNull() {
            addCriterion("outpatient_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no =", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoNotEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no <>", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoGreaterThan(Integer value) {
            addCriterion("outpatient_doctor_no >", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no >=", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoLessThan(Integer value) {
            addCriterion("outpatient_doctor_no <", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoLessThanOrEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no <=", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoIn(List<Integer> values) {
            addCriterion("outpatient_doctor_no in", values, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoNotIn(List<Integer> values) {
            addCriterion("outpatient_doctor_no not in", values, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoBetween(Integer value1, Integer value2) {
            addCriterion("outpatient_doctor_no between", value1, value2, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("outpatient_doctor_no not between", value1, value2, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameIsNull() {
            addCriterion("outpatient_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameIsNotNull() {
            addCriterion("outpatient_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameEqualTo(String value) {
            addCriterion("outpatient_doctor_name =", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotEqualTo(String value) {
            addCriterion("outpatient_doctor_name <>", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameGreaterThan(String value) {
            addCriterion("outpatient_doctor_name >", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("outpatient_doctor_name >=", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameLessThan(String value) {
            addCriterion("outpatient_doctor_name <", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("outpatient_doctor_name <=", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameLike(String value) {
            addCriterion("outpatient_doctor_name like", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotLike(String value) {
            addCriterion("outpatient_doctor_name not like", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameIn(List<String> values) {
            addCriterion("outpatient_doctor_name in", values, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotIn(List<String> values) {
            addCriterion("outpatient_doctor_name not in", values, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameBetween(String value1, String value2) {
            addCriterion("outpatient_doctor_name between", value1, value2, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotBetween(String value1, String value2) {
            addCriterion("outpatient_doctor_name not between", value1, value2, "outpatientDoctorName");
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

        public Criteria andIsSeenDocatorIsNull() {
            addCriterion("is_seen_docator is null");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorIsNotNull() {
            addCriterion("is_seen_docator is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorEqualTo(String value) {
            addCriterion("is_seen_docator =", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotEqualTo(String value) {
            addCriterion("is_seen_docator <>", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorGreaterThan(String value) {
            addCriterion("is_seen_docator >", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorGreaterThanOrEqualTo(String value) {
            addCriterion("is_seen_docator >=", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorLessThan(String value) {
            addCriterion("is_seen_docator <", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorLessThanOrEqualTo(String value) {
            addCriterion("is_seen_docator <=", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorLike(String value) {
            addCriterion("is_seen_docator like", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotLike(String value) {
            addCriterion("is_seen_docator not like", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorIn(List<String> values) {
            addCriterion("is_seen_docator in", values, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotIn(List<String> values) {
            addCriterion("is_seen_docator not in", values, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorBetween(String value1, String value2) {
            addCriterion("is_seen_docator between", value1, value2, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotBetween(String value1, String value2) {
            addCriterion("is_seen_docator not between", value1, value2, "isSeenDocator");
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

        public Criteria andBlank1IsNull() {
            addCriterion("blank1 is null");
            return (Criteria) this;
        }

        public Criteria andBlank1IsNotNull() {
            addCriterion("blank1 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank1EqualTo(String value) {
            addCriterion("blank1 =", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotEqualTo(String value) {
            addCriterion("blank1 <>", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1GreaterThan(String value) {
            addCriterion("blank1 >", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1GreaterThanOrEqualTo(String value) {
            addCriterion("blank1 >=", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1LessThan(String value) {
            addCriterion("blank1 <", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1LessThanOrEqualTo(String value) {
            addCriterion("blank1 <=", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1Like(String value) {
            addCriterion("blank1 like", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotLike(String value) {
            addCriterion("blank1 not like", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1In(List<String> values) {
            addCriterion("blank1 in", values, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotIn(List<String> values) {
            addCriterion("blank1 not in", values, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1Between(String value1, String value2) {
            addCriterion("blank1 between", value1, value2, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotBetween(String value1, String value2) {
            addCriterion("blank1 not between", value1, value2, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank2IsNull() {
            addCriterion("blank2 is null");
            return (Criteria) this;
        }

        public Criteria andBlank2IsNotNull() {
            addCriterion("blank2 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank2EqualTo(String value) {
            addCriterion("blank2 =", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotEqualTo(String value) {
            addCriterion("blank2 <>", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2GreaterThan(String value) {
            addCriterion("blank2 >", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2GreaterThanOrEqualTo(String value) {
            addCriterion("blank2 >=", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2LessThan(String value) {
            addCriterion("blank2 <", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2LessThanOrEqualTo(String value) {
            addCriterion("blank2 <=", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2Like(String value) {
            addCriterion("blank2 like", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotLike(String value) {
            addCriterion("blank2 not like", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2In(List<String> values) {
            addCriterion("blank2 in", values, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotIn(List<String> values) {
            addCriterion("blank2 not in", values, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2Between(String value1, String value2) {
            addCriterion("blank2 between", value1, value2, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotBetween(String value1, String value2) {
            addCriterion("blank2 not between", value1, value2, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank3IsNull() {
            addCriterion("blank3 is null");
            return (Criteria) this;
        }

        public Criteria andBlank3IsNotNull() {
            addCriterion("blank3 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank3EqualTo(String value) {
            addCriterion("blank3 =", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotEqualTo(String value) {
            addCriterion("blank3 <>", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3GreaterThan(String value) {
            addCriterion("blank3 >", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3GreaterThanOrEqualTo(String value) {
            addCriterion("blank3 >=", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3LessThan(String value) {
            addCriterion("blank3 <", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3LessThanOrEqualTo(String value) {
            addCriterion("blank3 <=", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3Like(String value) {
            addCriterion("blank3 like", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotLike(String value) {
            addCriterion("blank3 not like", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3In(List<String> values) {
            addCriterion("blank3 in", values, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotIn(List<String> values) {
            addCriterion("blank3 not in", values, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3Between(String value1, String value2) {
            addCriterion("blank3 between", value1, value2, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotBetween(String value1, String value2) {
            addCriterion("blank3 not between", value1, value2, "blank3");
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