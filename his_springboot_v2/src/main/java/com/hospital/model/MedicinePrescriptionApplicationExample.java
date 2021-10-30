package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicinePrescriptionApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicinePrescriptionApplicationExample() {
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

        public Criteria andClinicalImpressionIsNull() {
            addCriterion("clinical_impression is null");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionIsNotNull() {
            addCriterion("clinical_impression is not null");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionEqualTo(String value) {
            addCriterion("clinical_impression =", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionNotEqualTo(String value) {
            addCriterion("clinical_impression <>", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionGreaterThan(String value) {
            addCriterion("clinical_impression >", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionGreaterThanOrEqualTo(String value) {
            addCriterion("clinical_impression >=", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionLessThan(String value) {
            addCriterion("clinical_impression <", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionLessThanOrEqualTo(String value) {
            addCriterion("clinical_impression <=", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionLike(String value) {
            addCriterion("clinical_impression like", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionNotLike(String value) {
            addCriterion("clinical_impression not like", value, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionIn(List<String> values) {
            addCriterion("clinical_impression in", values, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionNotIn(List<String> values) {
            addCriterion("clinical_impression not in", values, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionBetween(String value1, String value2) {
            addCriterion("clinical_impression between", value1, value2, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalImpressionNotBetween(String value1, String value2) {
            addCriterion("clinical_impression not between", value1, value2, "clinicalImpression");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisIsNull() {
            addCriterion("clinical_diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisIsNotNull() {
            addCriterion("clinical_diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisEqualTo(String value) {
            addCriterion("clinical_diagnosis =", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotEqualTo(String value) {
            addCriterion("clinical_diagnosis <>", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisGreaterThan(String value) {
            addCriterion("clinical_diagnosis >", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("clinical_diagnosis >=", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisLessThan(String value) {
            addCriterion("clinical_diagnosis <", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("clinical_diagnosis <=", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisLike(String value) {
            addCriterion("clinical_diagnosis like", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotLike(String value) {
            addCriterion("clinical_diagnosis not like", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisIn(List<String> values) {
            addCriterion("clinical_diagnosis in", values, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotIn(List<String> values) {
            addCriterion("clinical_diagnosis not in", values, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisBetween(String value1, String value2) {
            addCriterion("clinical_diagnosis between", value1, value2, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotBetween(String value1, String value2) {
            addCriterion("clinical_diagnosis not between", value1, value2, "clinicalDiagnosis");
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

        public Criteria andMedicinePrescriptionDrugsNosIsNull() {
            addCriterion("medicine_prescription_drugs_nos is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosIsNotNull() {
            addCriterion("medicine_prescription_drugs_nos is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_nos =", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosNotEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_nos <>", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosGreaterThan(String value) {
            addCriterion("medicine_prescription_drugs_nos >", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_nos >=", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosLessThan(String value) {
            addCriterion("medicine_prescription_drugs_nos <", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosLessThanOrEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_nos <=", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosLike(String value) {
            addCriterion("medicine_prescription_drugs_nos like", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosNotLike(String value) {
            addCriterion("medicine_prescription_drugs_nos not like", value, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosIn(List<String> values) {
            addCriterion("medicine_prescription_drugs_nos in", values, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosNotIn(List<String> values) {
            addCriterion("medicine_prescription_drugs_nos not in", values, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosBetween(String value1, String value2) {
            addCriterion("medicine_prescription_drugs_nos between", value1, value2, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNosNotBetween(String value1, String value2) {
            addCriterion("medicine_prescription_drugs_nos not between", value1, value2, "medicinePrescriptionDrugsNos");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesIsNull() {
            addCriterion("medicine_prescription_drugs_names is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesIsNotNull() {
            addCriterion("medicine_prescription_drugs_names is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names =", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names <>", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesGreaterThan(String value) {
            addCriterion("medicine_prescription_drugs_names >", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names >=", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesLessThan(String value) {
            addCriterion("medicine_prescription_drugs_names <", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesLessThanOrEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names <=", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesLike(String value) {
            addCriterion("medicine_prescription_drugs_names like", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotLike(String value) {
            addCriterion("medicine_prescription_drugs_names not like", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesIn(List<String> values) {
            addCriterion("medicine_prescription_drugs_names in", values, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotIn(List<String> values) {
            addCriterion("medicine_prescription_drugs_names not in", values, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesBetween(String value1, String value2) {
            addCriterion("medicine_prescription_drugs_names between", value1, value2, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotBetween(String value1, String value2) {
            addCriterion("medicine_prescription_drugs_names not between", value1, value2, "medicinePrescriptionDrugsNames");
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

        public Criteria andDistributionStateIsNull() {
            addCriterion("distribution_state is null");
            return (Criteria) this;
        }

        public Criteria andDistributionStateIsNotNull() {
            addCriterion("distribution_state is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionStateEqualTo(String value) {
            addCriterion("distribution_state =", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateNotEqualTo(String value) {
            addCriterion("distribution_state <>", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateGreaterThan(String value) {
            addCriterion("distribution_state >", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_state >=", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateLessThan(String value) {
            addCriterion("distribution_state <", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateLessThanOrEqualTo(String value) {
            addCriterion("distribution_state <=", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateLike(String value) {
            addCriterion("distribution_state like", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateNotLike(String value) {
            addCriterion("distribution_state not like", value, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateIn(List<String> values) {
            addCriterion("distribution_state in", values, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateNotIn(List<String> values) {
            addCriterion("distribution_state not in", values, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateBetween(String value1, String value2) {
            addCriterion("distribution_state between", value1, value2, "distributionState");
            return (Criteria) this;
        }

        public Criteria andDistributionStateNotBetween(String value1, String value2) {
            addCriterion("distribution_state not between", value1, value2, "distributionState");
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