package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckFeeExample() {
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

        public Criteria andCheckApplicationNoIsNull() {
            addCriterion("check_application_no is null");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoIsNotNull() {
            addCriterion("check_application_no is not null");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoEqualTo(Integer value) {
            addCriterion("check_application_no =", value, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoNotEqualTo(Integer value) {
            addCriterion("check_application_no <>", value, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoGreaterThan(Integer value) {
            addCriterion("check_application_no >", value, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_application_no >=", value, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoLessThan(Integer value) {
            addCriterion("check_application_no <", value, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoLessThanOrEqualTo(Integer value) {
            addCriterion("check_application_no <=", value, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoIn(List<Integer> values) {
            addCriterion("check_application_no in", values, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoNotIn(List<Integer> values) {
            addCriterion("check_application_no not in", values, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoBetween(Integer value1, Integer value2) {
            addCriterion("check_application_no between", value1, value2, "checkApplicationNo");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNoNotBetween(Integer value1, Integer value2) {
            addCriterion("check_application_no not between", value1, value2, "checkApplicationNo");
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

        public Criteria andMedicalDoctorNameIsNull() {
            addCriterion("medical_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameIsNotNull() {
            addCriterion("medical_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameEqualTo(String value) {
            addCriterion("medical_doctor_name =", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameNotEqualTo(String value) {
            addCriterion("medical_doctor_name <>", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameGreaterThan(String value) {
            addCriterion("medical_doctor_name >", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("medical_doctor_name >=", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameLessThan(String value) {
            addCriterion("medical_doctor_name <", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("medical_doctor_name <=", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameLike(String value) {
            addCriterion("medical_doctor_name like", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameNotLike(String value) {
            addCriterion("medical_doctor_name not like", value, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameIn(List<String> values) {
            addCriterion("medical_doctor_name in", values, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameNotIn(List<String> values) {
            addCriterion("medical_doctor_name not in", values, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameBetween(String value1, String value2) {
            addCriterion("medical_doctor_name between", value1, value2, "medicalDoctorName");
            return (Criteria) this;
        }

        public Criteria andMedicalDoctorNameNotBetween(String value1, String value2) {
            addCriterion("medical_doctor_name not between", value1, value2, "medicalDoctorName");
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

        public Criteria andCheckTypeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(String value) {
            addCriterion("check_type =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(String value) {
            addCriterion("check_type <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(String value) {
            addCriterion("check_type >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("check_type >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(String value) {
            addCriterion("check_type <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("check_type <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLike(String value) {
            addCriterion("check_type like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotLike(String value) {
            addCriterion("check_type not like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<String> values) {
            addCriterion("check_type in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<String> values) {
            addCriterion("check_type not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(String value1, String value2) {
            addCriterion("check_type between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(String value1, String value2) {
            addCriterion("check_type not between", value1, value2, "checkType");
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