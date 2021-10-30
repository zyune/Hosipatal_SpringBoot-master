package com.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckStackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckStackExample() {
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

        public Criteria andCheckStackNameIsNull() {
            addCriterion("check_stack_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameIsNotNull() {
            addCriterion("check_stack_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameEqualTo(String value) {
            addCriterion("check_stack_name =", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameNotEqualTo(String value) {
            addCriterion("check_stack_name <>", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameGreaterThan(String value) {
            addCriterion("check_stack_name >", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_stack_name >=", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameLessThan(String value) {
            addCriterion("check_stack_name <", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameLessThanOrEqualTo(String value) {
            addCriterion("check_stack_name <=", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameLike(String value) {
            addCriterion("check_stack_name like", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameNotLike(String value) {
            addCriterion("check_stack_name not like", value, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameIn(List<String> values) {
            addCriterion("check_stack_name in", values, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameNotIn(List<String> values) {
            addCriterion("check_stack_name not in", values, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameBetween(String value1, String value2) {
            addCriterion("check_stack_name between", value1, value2, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andCheckStackNameNotBetween(String value1, String value2) {
            addCriterion("check_stack_name not between", value1, value2, "checkStackName");
            return (Criteria) this;
        }

        public Criteria andUsableRangeIsNull() {
            addCriterion("usable_range is null");
            return (Criteria) this;
        }

        public Criteria andUsableRangeIsNotNull() {
            addCriterion("usable_range is not null");
            return (Criteria) this;
        }

        public Criteria andUsableRangeEqualTo(String value) {
            addCriterion("usable_range =", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeNotEqualTo(String value) {
            addCriterion("usable_range <>", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeGreaterThan(String value) {
            addCriterion("usable_range >", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeGreaterThanOrEqualTo(String value) {
            addCriterion("usable_range >=", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeLessThan(String value) {
            addCriterion("usable_range <", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeLessThanOrEqualTo(String value) {
            addCriterion("usable_range <=", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeLike(String value) {
            addCriterion("usable_range like", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeNotLike(String value) {
            addCriterion("usable_range not like", value, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeIn(List<String> values) {
            addCriterion("usable_range in", values, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeNotIn(List<String> values) {
            addCriterion("usable_range not in", values, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeBetween(String value1, String value2) {
            addCriterion("usable_range between", value1, value2, "usableRange");
            return (Criteria) this;
        }

        public Criteria andUsableRangeNotBetween(String value1, String value2) {
            addCriterion("usable_range not between", value1, value2, "usableRange");
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

        public Criteria andDepartmentNoEqualTo(String value) {
            addCriterion("department_no =", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotEqualTo(String value) {
            addCriterion("department_no <>", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoGreaterThan(String value) {
            addCriterion("department_no >", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoGreaterThanOrEqualTo(String value) {
            addCriterion("department_no >=", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLessThan(String value) {
            addCriterion("department_no <", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLessThanOrEqualTo(String value) {
            addCriterion("department_no <=", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLike(String value) {
            addCriterion("department_no like", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotLike(String value) {
            addCriterion("department_no not like", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIn(List<String> values) {
            addCriterion("department_no in", values, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotIn(List<String> values) {
            addCriterion("department_no not in", values, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoBetween(String value1, String value2) {
            addCriterion("department_no between", value1, value2, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotBetween(String value1, String value2) {
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

        public Criteria andFmedItemNosIsNull() {
            addCriterion("fmed_item_nos is null");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosIsNotNull() {
            addCriterion("fmed_item_nos is not null");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosEqualTo(String value) {
            addCriterion("fmed_item_nos =", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosNotEqualTo(String value) {
            addCriterion("fmed_item_nos <>", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosGreaterThan(String value) {
            addCriterion("fmed_item_nos >", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosGreaterThanOrEqualTo(String value) {
            addCriterion("fmed_item_nos >=", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosLessThan(String value) {
            addCriterion("fmed_item_nos <", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosLessThanOrEqualTo(String value) {
            addCriterion("fmed_item_nos <=", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosLike(String value) {
            addCriterion("fmed_item_nos like", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosNotLike(String value) {
            addCriterion("fmed_item_nos not like", value, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosIn(List<String> values) {
            addCriterion("fmed_item_nos in", values, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosNotIn(List<String> values) {
            addCriterion("fmed_item_nos not in", values, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosBetween(String value1, String value2) {
            addCriterion("fmed_item_nos between", value1, value2, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNosNotBetween(String value1, String value2) {
            addCriterion("fmed_item_nos not between", value1, value2, "fmedItemNos");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesIsNull() {
            addCriterion("fmed_item_names is null");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesIsNotNull() {
            addCriterion("fmed_item_names is not null");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesEqualTo(String value) {
            addCriterion("fmed_item_names =", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesNotEqualTo(String value) {
            addCriterion("fmed_item_names <>", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesGreaterThan(String value) {
            addCriterion("fmed_item_names >", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesGreaterThanOrEqualTo(String value) {
            addCriterion("fmed_item_names >=", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesLessThan(String value) {
            addCriterion("fmed_item_names <", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesLessThanOrEqualTo(String value) {
            addCriterion("fmed_item_names <=", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesLike(String value) {
            addCriterion("fmed_item_names like", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesNotLike(String value) {
            addCriterion("fmed_item_names not like", value, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesIn(List<String> values) {
            addCriterion("fmed_item_names in", values, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesNotIn(List<String> values) {
            addCriterion("fmed_item_names not in", values, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesBetween(String value1, String value2) {
            addCriterion("fmed_item_names between", value1, value2, "fmedItemNames");
            return (Criteria) this;
        }

        public Criteria andFmedItemNamesNotBetween(String value1, String value2) {
            addCriterion("fmed_item_names not between", value1, value2, "fmedItemNames");
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