package com.hospital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrugsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugsExample() {
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

        public Criteria andDrugsCodeIsNull() {
            addCriterion("drugs_code is null");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIsNotNull() {
            addCriterion("drugs_code is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeEqualTo(String value) {
            addCriterion("drugs_code =", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotEqualTo(String value) {
            addCriterion("drugs_code <>", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeGreaterThan(String value) {
            addCriterion("drugs_code >", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_code >=", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLessThan(String value) {
            addCriterion("drugs_code <", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLessThanOrEqualTo(String value) {
            addCriterion("drugs_code <=", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLike(String value) {
            addCriterion("drugs_code like", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotLike(String value) {
            addCriterion("drugs_code not like", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIn(List<String> values) {
            addCriterion("drugs_code in", values, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotIn(List<String> values) {
            addCriterion("drugs_code not in", values, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeBetween(String value1, String value2) {
            addCriterion("drugs_code between", value1, value2, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotBetween(String value1, String value2) {
            addCriterion("drugs_code not between", value1, value2, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNull() {
            addCriterion("drugs_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNotNull() {
            addCriterion("drugs_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameEqualTo(String value) {
            addCriterion("drugs_name =", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotEqualTo(String value) {
            addCriterion("drugs_name <>", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThan(String value) {
            addCriterion("drugs_name >", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_name >=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThan(String value) {
            addCriterion("drugs_name <", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThanOrEqualTo(String value) {
            addCriterion("drugs_name <=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLike(String value) {
            addCriterion("drugs_name like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotLike(String value) {
            addCriterion("drugs_name not like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIn(List<String> values) {
            addCriterion("drugs_name in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotIn(List<String> values) {
            addCriterion("drugs_name not in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameBetween(String value1, String value2) {
            addCriterion("drugs_name between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotBetween(String value1, String value2) {
            addCriterion("drugs_name not between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNull() {
            addCriterion("drugs_format is null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNotNull() {
            addCriterion("drugs_format is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatEqualTo(String value) {
            addCriterion("drugs_format =", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotEqualTo(String value) {
            addCriterion("drugs_format <>", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThan(String value) {
            addCriterion("drugs_format >", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_format >=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThan(String value) {
            addCriterion("drugs_format <", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThanOrEqualTo(String value) {
            addCriterion("drugs_format <=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLike(String value) {
            addCriterion("drugs_format like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotLike(String value) {
            addCriterion("drugs_format not like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIn(List<String> values) {
            addCriterion("drugs_format in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotIn(List<String> values) {
            addCriterion("drugs_format not in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatBetween(String value1, String value2) {
            addCriterion("drugs_format between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotBetween(String value1, String value2) {
            addCriterion("drugs_format not between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIsNull() {
            addCriterion("drugs_unit is null");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIsNotNull() {
            addCriterion("drugs_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitEqualTo(String value) {
            addCriterion("drugs_unit =", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotEqualTo(String value) {
            addCriterion("drugs_unit <>", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitGreaterThan(String value) {
            addCriterion("drugs_unit >", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_unit >=", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLessThan(String value) {
            addCriterion("drugs_unit <", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLessThanOrEqualTo(String value) {
            addCriterion("drugs_unit <=", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLike(String value) {
            addCriterion("drugs_unit like", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotLike(String value) {
            addCriterion("drugs_unit not like", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIn(List<String> values) {
            addCriterion("drugs_unit in", values, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotIn(List<String> values) {
            addCriterion("drugs_unit not in", values, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitBetween(String value1, String value2) {
            addCriterion("drugs_unit between", value1, value2, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotBetween(String value1, String value2) {
            addCriterion("drugs_unit not between", value1, value2, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIsNull() {
            addCriterion("drugs_dosage is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIsNotNull() {
            addCriterion("drugs_dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageEqualTo(String value) {
            addCriterion("drugs_dosage =", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotEqualTo(String value) {
            addCriterion("drugs_dosage <>", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageGreaterThan(String value) {
            addCriterion("drugs_dosage >", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_dosage >=", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLessThan(String value) {
            addCriterion("drugs_dosage <", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLessThanOrEqualTo(String value) {
            addCriterion("drugs_dosage <=", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLike(String value) {
            addCriterion("drugs_dosage like", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotLike(String value) {
            addCriterion("drugs_dosage not like", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIn(List<String> values) {
            addCriterion("drugs_dosage in", values, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotIn(List<String> values) {
            addCriterion("drugs_dosage not in", values, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageBetween(String value1, String value2) {
            addCriterion("drugs_dosage between", value1, value2, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotBetween(String value1, String value2) {
            addCriterion("drugs_dosage not between", value1, value2, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIsNull() {
            addCriterion("drugs_type is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIsNotNull() {
            addCriterion("drugs_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeEqualTo(String value) {
            addCriterion("drugs_type =", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotEqualTo(String value) {
            addCriterion("drugs_type <>", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeGreaterThan(String value) {
            addCriterion("drugs_type >", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("drugs_type >=", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeLessThan(String value) {
            addCriterion("drugs_type <", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeLessThanOrEqualTo(String value) {
            addCriterion("drugs_type <=", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeLike(String value) {
            addCriterion("drugs_type like", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotLike(String value) {
            addCriterion("drugs_type not like", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIn(List<String> values) {
            addCriterion("drugs_type in", values, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotIn(List<String> values) {
            addCriterion("drugs_type not in", values, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeBetween(String value1, String value2) {
            addCriterion("drugs_type between", value1, value2, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotBetween(String value1, String value2) {
            addCriterion("drugs_type not between", value1, value2, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNull() {
            addCriterion("drugs_price is null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNotNull() {
            addCriterion("drugs_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceEqualTo(BigDecimal value) {
            addCriterion("drugs_price =", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotEqualTo(BigDecimal value) {
            addCriterion("drugs_price <>", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThan(BigDecimal value) {
            addCriterion("drugs_price >", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugs_price >=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThan(BigDecimal value) {
            addCriterion("drugs_price <", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugs_price <=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIn(List<BigDecimal> values) {
            addCriterion("drugs_price in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotIn(List<BigDecimal> values) {
            addCriterion("drugs_price not in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugs_price between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugs_price not between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNull() {
            addCriterion("mnemonic_code is null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNotNull() {
            addCriterion("mnemonic_code is not null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeEqualTo(String value) {
            addCriterion("mnemonic_code =", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotEqualTo(String value) {
            addCriterion("mnemonic_code <>", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThan(String value) {
            addCriterion("mnemonic_code >", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mnemonic_code >=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThan(String value) {
            addCriterion("mnemonic_code <", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThanOrEqualTo(String value) {
            addCriterion("mnemonic_code <=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLike(String value) {
            addCriterion("mnemonic_code like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotLike(String value) {
            addCriterion("mnemonic_code not like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIn(List<String> values) {
            addCriterion("mnemonic_code in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotIn(List<String> values) {
            addCriterion("mnemonic_code not in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeBetween(String value1, String value2) {
            addCriterion("mnemonic_code between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotBetween(String value1, String value2) {
            addCriterion("mnemonic_code not between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("CreationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("CreationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("CreationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("CreationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("CreationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("CreationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("CreationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("CreationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("CreationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("CreationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("CreationDate not between", value1, value2, "creationdate");
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