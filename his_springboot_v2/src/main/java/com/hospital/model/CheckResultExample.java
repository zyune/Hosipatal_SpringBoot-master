package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckResultExample() {
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

        public Criteria andRequirementsIsNull() {
            addCriterion("requirements is null");
            return (Criteria) this;
        }

        public Criteria andRequirementsIsNotNull() {
            addCriterion("requirements is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementsEqualTo(String value) {
            addCriterion("requirements =", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotEqualTo(String value) {
            addCriterion("requirements <>", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsGreaterThan(String value) {
            addCriterion("requirements >", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("requirements >=", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLessThan(String value) {
            addCriterion("requirements <", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLessThanOrEqualTo(String value) {
            addCriterion("requirements <=", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLike(String value) {
            addCriterion("requirements like", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotLike(String value) {
            addCriterion("requirements not like", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsIn(List<String> values) {
            addCriterion("requirements in", values, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotIn(List<String> values) {
            addCriterion("requirements not in", values, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsBetween(String value1, String value2) {
            addCriterion("requirements between", value1, value2, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotBetween(String value1, String value2) {
            addCriterion("requirements not between", value1, value2, "requirements");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoIsNull() {
            addCriterion("check_item_no is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoIsNotNull() {
            addCriterion("check_item_no is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoEqualTo(Integer value) {
            addCriterion("check_item_no =", value, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoNotEqualTo(Integer value) {
            addCriterion("check_item_no <>", value, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoGreaterThan(Integer value) {
            addCriterion("check_item_no >", value, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_item_no >=", value, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoLessThan(Integer value) {
            addCriterion("check_item_no <", value, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoLessThanOrEqualTo(Integer value) {
            addCriterion("check_item_no <=", value, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoIn(List<Integer> values) {
            addCriterion("check_item_no in", values, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoNotIn(List<Integer> values) {
            addCriterion("check_item_no not in", values, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoBetween(Integer value1, Integer value2) {
            addCriterion("check_item_no between", value1, value2, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNoNotBetween(Integer value1, Integer value2) {
            addCriterion("check_item_no not between", value1, value2, "checkItemNo");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameIsNull() {
            addCriterion("check_item_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameIsNotNull() {
            addCriterion("check_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameEqualTo(String value) {
            addCriterion("check_item_name =", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotEqualTo(String value) {
            addCriterion("check_item_name <>", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameGreaterThan(String value) {
            addCriterion("check_item_name >", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_item_name >=", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameLessThan(String value) {
            addCriterion("check_item_name <", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameLessThanOrEqualTo(String value) {
            addCriterion("check_item_name <=", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameLike(String value) {
            addCriterion("check_item_name like", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotLike(String value) {
            addCriterion("check_item_name not like", value, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameIn(List<String> values) {
            addCriterion("check_item_name in", values, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotIn(List<String> values) {
            addCriterion("check_item_name not in", values, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameBetween(String value1, String value2) {
            addCriterion("check_item_name between", value1, value2, "checkItemName");
            return (Criteria) this;
        }

        public Criteria andCheckItemNameNotBetween(String value1, String value2) {
            addCriterion("check_item_name not between", value1, value2, "checkItemName");
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

        public Criteria andCheckResultIsNull() {
            addCriterion("check_result is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(String value) {
            addCriterion("check_result =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(String value) {
            addCriterion("check_result <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(String value) {
            addCriterion("check_result >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("check_result >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(String value) {
            addCriterion("check_result <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(String value) {
            addCriterion("check_result <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLike(String value) {
            addCriterion("check_result like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotLike(String value) {
            addCriterion("check_result not like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<String> values) {
            addCriterion("check_result in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<String> values) {
            addCriterion("check_result not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(String value1, String value2) {
            addCriterion("check_result between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(String value1, String value2) {
            addCriterion("check_result not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsIsNull() {
            addCriterion("check_result_imgs is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsIsNotNull() {
            addCriterion("check_result_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsEqualTo(String value) {
            addCriterion("check_result_imgs =", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsNotEqualTo(String value) {
            addCriterion("check_result_imgs <>", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsGreaterThan(String value) {
            addCriterion("check_result_imgs >", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsGreaterThanOrEqualTo(String value) {
            addCriterion("check_result_imgs >=", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsLessThan(String value) {
            addCriterion("check_result_imgs <", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsLessThanOrEqualTo(String value) {
            addCriterion("check_result_imgs <=", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsLike(String value) {
            addCriterion("check_result_imgs like", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsNotLike(String value) {
            addCriterion("check_result_imgs not like", value, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsIn(List<String> values) {
            addCriterion("check_result_imgs in", values, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsNotIn(List<String> values) {
            addCriterion("check_result_imgs not in", values, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsBetween(String value1, String value2) {
            addCriterion("check_result_imgs between", value1, value2, "checkResultImgs");
            return (Criteria) this;
        }

        public Criteria andCheckResultImgsNotBetween(String value1, String value2) {
            addCriterion("check_result_imgs not between", value1, value2, "checkResultImgs");
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