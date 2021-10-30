package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckApplicationExample() {
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

        public Criteria andCheckApplicationNameIsNull() {
            addCriterion("check_application_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameIsNotNull() {
            addCriterion("check_application_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameEqualTo(String value) {
            addCriterion("check_application_name =", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameNotEqualTo(String value) {
            addCriterion("check_application_name <>", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameGreaterThan(String value) {
            addCriterion("check_application_name >", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_application_name >=", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameLessThan(String value) {
            addCriterion("check_application_name <", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameLessThanOrEqualTo(String value) {
            addCriterion("check_application_name <=", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameLike(String value) {
            addCriterion("check_application_name like", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameNotLike(String value) {
            addCriterion("check_application_name not like", value, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameIn(List<String> values) {
            addCriterion("check_application_name in", values, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameNotIn(List<String> values) {
            addCriterion("check_application_name not in", values, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameBetween(String value1, String value2) {
            addCriterion("check_application_name between", value1, value2, "checkApplicationName");
            return (Criteria) this;
        }

        public Criteria andCheckApplicationNameNotBetween(String value1, String value2) {
            addCriterion("check_application_name not between", value1, value2, "checkApplicationName");
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

        public Criteria andCheckItemNosIsNull() {
            addCriterion("check_item_nos is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosIsNotNull() {
            addCriterion("check_item_nos is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosEqualTo(String value) {
            addCriterion("check_item_nos =", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosNotEqualTo(String value) {
            addCriterion("check_item_nos <>", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosGreaterThan(String value) {
            addCriterion("check_item_nos >", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosGreaterThanOrEqualTo(String value) {
            addCriterion("check_item_nos >=", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosLessThan(String value) {
            addCriterion("check_item_nos <", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosLessThanOrEqualTo(String value) {
            addCriterion("check_item_nos <=", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosLike(String value) {
            addCriterion("check_item_nos like", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosNotLike(String value) {
            addCriterion("check_item_nos not like", value, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosIn(List<String> values) {
            addCriterion("check_item_nos in", values, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosNotIn(List<String> values) {
            addCriterion("check_item_nos not in", values, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosBetween(String value1, String value2) {
            addCriterion("check_item_nos between", value1, value2, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNosNotBetween(String value1, String value2) {
            addCriterion("check_item_nos not between", value1, value2, "checkItemNos");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesIsNull() {
            addCriterion("check_item_names is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesIsNotNull() {
            addCriterion("check_item_names is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesEqualTo(String value) {
            addCriterion("check_item_names =", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesNotEqualTo(String value) {
            addCriterion("check_item_names <>", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesGreaterThan(String value) {
            addCriterion("check_item_names >", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesGreaterThanOrEqualTo(String value) {
            addCriterion("check_item_names >=", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesLessThan(String value) {
            addCriterion("check_item_names <", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesLessThanOrEqualTo(String value) {
            addCriterion("check_item_names <=", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesLike(String value) {
            addCriterion("check_item_names like", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesNotLike(String value) {
            addCriterion("check_item_names not like", value, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesIn(List<String> values) {
            addCriterion("check_item_names in", values, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesNotIn(List<String> values) {
            addCriterion("check_item_names not in", values, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesBetween(String value1, String value2) {
            addCriterion("check_item_names between", value1, value2, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andCheckItemNamesNotBetween(String value1, String value2) {
            addCriterion("check_item_names not between", value1, value2, "checkItemNames");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNull() {
            addCriterion("use_state is null");
            return (Criteria) this;
        }

        public Criteria andUseStateIsNotNull() {
            addCriterion("use_state is not null");
            return (Criteria) this;
        }

        public Criteria andUseStateEqualTo(String value) {
            addCriterion("use_state =", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotEqualTo(String value) {
            addCriterion("use_state <>", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThan(String value) {
            addCriterion("use_state >", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateGreaterThanOrEqualTo(String value) {
            addCriterion("use_state >=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThan(String value) {
            addCriterion("use_state <", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLessThanOrEqualTo(String value) {
            addCriterion("use_state <=", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateLike(String value) {
            addCriterion("use_state like", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotLike(String value) {
            addCriterion("use_state not like", value, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateIn(List<String> values) {
            addCriterion("use_state in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotIn(List<String> values) {
            addCriterion("use_state not in", values, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateBetween(String value1, String value2) {
            addCriterion("use_state between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andUseStateNotBetween(String value1, String value2) {
            addCriterion("use_state not between", value1, value2, "useState");
            return (Criteria) this;
        }

        public Criteria andIsFeeIsNull() {
            addCriterion("is_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsFeeIsNotNull() {
            addCriterion("is_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsFeeEqualTo(String value) {
            addCriterion("is_fee =", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotEqualTo(String value) {
            addCriterion("is_fee <>", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeGreaterThan(String value) {
            addCriterion("is_fee >", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeGreaterThanOrEqualTo(String value) {
            addCriterion("is_fee >=", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeLessThan(String value) {
            addCriterion("is_fee <", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeLessThanOrEqualTo(String value) {
            addCriterion("is_fee <=", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeLike(String value) {
            addCriterion("is_fee like", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotLike(String value) {
            addCriterion("is_fee not like", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeIn(List<String> values) {
            addCriterion("is_fee in", values, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotIn(List<String> values) {
            addCriterion("is_fee not in", values, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeBetween(String value1, String value2) {
            addCriterion("is_fee between", value1, value2, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotBetween(String value1, String value2) {
            addCriterion("is_fee not between", value1, value2, "isFee");
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

        public Criteria andBank3IsNull() {
            addCriterion("bank3 is null");
            return (Criteria) this;
        }

        public Criteria andBank3IsNotNull() {
            addCriterion("bank3 is not null");
            return (Criteria) this;
        }

        public Criteria andBank3EqualTo(String value) {
            addCriterion("bank3 =", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3NotEqualTo(String value) {
            addCriterion("bank3 <>", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3GreaterThan(String value) {
            addCriterion("bank3 >", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3GreaterThanOrEqualTo(String value) {
            addCriterion("bank3 >=", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3LessThan(String value) {
            addCriterion("bank3 <", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3LessThanOrEqualTo(String value) {
            addCriterion("bank3 <=", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3Like(String value) {
            addCriterion("bank3 like", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3NotLike(String value) {
            addCriterion("bank3 not like", value, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3In(List<String> values) {
            addCriterion("bank3 in", values, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3NotIn(List<String> values) {
            addCriterion("bank3 not in", values, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3Between(String value1, String value2) {
            addCriterion("bank3 between", value1, value2, "bank3");
            return (Criteria) this;
        }

        public Criteria andBank3NotBetween(String value1, String value2) {
            addCriterion("bank3 not between", value1, value2, "bank3");
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