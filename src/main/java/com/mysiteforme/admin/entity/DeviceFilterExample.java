package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceFilterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceFilterExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Long value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Long value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Long value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Long value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Long> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Long> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Long value1, Long value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleIsNull() {
            addCriterion("machine_oil_filte_cycle is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleIsNotNull() {
            addCriterion("machine_oil_filte_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_cycle =", value, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_cycle <>", value, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_filte_cycle >", value, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_cycle >=", value, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleLessThan(BigDecimal value) {
            addCriterion("machine_oil_filte_cycle <", value, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_cycle <=", value, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleIn(List<BigDecimal> values) {
            addCriterion("machine_oil_filte_cycle in", values, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_filte_cycle not in", values, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_filte_cycle between", value1, value2, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_filte_cycle not between", value1, value2, "machineOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumIsNull() {
            addCriterion("machine_oil_filte_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumIsNotNull() {
            addCriterion("machine_oil_filte_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumEqualTo(Integer value) {
            addCriterion("machine_oil_filte_num =", value, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumNotEqualTo(Integer value) {
            addCriterion("machine_oil_filte_num <>", value, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumGreaterThan(Integer value) {
            addCriterion("machine_oil_filte_num >", value, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_oil_filte_num >=", value, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumLessThan(Integer value) {
            addCriterion("machine_oil_filte_num <", value, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumLessThanOrEqualTo(Integer value) {
            addCriterion("machine_oil_filte_num <=", value, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumIn(List<Integer> values) {
            addCriterion("machine_oil_filte_num in", values, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumNotIn(List<Integer> values) {
            addCriterion("machine_oil_filte_num not in", values, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumBetween(Integer value1, Integer value2) {
            addCriterion("machine_oil_filte_num between", value1, value2, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_oil_filte_num not between", value1, value2, "machineOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceIsNull() {
            addCriterion("machine_oil_filte_price is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceIsNotNull() {
            addCriterion("machine_oil_filte_price is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_price =", value, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_price <>", value, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_filte_price >", value, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_price >=", value, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceLessThan(BigDecimal value) {
            addCriterion("machine_oil_filte_price <", value, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_price <=", value, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceIn(List<BigDecimal> values) {
            addCriterion("machine_oil_filte_price in", values, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_filte_price not in", values, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_filte_price between", value1, value2, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFiltePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_filte_price not between", value1, value2, "machineOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeIsNull() {
            addCriterion("machine_oil_filte_change_time is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeIsNotNull() {
            addCriterion("machine_oil_filte_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_change_time =", value, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_change_time <>", value, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_filte_change_time >", value, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_change_time >=", value, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeLessThan(BigDecimal value) {
            addCriterion("machine_oil_filte_change_time <", value, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_filte_change_time <=", value, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeIn(List<BigDecimal> values) {
            addCriterion("machine_oil_filte_change_time in", values, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_filte_change_time not in", values, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_filte_change_time between", value1, value2, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilFilteChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_filte_change_time not between", value1, value2, "machineOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleIsNull() {
            addCriterion("transmission_oil_filte_cycle is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleIsNotNull() {
            addCriterion("transmission_oil_filte_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_cycle =", value, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_cycle <>", value, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_filte_cycle >", value, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_cycle >=", value, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleLessThan(BigDecimal value) {
            addCriterion("transmission_oil_filte_cycle <", value, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_cycle <=", value, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_filte_cycle in", values, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_filte_cycle not in", values, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_filte_cycle between", value1, value2, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_filte_cycle not between", value1, value2, "transmissionOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumIsNull() {
            addCriterion("transmission_oil_filte_num is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumIsNotNull() {
            addCriterion("transmission_oil_filte_num is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumEqualTo(Integer value) {
            addCriterion("transmission_oil_filte_num =", value, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumNotEqualTo(Integer value) {
            addCriterion("transmission_oil_filte_num <>", value, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumGreaterThan(Integer value) {
            addCriterion("transmission_oil_filte_num >", value, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("transmission_oil_filte_num >=", value, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumLessThan(Integer value) {
            addCriterion("transmission_oil_filte_num <", value, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumLessThanOrEqualTo(Integer value) {
            addCriterion("transmission_oil_filte_num <=", value, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumIn(List<Integer> values) {
            addCriterion("transmission_oil_filte_num in", values, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumNotIn(List<Integer> values) {
            addCriterion("transmission_oil_filte_num not in", values, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumBetween(Integer value1, Integer value2) {
            addCriterion("transmission_oil_filte_num between", value1, value2, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("transmission_oil_filte_num not between", value1, value2, "transmissionOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceIsNull() {
            addCriterion("transmission_oil_filte_price is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceIsNotNull() {
            addCriterion("transmission_oil_filte_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_price =", value, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_price <>", value, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_filte_price >", value, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_price >=", value, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceLessThan(BigDecimal value) {
            addCriterion("transmission_oil_filte_price <", value, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte_price <=", value, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_filte_price in", values, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_filte_price not in", values, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_filte_price between", value1, value2, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFiltePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_filte_price not between", value1, value2, "transmissionOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeIsNull() {
            addCriterion("transmission_oil_filte__change_time is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeIsNotNull() {
            addCriterion("transmission_oil_filte__change_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte__change_time =", value, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte__change_time <>", value, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_filte__change_time >", value, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte__change_time >=", value, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeLessThan(BigDecimal value) {
            addCriterion("transmission_oil_filte__change_time <", value, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_filte__change_time <=", value, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_filte__change_time in", values, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_filte__change_time not in", values, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_filte__change_time between", value1, value2, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilFilteChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_filte__change_time not between", value1, value2, "transmissionOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleIsNull() {
            addCriterion("hydraulic_oil_filte_cycle is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleIsNotNull() {
            addCriterion("hydraulic_oil_filte_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_cycle =", value, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_cycle <>", value, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_cycle >", value, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_cycle >=", value, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_cycle <", value, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_cycle <=", value, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_filte_cycle in", values, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_filte_cycle not in", values, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_filte_cycle between", value1, value2, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_filte_cycle not between", value1, value2, "hydraulicOilFilteCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumIsNull() {
            addCriterion("hydraulic_oil_filte_num is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumIsNotNull() {
            addCriterion("hydraulic_oil_filte_num is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumEqualTo(Integer value) {
            addCriterion("hydraulic_oil_filte_num =", value, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumNotEqualTo(Integer value) {
            addCriterion("hydraulic_oil_filte_num <>", value, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumGreaterThan(Integer value) {
            addCriterion("hydraulic_oil_filte_num >", value, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hydraulic_oil_filte_num >=", value, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumLessThan(Integer value) {
            addCriterion("hydraulic_oil_filte_num <", value, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumLessThanOrEqualTo(Integer value) {
            addCriterion("hydraulic_oil_filte_num <=", value, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumIn(List<Integer> values) {
            addCriterion("hydraulic_oil_filte_num in", values, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumNotIn(List<Integer> values) {
            addCriterion("hydraulic_oil_filte_num not in", values, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumBetween(Integer value1, Integer value2) {
            addCriterion("hydraulic_oil_filte_num between", value1, value2, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("hydraulic_oil_filte_num not between", value1, value2, "hydraulicOilFilteNum");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceIsNull() {
            addCriterion("hydraulic_oil_filte_price is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceIsNotNull() {
            addCriterion("hydraulic_oil_filte_price is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_price =", value, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_price <>", value, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_price >", value, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_price >=", value, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_price <", value, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_price <=", value, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_filte_price in", values, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_filte_price not in", values, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_filte_price between", value1, value2, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFiltePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_filte_price not between", value1, value2, "hydraulicOilFiltePrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeIsNull() {
            addCriterion("hydraulic_oil_filte_change_time is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeIsNotNull() {
            addCriterion("hydraulic_oil_filte_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_change_time =", value, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_change_time <>", value, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_change_time >", value, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_change_time >=", value, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_change_time <", value, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_filte_change_time <=", value, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_filte_change_time in", values, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_filte_change_time not in", values, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_filte_change_time between", value1, value2, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilFilteChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_filte_change_time not between", value1, value2, "hydraulicOilFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleIsNull() {
            addCriterion("fuel_filte_cycle is null");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleIsNotNull() {
            addCriterion("fuel_filte_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_cycle =", value, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleNotEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_cycle <>", value, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleGreaterThan(BigDecimal value) {
            addCriterion("fuel_filte_cycle >", value, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_cycle >=", value, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleLessThan(BigDecimal value) {
            addCriterion("fuel_filte_cycle <", value, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_cycle <=", value, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleIn(List<BigDecimal> values) {
            addCriterion("fuel_filte_cycle in", values, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleNotIn(List<BigDecimal> values) {
            addCriterion("fuel_filte_cycle not in", values, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_filte_cycle between", value1, value2, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_filte_cycle not between", value1, value2, "fuelFilteCycle");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumIsNull() {
            addCriterion("fuel_filte_num is null");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumIsNotNull() {
            addCriterion("fuel_filte_num is not null");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumEqualTo(Integer value) {
            addCriterion("fuel_filte_num =", value, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumNotEqualTo(Integer value) {
            addCriterion("fuel_filte_num <>", value, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumGreaterThan(Integer value) {
            addCriterion("fuel_filte_num >", value, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuel_filte_num >=", value, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumLessThan(Integer value) {
            addCriterion("fuel_filte_num <", value, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumLessThanOrEqualTo(Integer value) {
            addCriterion("fuel_filte_num <=", value, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumIn(List<Integer> values) {
            addCriterion("fuel_filte_num in", values, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumNotIn(List<Integer> values) {
            addCriterion("fuel_filte_num not in", values, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumBetween(Integer value1, Integer value2) {
            addCriterion("fuel_filte_num between", value1, value2, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFilteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fuel_filte_num not between", value1, value2, "fuelFilteNum");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceIsNull() {
            addCriterion("fuel_filte_price is null");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceIsNotNull() {
            addCriterion("fuel_filte_price is not null");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_price =", value, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceNotEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_price <>", value, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceGreaterThan(BigDecimal value) {
            addCriterion("fuel_filte_price >", value, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_price >=", value, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceLessThan(BigDecimal value) {
            addCriterion("fuel_filte_price <", value, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_price <=", value, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceIn(List<BigDecimal> values) {
            addCriterion("fuel_filte_price in", values, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceNotIn(List<BigDecimal> values) {
            addCriterion("fuel_filte_price not in", values, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_filte_price between", value1, value2, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFiltePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_filte_price not between", value1, value2, "fuelFiltePrice");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeIsNull() {
            addCriterion("fuel_filte_change_time is null");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeIsNotNull() {
            addCriterion("fuel_filte_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_change_time =", value, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_change_time <>", value, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("fuel_filte_change_time >", value, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_change_time >=", value, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeLessThan(BigDecimal value) {
            addCriterion("fuel_filte_change_time <", value, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_filte_change_time <=", value, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeIn(List<BigDecimal> values) {
            addCriterion("fuel_filte_change_time in", values, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("fuel_filte_change_time not in", values, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_filte_change_time between", value1, value2, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andFuelFilteChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_filte_change_time not between", value1, value2, "fuelFilteChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleIsNull() {
            addCriterion("air_filter_cycle is null");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleIsNotNull() {
            addCriterion("air_filter_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleEqualTo(BigDecimal value) {
            addCriterion("air_filter_cycle =", value, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleNotEqualTo(BigDecimal value) {
            addCriterion("air_filter_cycle <>", value, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleGreaterThan(BigDecimal value) {
            addCriterion("air_filter_cycle >", value, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("air_filter_cycle >=", value, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleLessThan(BigDecimal value) {
            addCriterion("air_filter_cycle <", value, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("air_filter_cycle <=", value, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleIn(List<BigDecimal> values) {
            addCriterion("air_filter_cycle in", values, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleNotIn(List<BigDecimal> values) {
            addCriterion("air_filter_cycle not in", values, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_filter_cycle between", value1, value2, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_filter_cycle not between", value1, value2, "airFilterCycle");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumIsNull() {
            addCriterion("air_filter_num is null");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumIsNotNull() {
            addCriterion("air_filter_num is not null");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumEqualTo(Integer value) {
            addCriterion("air_filter_num =", value, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumNotEqualTo(Integer value) {
            addCriterion("air_filter_num <>", value, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumGreaterThan(Integer value) {
            addCriterion("air_filter_num >", value, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_filter_num >=", value, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumLessThan(Integer value) {
            addCriterion("air_filter_num <", value, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumLessThanOrEqualTo(Integer value) {
            addCriterion("air_filter_num <=", value, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumIn(List<Integer> values) {
            addCriterion("air_filter_num in", values, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumNotIn(List<Integer> values) {
            addCriterion("air_filter_num not in", values, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumBetween(Integer value1, Integer value2) {
            addCriterion("air_filter_num between", value1, value2, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("air_filter_num not between", value1, value2, "airFilterNum");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceIsNull() {
            addCriterion("air_filter_price is null");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceIsNotNull() {
            addCriterion("air_filter_price is not null");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceEqualTo(BigDecimal value) {
            addCriterion("air_filter_price =", value, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceNotEqualTo(BigDecimal value) {
            addCriterion("air_filter_price <>", value, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceGreaterThan(BigDecimal value) {
            addCriterion("air_filter_price >", value, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("air_filter_price >=", value, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceLessThan(BigDecimal value) {
            addCriterion("air_filter_price <", value, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("air_filter_price <=", value, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceIn(List<BigDecimal> values) {
            addCriterion("air_filter_price in", values, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceNotIn(List<BigDecimal> values) {
            addCriterion("air_filter_price not in", values, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_filter_price between", value1, value2, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_filter_price not between", value1, value2, "airFilterPrice");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeIsNull() {
            addCriterion("air_filter_change_time is null");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeIsNotNull() {
            addCriterion("air_filter_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeEqualTo(BigDecimal value) {
            addCriterion("air_filter_change_time =", value, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("air_filter_change_time <>", value, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("air_filter_change_time >", value, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("air_filter_change_time >=", value, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeLessThan(BigDecimal value) {
            addCriterion("air_filter_change_time <", value, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("air_filter_change_time <=", value, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeIn(List<BigDecimal> values) {
            addCriterion("air_filter_change_time in", values, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("air_filter_change_time not in", values, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_filter_change_time between", value1, value2, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andAirFilterChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_filter_change_time not between", value1, value2, "airFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleIsNull() {
            addCriterion("coolant_filter_cycle is null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleIsNotNull() {
            addCriterion("coolant_filter_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_cycle =", value, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleNotEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_cycle <>", value, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleGreaterThan(BigDecimal value) {
            addCriterion("coolant_filter_cycle >", value, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_cycle >=", value, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleLessThan(BigDecimal value) {
            addCriterion("coolant_filter_cycle <", value, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_cycle <=", value, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleIn(List<BigDecimal> values) {
            addCriterion("coolant_filter_cycle in", values, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleNotIn(List<BigDecimal> values) {
            addCriterion("coolant_filter_cycle not in", values, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_filter_cycle between", value1, value2, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_filter_cycle not between", value1, value2, "coolantFilterCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumIsNull() {
            addCriterion("coolant_filter_num is null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumIsNotNull() {
            addCriterion("coolant_filter_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumEqualTo(Integer value) {
            addCriterion("coolant_filter_num =", value, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumNotEqualTo(Integer value) {
            addCriterion("coolant_filter_num <>", value, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumGreaterThan(Integer value) {
            addCriterion("coolant_filter_num >", value, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("coolant_filter_num >=", value, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumLessThan(Integer value) {
            addCriterion("coolant_filter_num <", value, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumLessThanOrEqualTo(Integer value) {
            addCriterion("coolant_filter_num <=", value, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumIn(List<Integer> values) {
            addCriterion("coolant_filter_num in", values, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumNotIn(List<Integer> values) {
            addCriterion("coolant_filter_num not in", values, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumBetween(Integer value1, Integer value2) {
            addCriterion("coolant_filter_num between", value1, value2, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("coolant_filter_num not between", value1, value2, "coolantFilterNum");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceIsNull() {
            addCriterion("coolant_filter_price is null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceIsNotNull() {
            addCriterion("coolant_filter_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_price =", value, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceNotEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_price <>", value, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceGreaterThan(BigDecimal value) {
            addCriterion("coolant_filter_price >", value, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_price >=", value, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceLessThan(BigDecimal value) {
            addCriterion("coolant_filter_price <", value, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_price <=", value, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceIn(List<BigDecimal> values) {
            addCriterion("coolant_filter_price in", values, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceNotIn(List<BigDecimal> values) {
            addCriterion("coolant_filter_price not in", values, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_filter_price between", value1, value2, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_filter_price not between", value1, value2, "coolantFilterPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeIsNull() {
            addCriterion("coolant_filter_change_time is null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeIsNotNull() {
            addCriterion("coolant_filter_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_change_time =", value, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_change_time <>", value, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("coolant_filter_change_time >", value, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_change_time >=", value, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeLessThan(BigDecimal value) {
            addCriterion("coolant_filter_change_time <", value, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_filter_change_time <=", value, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeIn(List<BigDecimal> values) {
            addCriterion("coolant_filter_change_time in", values, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("coolant_filter_change_time not in", values, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_filter_change_time between", value1, value2, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantFilterChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_filter_change_time not between", value1, value2, "coolantFilterChangeTime");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterIsNull() {
            addCriterion("labor_cost_filter is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterIsNotNull() {
            addCriterion("labor_cost_filter is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterEqualTo(BigDecimal value) {
            addCriterion("labor_cost_filter =", value, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterNotEqualTo(BigDecimal value) {
            addCriterion("labor_cost_filter <>", value, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterGreaterThan(BigDecimal value) {
            addCriterion("labor_cost_filter >", value, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_filter >=", value, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterLessThan(BigDecimal value) {
            addCriterion("labor_cost_filter <", value, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_filter <=", value, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterIn(List<BigDecimal> values) {
            addCriterion("labor_cost_filter in", values, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterNotIn(List<BigDecimal> values) {
            addCriterion("labor_cost_filter not in", values, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_filter between", value1, value2, "laborCostFilter");
            return (Criteria) this;
        }

        public Criteria andLaborCostFilterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_filter not between", value1, value2, "laborCostFilter");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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