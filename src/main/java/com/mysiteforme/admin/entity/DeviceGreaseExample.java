package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceGreaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceGreaseExample() {
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

        public Criteria andMachineOilCycleIsNull() {
            addCriterion("machine_oil_cycle is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleIsNotNull() {
            addCriterion("machine_oil_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleEqualTo(BigDecimal value) {
            addCriterion("machine_oil_cycle =", value, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_cycle <>", value, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_cycle >", value, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_cycle >=", value, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleLessThan(BigDecimal value) {
            addCriterion("machine_oil_cycle <", value, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_cycle <=", value, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleIn(List<BigDecimal> values) {
            addCriterion("machine_oil_cycle in", values, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_cycle not in", values, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_cycle between", value1, value2, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_cycle not between", value1, value2, "machineOilCycle");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityIsNull() {
            addCriterion("machine_oil_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityIsNotNull() {
            addCriterion("machine_oil_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityEqualTo(BigDecimal value) {
            addCriterion("machine_oil_quantity =", value, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_quantity <>", value, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_quantity >", value, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_quantity >=", value, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityLessThan(BigDecimal value) {
            addCriterion("machine_oil_quantity <", value, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_quantity <=", value, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityIn(List<BigDecimal> values) {
            addCriterion("machine_oil_quantity in", values, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_quantity not in", values, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_quantity between", value1, value2, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_quantity not between", value1, value2, "machineOilQuantity");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceIsNull() {
            addCriterion("machine_oil_price is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceIsNotNull() {
            addCriterion("machine_oil_price is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceEqualTo(BigDecimal value) {
            addCriterion("machine_oil_price =", value, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_price <>", value, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_price >", value, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_price >=", value, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceLessThan(BigDecimal value) {
            addCriterion("machine_oil_price <", value, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_price <=", value, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceIn(List<BigDecimal> values) {
            addCriterion("machine_oil_price in", values, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_price not in", values, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_price between", value1, value2, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_price not between", value1, value2, "machineOilPrice");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeIsNull() {
            addCriterion("machine_oil_change_time is null");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeIsNotNull() {
            addCriterion("machine_oil_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeEqualTo(BigDecimal value) {
            addCriterion("machine_oil_change_time =", value, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("machine_oil_change_time <>", value, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("machine_oil_change_time >", value, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_change_time >=", value, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeLessThan(BigDecimal value) {
            addCriterion("machine_oil_change_time <", value, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_oil_change_time <=", value, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeIn(List<BigDecimal> values) {
            addCriterion("machine_oil_change_time in", values, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("machine_oil_change_time not in", values, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_change_time between", value1, value2, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andMachineOilChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_oil_change_time not between", value1, value2, "machineOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleIsNull() {
            addCriterion("transmission_oil_cycle is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleIsNotNull() {
            addCriterion("transmission_oil_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_cycle =", value, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_cycle <>", value, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_cycle >", value, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_cycle >=", value, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleLessThan(BigDecimal value) {
            addCriterion("transmission_oil_cycle <", value, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_cycle <=", value, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_cycle in", values, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_cycle not in", values, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_cycle between", value1, value2, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_cycle not between", value1, value2, "transmissionOilCycle");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityIsNull() {
            addCriterion("transmission_oil_quantity is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityIsNotNull() {
            addCriterion("transmission_oil_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_quantity =", value, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_quantity <>", value, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_quantity >", value, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_quantity >=", value, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityLessThan(BigDecimal value) {
            addCriterion("transmission_oil_quantity <", value, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_quantity <=", value, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_quantity in", values, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_quantity not in", values, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_quantity between", value1, value2, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_quantity not between", value1, value2, "transmissionOilQuantity");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceIsNull() {
            addCriterion("transmission_oil_price is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceIsNotNull() {
            addCriterion("transmission_oil_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_price =", value, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_price <>", value, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_price >", value, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_price >=", value, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceLessThan(BigDecimal value) {
            addCriterion("transmission_oil_price <", value, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_price <=", value, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_price in", values, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_price not in", values, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_price between", value1, value2, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_price not between", value1, value2, "transmissionOilPrice");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeIsNull() {
            addCriterion("transmission_oil_change_time is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeIsNotNull() {
            addCriterion("transmission_oil_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_change_time =", value, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_change_time <>", value, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("transmission_oil_change_time >", value, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_change_time >=", value, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeLessThan(BigDecimal value) {
            addCriterion("transmission_oil_change_time <", value, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transmission_oil_change_time <=", value, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_change_time in", values, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("transmission_oil_change_time not in", values, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_change_time between", value1, value2, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andTransmissionOilChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transmission_oil_change_time not between", value1, value2, "transmissionOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleIsNull() {
            addCriterion("finaldrive_oil_cycle is null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleIsNotNull() {
            addCriterion("finaldrive_oil_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_cycle =", value, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleNotEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_cycle <>", value, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleGreaterThan(BigDecimal value) {
            addCriterion("finaldrive_oil_cycle >", value, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_cycle >=", value, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleLessThan(BigDecimal value) {
            addCriterion("finaldrive_oil_cycle <", value, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_cycle <=", value, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_cycle in", values, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleNotIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_cycle not in", values, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_cycle between", value1, value2, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_cycle not between", value1, value2, "finaldriveOilCycle");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityIsNull() {
            addCriterion("finaldrive_oil_quantity is null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityIsNotNull() {
            addCriterion("finaldrive_oil_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_quantity =", value, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityNotEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_quantity <>", value, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityGreaterThan(BigDecimal value) {
            addCriterion("finaldrive_oil_quantity >", value, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_quantity >=", value, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityLessThan(BigDecimal value) {
            addCriterion("finaldrive_oil_quantity <", value, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_quantity <=", value, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_quantity in", values, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityNotIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_quantity not in", values, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_quantity between", value1, value2, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_quantity not between", value1, value2, "finaldriveOilQuantity");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceIsNull() {
            addCriterion("finaldrive_oil_price is null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceIsNotNull() {
            addCriterion("finaldrive_oil_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_price =", value, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceNotEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_price <>", value, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceGreaterThan(BigDecimal value) {
            addCriterion("finaldrive_oil_price >", value, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_price >=", value, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceLessThan(BigDecimal value) {
            addCriterion("finaldrive_oil_price <", value, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_price <=", value, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_price in", values, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceNotIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_price not in", values, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_price between", value1, value2, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_price not between", value1, value2, "finaldriveOilPrice");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeIsNull() {
            addCriterion("finaldrive_oil_change_time is null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeIsNotNull() {
            addCriterion("finaldrive_oil_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_change_time =", value, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_change_time <>", value, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("finaldrive_oil_change_time >", value, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_change_time >=", value, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeLessThan(BigDecimal value) {
            addCriterion("finaldrive_oil_change_time <", value, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finaldrive_oil_change_time <=", value, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_change_time in", values, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("finaldrive_oil_change_time not in", values, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_change_time between", value1, value2, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andFinaldriveOilChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finaldrive_oil_change_time not between", value1, value2, "finaldriveOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleIsNull() {
            addCriterion("hydraulic_oil_cycle is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleIsNotNull() {
            addCriterion("hydraulic_oil_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_cycle =", value, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_cycle <>", value, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_cycle >", value, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_cycle >=", value, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_cycle <", value, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_cycle <=", value, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_cycle in", values, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_cycle not in", values, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_cycle between", value1, value2, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_cycle not between", value1, value2, "hydraulicOilCycle");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityIsNull() {
            addCriterion("hydraulic_oil_quantity is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityIsNotNull() {
            addCriterion("hydraulic_oil_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_quantity =", value, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_quantity <>", value, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_quantity >", value, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_quantity >=", value, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_quantity <", value, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_quantity <=", value, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_quantity in", values, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_quantity not in", values, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_quantity between", value1, value2, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_quantity not between", value1, value2, "hydraulicOilQuantity");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceIsNull() {
            addCriterion("hydraulic_oil_price is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceIsNotNull() {
            addCriterion("hydraulic_oil_price is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_price =", value, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_price <>", value, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_price >", value, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_price >=", value, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_price <", value, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_price <=", value, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_price in", values, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_price not in", values, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_price between", value1, value2, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_price not between", value1, value2, "hydraulicOilPrice");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeIsNull() {
            addCriterion("hydraulic_oil_change_time is null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeIsNotNull() {
            addCriterion("hydraulic_oil_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_change_time =", value, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_change_time <>", value, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("hydraulic_oil_change_time >", value, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_change_time >=", value, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeLessThan(BigDecimal value) {
            addCriterion("hydraulic_oil_change_time <", value, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hydraulic_oil_change_time <=", value, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_change_time in", values, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("hydraulic_oil_change_time not in", values, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_change_time between", value1, value2, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andHydraulicOilChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hydraulic_oil_change_time not between", value1, value2, "hydraulicOilChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleIsNull() {
            addCriterion("coolant_cycle is null");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleIsNotNull() {
            addCriterion("coolant_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleEqualTo(BigDecimal value) {
            addCriterion("coolant_cycle =", value, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleNotEqualTo(BigDecimal value) {
            addCriterion("coolant_cycle <>", value, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleGreaterThan(BigDecimal value) {
            addCriterion("coolant_cycle >", value, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_cycle >=", value, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleLessThan(BigDecimal value) {
            addCriterion("coolant_cycle <", value, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_cycle <=", value, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleIn(List<BigDecimal> values) {
            addCriterion("coolant_cycle in", values, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleNotIn(List<BigDecimal> values) {
            addCriterion("coolant_cycle not in", values, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_cycle between", value1, value2, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_cycle not between", value1, value2, "coolantCycle");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityIsNull() {
            addCriterion("coolant_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityIsNotNull() {
            addCriterion("coolant_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityEqualTo(BigDecimal value) {
            addCriterion("coolant_quantity =", value, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityNotEqualTo(BigDecimal value) {
            addCriterion("coolant_quantity <>", value, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityGreaterThan(BigDecimal value) {
            addCriterion("coolant_quantity >", value, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_quantity >=", value, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityLessThan(BigDecimal value) {
            addCriterion("coolant_quantity <", value, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_quantity <=", value, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityIn(List<BigDecimal> values) {
            addCriterion("coolant_quantity in", values, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityNotIn(List<BigDecimal> values) {
            addCriterion("coolant_quantity not in", values, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_quantity between", value1, value2, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_quantity not between", value1, value2, "coolantQuantity");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceIsNull() {
            addCriterion("coolant_price is null");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceIsNotNull() {
            addCriterion("coolant_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceEqualTo(BigDecimal value) {
            addCriterion("coolant_price =", value, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceNotEqualTo(BigDecimal value) {
            addCriterion("coolant_price <>", value, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceGreaterThan(BigDecimal value) {
            addCriterion("coolant_price >", value, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_price >=", value, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceLessThan(BigDecimal value) {
            addCriterion("coolant_price <", value, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_price <=", value, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceIn(List<BigDecimal> values) {
            addCriterion("coolant_price in", values, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceNotIn(List<BigDecimal> values) {
            addCriterion("coolant_price not in", values, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_price between", value1, value2, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_price not between", value1, value2, "coolantPrice");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeIsNull() {
            addCriterion("coolant_change_time is null");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeIsNotNull() {
            addCriterion("coolant_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeEqualTo(BigDecimal value) {
            addCriterion("coolant_change_time =", value, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("coolant_change_time <>", value, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("coolant_change_time >", value, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_change_time >=", value, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeLessThan(BigDecimal value) {
            addCriterion("coolant_change_time <", value, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coolant_change_time <=", value, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeIn(List<BigDecimal> values) {
            addCriterion("coolant_change_time in", values, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("coolant_change_time not in", values, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_change_time between", value1, value2, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andCoolantChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coolant_change_time not between", value1, value2, "coolantChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleIsNull() {
            addCriterion("grease_cycle is null");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleIsNotNull() {
            addCriterion("grease_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleEqualTo(BigDecimal value) {
            addCriterion("grease_cycle =", value, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleNotEqualTo(BigDecimal value) {
            addCriterion("grease_cycle <>", value, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleGreaterThan(BigDecimal value) {
            addCriterion("grease_cycle >", value, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_cycle >=", value, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleLessThan(BigDecimal value) {
            addCriterion("grease_cycle <", value, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_cycle <=", value, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleIn(List<BigDecimal> values) {
            addCriterion("grease_cycle in", values, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleNotIn(List<BigDecimal> values) {
            addCriterion("grease_cycle not in", values, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_cycle between", value1, value2, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_cycle not between", value1, value2, "greaseCycle");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityIsNull() {
            addCriterion("grease_quantity is null");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityIsNotNull() {
            addCriterion("grease_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityEqualTo(BigDecimal value) {
            addCriterion("grease_quantity =", value, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityNotEqualTo(BigDecimal value) {
            addCriterion("grease_quantity <>", value, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityGreaterThan(BigDecimal value) {
            addCriterion("grease_quantity >", value, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_quantity >=", value, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityLessThan(BigDecimal value) {
            addCriterion("grease_quantity <", value, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_quantity <=", value, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityIn(List<BigDecimal> values) {
            addCriterion("grease_quantity in", values, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityNotIn(List<BigDecimal> values) {
            addCriterion("grease_quantity not in", values, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_quantity between", value1, value2, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreaseQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_quantity not between", value1, value2, "greaseQuantity");
            return (Criteria) this;
        }

        public Criteria andGreasePriceIsNull() {
            addCriterion("grease_price is null");
            return (Criteria) this;
        }

        public Criteria andGreasePriceIsNotNull() {
            addCriterion("grease_price is not null");
            return (Criteria) this;
        }

        public Criteria andGreasePriceEqualTo(BigDecimal value) {
            addCriterion("grease_price =", value, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceNotEqualTo(BigDecimal value) {
            addCriterion("grease_price <>", value, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceGreaterThan(BigDecimal value) {
            addCriterion("grease_price >", value, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_price >=", value, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceLessThan(BigDecimal value) {
            addCriterion("grease_price <", value, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_price <=", value, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceIn(List<BigDecimal> values) {
            addCriterion("grease_price in", values, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceNotIn(List<BigDecimal> values) {
            addCriterion("grease_price not in", values, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_price between", value1, value2, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_price not between", value1, value2, "greasePrice");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeIsNull() {
            addCriterion("grease_change_time is null");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeIsNotNull() {
            addCriterion("grease_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeEqualTo(BigDecimal value) {
            addCriterion("grease_change_time =", value, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("grease_change_time <>", value, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("grease_change_time >", value, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_change_time >=", value, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeLessThan(BigDecimal value) {
            addCriterion("grease_change_time <", value, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grease_change_time <=", value, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeIn(List<BigDecimal> values) {
            addCriterion("grease_change_time in", values, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("grease_change_time not in", values, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_change_time between", value1, value2, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andGreaseChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grease_change_time not between", value1, value2, "greaseChangeTime");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilIsNull() {
            addCriterion("labor_cost_oil is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilIsNotNull() {
            addCriterion("labor_cost_oil is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilEqualTo(BigDecimal value) {
            addCriterion("labor_cost_oil =", value, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilNotEqualTo(BigDecimal value) {
            addCriterion("labor_cost_oil <>", value, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilGreaterThan(BigDecimal value) {
            addCriterion("labor_cost_oil >", value, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_oil >=", value, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilLessThan(BigDecimal value) {
            addCriterion("labor_cost_oil <", value, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_oil <=", value, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilIn(List<BigDecimal> values) {
            addCriterion("labor_cost_oil in", values, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilNotIn(List<BigDecimal> values) {
            addCriterion("labor_cost_oil not in", values, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_oil between", value1, value2, "laborCostOil");
            return (Criteria) this;
        }

        public Criteria andLaborCostOilNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_oil not between", value1, value2, "laborCostOil");
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