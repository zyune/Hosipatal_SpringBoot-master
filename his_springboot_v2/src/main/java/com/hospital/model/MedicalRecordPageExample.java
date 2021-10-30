package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalRecordPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalRecordPageExample() {
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

        public Criteria andRegistrationInfoIsNull() {
            addCriterion("registration_info is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoIsNotNull() {
            addCriterion("registration_info is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoEqualTo(Integer value) {
            addCriterion("registration_info =", value, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNotEqualTo(Integer value) {
            addCriterion("registration_info <>", value, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoGreaterThan(Integer value) {
            addCriterion("registration_info >", value, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_info >=", value, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoLessThan(Integer value) {
            addCriterion("registration_info <", value, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoLessThanOrEqualTo(Integer value) {
            addCriterion("registration_info <=", value, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoIn(List<Integer> values) {
            addCriterion("registration_info in", values, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNotIn(List<Integer> values) {
            addCriterion("registration_info not in", values, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoBetween(Integer value1, Integer value2) {
            addCriterion("registration_info between", value1, value2, "registrationInfo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_info not between", value1, value2, "registrationInfo");
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

        public Criteria andChiefComplaintIsNull() {
            addCriterion("chief_complaint is null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIsNotNull() {
            addCriterion("chief_complaint is not null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintEqualTo(String value) {
            addCriterion("chief_complaint =", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotEqualTo(String value) {
            addCriterion("chief_complaint <>", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThan(String value) {
            addCriterion("chief_complaint >", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThanOrEqualTo(String value) {
            addCriterion("chief_complaint >=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThan(String value) {
            addCriterion("chief_complaint <", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThanOrEqualTo(String value) {
            addCriterion("chief_complaint <=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLike(String value) {
            addCriterion("chief_complaint like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotLike(String value) {
            addCriterion("chief_complaint not like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIn(List<String> values) {
            addCriterion("chief_complaint in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotIn(List<String> values) {
            addCriterion("chief_complaint not in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintBetween(String value1, String value2) {
            addCriterion("chief_complaint between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotBetween(String value1, String value2) {
            addCriterion("chief_complaint not between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessIsNull() {
            addCriterion("history_present_illness is null");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessIsNotNull() {
            addCriterion("history_present_illness is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessEqualTo(String value) {
            addCriterion("history_present_illness =", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessNotEqualTo(String value) {
            addCriterion("history_present_illness <>", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessGreaterThan(String value) {
            addCriterion("history_present_illness >", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("history_present_illness >=", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessLessThan(String value) {
            addCriterion("history_present_illness <", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessLessThanOrEqualTo(String value) {
            addCriterion("history_present_illness <=", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessLike(String value) {
            addCriterion("history_present_illness like", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessNotLike(String value) {
            addCriterion("history_present_illness not like", value, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessIn(List<String> values) {
            addCriterion("history_present_illness in", values, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessNotIn(List<String> values) {
            addCriterion("history_present_illness not in", values, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessBetween(String value1, String value2) {
            addCriterion("history_present_illness between", value1, value2, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryPresentIllnessNotBetween(String value1, String value2) {
            addCriterion("history_present_illness not between", value1, value2, "historyPresentIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessIsNull() {
            addCriterion("history_illness is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessIsNotNull() {
            addCriterion("history_illness is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessEqualTo(String value) {
            addCriterion("history_illness =", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessNotEqualTo(String value) {
            addCriterion("history_illness <>", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessGreaterThan(String value) {
            addCriterion("history_illness >", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("history_illness >=", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessLessThan(String value) {
            addCriterion("history_illness <", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessLessThanOrEqualTo(String value) {
            addCriterion("history_illness <=", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessLike(String value) {
            addCriterion("history_illness like", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessNotLike(String value) {
            addCriterion("history_illness not like", value, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessIn(List<String> values) {
            addCriterion("history_illness in", values, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessNotIn(List<String> values) {
            addCriterion("history_illness not in", values, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessBetween(String value1, String value2) {
            addCriterion("history_illness between", value1, value2, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHistoryIllnessNotBetween(String value1, String value2) {
            addCriterion("history_illness not between", value1, value2, "historyIllness");
            return (Criteria) this;
        }

        public Criteria andHealthExamineIsNull() {
            addCriterion("health_examine is null");
            return (Criteria) this;
        }

        public Criteria andHealthExamineIsNotNull() {
            addCriterion("health_examine is not null");
            return (Criteria) this;
        }

        public Criteria andHealthExamineEqualTo(String value) {
            addCriterion("health_examine =", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineNotEqualTo(String value) {
            addCriterion("health_examine <>", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineGreaterThan(String value) {
            addCriterion("health_examine >", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineGreaterThanOrEqualTo(String value) {
            addCriterion("health_examine >=", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineLessThan(String value) {
            addCriterion("health_examine <", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineLessThanOrEqualTo(String value) {
            addCriterion("health_examine <=", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineLike(String value) {
            addCriterion("health_examine like", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineNotLike(String value) {
            addCriterion("health_examine not like", value, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineIn(List<String> values) {
            addCriterion("health_examine in", values, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineNotIn(List<String> values) {
            addCriterion("health_examine not in", values, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineBetween(String value1, String value2) {
            addCriterion("health_examine between", value1, value2, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andHealthExamineNotBetween(String value1, String value2) {
            addCriterion("health_examine not between", value1, value2, "healthExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineIsNull() {
            addCriterion("assist_examine is null");
            return (Criteria) this;
        }

        public Criteria andAssistExamineIsNotNull() {
            addCriterion("assist_examine is not null");
            return (Criteria) this;
        }

        public Criteria andAssistExamineEqualTo(String value) {
            addCriterion("assist_examine =", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineNotEqualTo(String value) {
            addCriterion("assist_examine <>", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineGreaterThan(String value) {
            addCriterion("assist_examine >", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineGreaterThanOrEqualTo(String value) {
            addCriterion("assist_examine >=", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineLessThan(String value) {
            addCriterion("assist_examine <", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineLessThanOrEqualTo(String value) {
            addCriterion("assist_examine <=", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineLike(String value) {
            addCriterion("assist_examine like", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineNotLike(String value) {
            addCriterion("assist_examine not like", value, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineIn(List<String> values) {
            addCriterion("assist_examine in", values, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineNotIn(List<String> values) {
            addCriterion("assist_examine not in", values, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineBetween(String value1, String value2) {
            addCriterion("assist_examine between", value1, value2, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andAssistExamineNotBetween(String value1, String value2) {
            addCriterion("assist_examine not between", value1, value2, "assistExamine");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosIsNull() {
            addCriterion("diagnosi_nos is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosIsNotNull() {
            addCriterion("diagnosi_nos is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosEqualTo(String value) {
            addCriterion("diagnosi_nos =", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosNotEqualTo(String value) {
            addCriterion("diagnosi_nos <>", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosGreaterThan(String value) {
            addCriterion("diagnosi_nos >", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosi_nos >=", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosLessThan(String value) {
            addCriterion("diagnosi_nos <", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosLessThanOrEqualTo(String value) {
            addCriterion("diagnosi_nos <=", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosLike(String value) {
            addCriterion("diagnosi_nos like", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosNotLike(String value) {
            addCriterion("diagnosi_nos not like", value, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosIn(List<String> values) {
            addCriterion("diagnosi_nos in", values, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosNotIn(List<String> values) {
            addCriterion("diagnosi_nos not in", values, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosBetween(String value1, String value2) {
            addCriterion("diagnosi_nos between", value1, value2, "diagnosiNos");
            return (Criteria) this;
        }

        public Criteria andDiagnosiNosNotBetween(String value1, String value2) {
            addCriterion("diagnosi_nos not between", value1, value2, "diagnosiNos");
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