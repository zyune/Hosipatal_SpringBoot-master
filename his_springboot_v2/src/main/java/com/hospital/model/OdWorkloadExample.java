package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OdWorkloadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdWorkloadExample() {
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

        public Criteria andCheckSumPriceIsNull() {
            addCriterion("check_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceIsNotNull() {
            addCriterion("check_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceEqualTo(Double value) {
            addCriterion("check_sum_price =", value, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceNotEqualTo(Double value) {
            addCriterion("check_sum_price <>", value, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceGreaterThan(Double value) {
            addCriterion("check_sum_price >", value, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("check_sum_price >=", value, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceLessThan(Double value) {
            addCriterion("check_sum_price <", value, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("check_sum_price <=", value, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceIn(List<Double> values) {
            addCriterion("check_sum_price in", values, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceNotIn(List<Double> values) {
            addCriterion("check_sum_price not in", values, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceBetween(Double value1, Double value2) {
            addCriterion("check_sum_price between", value1, value2, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andCheckSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("check_sum_price not between", value1, value2, "checkSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceIsNull() {
            addCriterion("dispose_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceIsNotNull() {
            addCriterion("dispose_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceEqualTo(Double value) {
            addCriterion("dispose_sum_price =", value, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceNotEqualTo(Double value) {
            addCriterion("dispose_sum_price <>", value, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceGreaterThan(Double value) {
            addCriterion("dispose_sum_price >", value, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dispose_sum_price >=", value, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceLessThan(Double value) {
            addCriterion("dispose_sum_price <", value, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("dispose_sum_price <=", value, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceIn(List<Double> values) {
            addCriterion("dispose_sum_price in", values, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceNotIn(List<Double> values) {
            addCriterion("dispose_sum_price not in", values, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceBetween(Double value1, Double value2) {
            addCriterion("dispose_sum_price between", value1, value2, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("dispose_sum_price not between", value1, value2, "disposeSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceIsNull() {
            addCriterion("inspection_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceIsNotNull() {
            addCriterion("inspection_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceEqualTo(Double value) {
            addCriterion("inspection_sum_price =", value, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceNotEqualTo(Double value) {
            addCriterion("inspection_sum_price <>", value, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceGreaterThan(Double value) {
            addCriterion("inspection_sum_price >", value, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("inspection_sum_price >=", value, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceLessThan(Double value) {
            addCriterion("inspection_sum_price <", value, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("inspection_sum_price <=", value, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceIn(List<Double> values) {
            addCriterion("inspection_sum_price in", values, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceNotIn(List<Double> values) {
            addCriterion("inspection_sum_price not in", values, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceBetween(Double value1, Double value2) {
            addCriterion("inspection_sum_price between", value1, value2, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andInspectionSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("inspection_sum_price not between", value1, value2, "inspectionSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceIsNull() {
            addCriterion("herbal_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceIsNotNull() {
            addCriterion("herbal_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceEqualTo(Double value) {
            addCriterion("herbal_sum_price =", value, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceNotEqualTo(Double value) {
            addCriterion("herbal_sum_price <>", value, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceGreaterThan(Double value) {
            addCriterion("herbal_sum_price >", value, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("herbal_sum_price >=", value, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceLessThan(Double value) {
            addCriterion("herbal_sum_price <", value, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("herbal_sum_price <=", value, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceIn(List<Double> values) {
            addCriterion("herbal_sum_price in", values, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceNotIn(List<Double> values) {
            addCriterion("herbal_sum_price not in", values, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceBetween(Double value1, Double value2) {
            addCriterion("herbal_sum_price between", value1, value2, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andHerbalSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("herbal_sum_price not between", value1, value2, "herbalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceIsNull() {
            addCriterion("medical_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceIsNotNull() {
            addCriterion("medical_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceEqualTo(Double value) {
            addCriterion("medical_sum_price =", value, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceNotEqualTo(Double value) {
            addCriterion("medical_sum_price <>", value, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceGreaterThan(Double value) {
            addCriterion("medical_sum_price >", value, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medical_sum_price >=", value, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceLessThan(Double value) {
            addCriterion("medical_sum_price <", value, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("medical_sum_price <=", value, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceIn(List<Double> values) {
            addCriterion("medical_sum_price in", values, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceNotIn(List<Double> values) {
            addCriterion("medical_sum_price not in", values, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceBetween(Double value1, Double value2) {
            addCriterion("medical_sum_price between", value1, value2, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andMedicalSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("medical_sum_price not between", value1, value2, "medicalSumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceIsNull() {
            addCriterion("surgery_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceIsNotNull() {
            addCriterion("surgery_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceEqualTo(Double value) {
            addCriterion("surgery_sum_price =", value, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceNotEqualTo(Double value) {
            addCriterion("surgery_sum_price <>", value, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceGreaterThan(Double value) {
            addCriterion("surgery_sum_price >", value, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("surgery_sum_price >=", value, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceLessThan(Double value) {
            addCriterion("surgery_sum_price <", value, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceLessThanOrEqualTo(Double value) {
            addCriterion("surgery_sum_price <=", value, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceIn(List<Double> values) {
            addCriterion("surgery_sum_price in", values, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceNotIn(List<Double> values) {
            addCriterion("surgery_sum_price not in", values, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceBetween(Double value1, Double value2) {
            addCriterion("surgery_sum_price between", value1, value2, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andSurgerySumPriceNotBetween(Double value1, Double value2) {
            addCriterion("surgery_sum_price not between", value1, value2, "surgerySumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceIsNull() {
            addCriterion("registered_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceIsNotNull() {
            addCriterion("registered_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceEqualTo(Double value) {
            addCriterion("registered_sum_price =", value, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceNotEqualTo(Double value) {
            addCriterion("registered_sum_price <>", value, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceGreaterThan(Double value) {
            addCriterion("registered_sum_price >", value, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("registered_sum_price >=", value, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceLessThan(Double value) {
            addCriterion("registered_sum_price <", value, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("registered_sum_price <=", value, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceIn(List<Double> values) {
            addCriterion("registered_sum_price in", values, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceNotIn(List<Double> values) {
            addCriterion("registered_sum_price not in", values, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceBetween(Double value1, Double value2) {
            addCriterion("registered_sum_price between", value1, value2, "registeredSumPrice");
            return (Criteria) this;
        }

        public Criteria andRegisteredSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("registered_sum_price not between", value1, value2, "registeredSumPrice");
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

        public Criteria andSumPriceEqualTo(Double value) {
            addCriterion("sum_price =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(Double value) {
            addCriterion("sum_price <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(Double value) {
            addCriterion("sum_price >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_price >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(Double value) {
            addCriterion("sum_price <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("sum_price <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<Double> values) {
            addCriterion("sum_price in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<Double> values) {
            addCriterion("sum_price not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(Double value1, Double value2) {
            addCriterion("sum_price between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("sum_price not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceIsNull() {
            addCriterion("other_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceIsNotNull() {
            addCriterion("other_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceEqualTo(Double value) {
            addCriterion("other_sum_price =", value, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceNotEqualTo(Double value) {
            addCriterion("other_sum_price <>", value, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceGreaterThan(Double value) {
            addCriterion("other_sum_price >", value, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("other_sum_price >=", value, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceLessThan(Double value) {
            addCriterion("other_sum_price <", value, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("other_sum_price <=", value, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceIn(List<Double> values) {
            addCriterion("other_sum_price in", values, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceNotIn(List<Double> values) {
            addCriterion("other_sum_price not in", values, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceBetween(Double value1, Double value2) {
            addCriterion("other_sum_price between", value1, value2, "otherSumPrice");
            return (Criteria) this;
        }

        public Criteria andOtherSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("other_sum_price not between", value1, value2, "otherSumPrice");
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