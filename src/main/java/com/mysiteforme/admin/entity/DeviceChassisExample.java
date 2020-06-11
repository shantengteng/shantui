package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceChassisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceChassisExample() {
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

        public Criteria andSprocketCycleIsNull() {
            addCriterion("sprocket_cycle is null");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleIsNotNull() {
            addCriterion("sprocket_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleEqualTo(BigDecimal value) {
            addCriterion("sprocket_cycle =", value, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleNotEqualTo(BigDecimal value) {
            addCriterion("sprocket_cycle <>", value, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleGreaterThan(BigDecimal value) {
            addCriterion("sprocket_cycle >", value, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sprocket_cycle >=", value, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleLessThan(BigDecimal value) {
            addCriterion("sprocket_cycle <", value, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sprocket_cycle <=", value, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleIn(List<BigDecimal> values) {
            addCriterion("sprocket_cycle in", values, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleNotIn(List<BigDecimal> values) {
            addCriterion("sprocket_cycle not in", values, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprocket_cycle between", value1, value2, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprocket_cycle not between", value1, value2, "sprocketCycle");
            return (Criteria) this;
        }

        public Criteria andSprocketNumIsNull() {
            addCriterion("sprocket_num is null");
            return (Criteria) this;
        }

        public Criteria andSprocketNumIsNotNull() {
            addCriterion("sprocket_num is not null");
            return (Criteria) this;
        }

        public Criteria andSprocketNumEqualTo(Integer value) {
            addCriterion("sprocket_num =", value, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumNotEqualTo(Integer value) {
            addCriterion("sprocket_num <>", value, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumGreaterThan(Integer value) {
            addCriterion("sprocket_num >", value, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sprocket_num >=", value, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumLessThan(Integer value) {
            addCriterion("sprocket_num <", value, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumLessThanOrEqualTo(Integer value) {
            addCriterion("sprocket_num <=", value, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumIn(List<Integer> values) {
            addCriterion("sprocket_num in", values, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumNotIn(List<Integer> values) {
            addCriterion("sprocket_num not in", values, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumBetween(Integer value1, Integer value2) {
            addCriterion("sprocket_num between", value1, value2, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sprocket_num not between", value1, value2, "sprocketNum");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceIsNull() {
            addCriterion("sprocket_price is null");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceIsNotNull() {
            addCriterion("sprocket_price is not null");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceEqualTo(BigDecimal value) {
            addCriterion("sprocket_price =", value, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceNotEqualTo(BigDecimal value) {
            addCriterion("sprocket_price <>", value, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceGreaterThan(BigDecimal value) {
            addCriterion("sprocket_price >", value, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sprocket_price >=", value, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceLessThan(BigDecimal value) {
            addCriterion("sprocket_price <", value, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sprocket_price <=", value, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceIn(List<BigDecimal> values) {
            addCriterion("sprocket_price in", values, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceNotIn(List<BigDecimal> values) {
            addCriterion("sprocket_price not in", values, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprocket_price between", value1, value2, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprocket_price not between", value1, value2, "sprocketPrice");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeIsNull() {
            addCriterion("sprocket_change_time is null");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeIsNotNull() {
            addCriterion("sprocket_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeEqualTo(BigDecimal value) {
            addCriterion("sprocket_change_time =", value, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("sprocket_change_time <>", value, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("sprocket_change_time >", value, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sprocket_change_time >=", value, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeLessThan(BigDecimal value) {
            addCriterion("sprocket_change_time <", value, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sprocket_change_time <=", value, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeIn(List<BigDecimal> values) {
            addCriterion("sprocket_change_time in", values, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("sprocket_change_time not in", values, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprocket_change_time between", value1, value2, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andSprocketChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sprocket_change_time not between", value1, value2, "sprocketChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleIsNull() {
            addCriterion("idler_cycle is null");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleIsNotNull() {
            addCriterion("idler_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleEqualTo(BigDecimal value) {
            addCriterion("idler_cycle =", value, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleNotEqualTo(BigDecimal value) {
            addCriterion("idler_cycle <>", value, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleGreaterThan(BigDecimal value) {
            addCriterion("idler_cycle >", value, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("idler_cycle >=", value, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleLessThan(BigDecimal value) {
            addCriterion("idler_cycle <", value, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("idler_cycle <=", value, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleIn(List<BigDecimal> values) {
            addCriterion("idler_cycle in", values, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleNotIn(List<BigDecimal> values) {
            addCriterion("idler_cycle not in", values, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idler_cycle between", value1, value2, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idler_cycle not between", value1, value2, "idlerCycle");
            return (Criteria) this;
        }

        public Criteria andIdlerNumIsNull() {
            addCriterion("idler_num is null");
            return (Criteria) this;
        }

        public Criteria andIdlerNumIsNotNull() {
            addCriterion("idler_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdlerNumEqualTo(Integer value) {
            addCriterion("idler_num =", value, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumNotEqualTo(Integer value) {
            addCriterion("idler_num <>", value, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumGreaterThan(Integer value) {
            addCriterion("idler_num >", value, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("idler_num >=", value, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumLessThan(Integer value) {
            addCriterion("idler_num <", value, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumLessThanOrEqualTo(Integer value) {
            addCriterion("idler_num <=", value, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumIn(List<Integer> values) {
            addCriterion("idler_num in", values, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumNotIn(List<Integer> values) {
            addCriterion("idler_num not in", values, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumBetween(Integer value1, Integer value2) {
            addCriterion("idler_num between", value1, value2, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("idler_num not between", value1, value2, "idlerNum");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceIsNull() {
            addCriterion("idler_price is null");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceIsNotNull() {
            addCriterion("idler_price is not null");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceEqualTo(BigDecimal value) {
            addCriterion("idler_price =", value, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceNotEqualTo(BigDecimal value) {
            addCriterion("idler_price <>", value, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceGreaterThan(BigDecimal value) {
            addCriterion("idler_price >", value, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("idler_price >=", value, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceLessThan(BigDecimal value) {
            addCriterion("idler_price <", value, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("idler_price <=", value, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceIn(List<BigDecimal> values) {
            addCriterion("idler_price in", values, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceNotIn(List<BigDecimal> values) {
            addCriterion("idler_price not in", values, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idler_price between", value1, value2, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idler_price not between", value1, value2, "idlerPrice");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeIsNull() {
            addCriterion("idler_change_time is null");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeIsNotNull() {
            addCriterion("idler_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeEqualTo(BigDecimal value) {
            addCriterion("idler_change_time =", value, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("idler_change_time <>", value, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("idler_change_time >", value, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("idler_change_time >=", value, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeLessThan(BigDecimal value) {
            addCriterion("idler_change_time <", value, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("idler_change_time <=", value, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeIn(List<BigDecimal> values) {
            addCriterion("idler_change_time in", values, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("idler_change_time not in", values, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idler_change_time between", value1, value2, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andIdlerChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("idler_change_time not between", value1, value2, "idlerChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelCycleIsNull() {
            addCriterion("wheel_cycle is null");
            return (Criteria) this;
        }

        public Criteria andWheelCycleIsNotNull() {
            addCriterion("wheel_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andWheelCycleEqualTo(BigDecimal value) {
            addCriterion("wheel_cycle =", value, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleNotEqualTo(BigDecimal value) {
            addCriterion("wheel_cycle <>", value, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleGreaterThan(BigDecimal value) {
            addCriterion("wheel_cycle >", value, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_cycle >=", value, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleLessThan(BigDecimal value) {
            addCriterion("wheel_cycle <", value, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_cycle <=", value, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleIn(List<BigDecimal> values) {
            addCriterion("wheel_cycle in", values, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleNotIn(List<BigDecimal> values) {
            addCriterion("wheel_cycle not in", values, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_cycle between", value1, value2, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_cycle not between", value1, value2, "wheelCycle");
            return (Criteria) this;
        }

        public Criteria andWheelNumIsNull() {
            addCriterion("wheel_num is null");
            return (Criteria) this;
        }

        public Criteria andWheelNumIsNotNull() {
            addCriterion("wheel_num is not null");
            return (Criteria) this;
        }

        public Criteria andWheelNumEqualTo(Integer value) {
            addCriterion("wheel_num =", value, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumNotEqualTo(Integer value) {
            addCriterion("wheel_num <>", value, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumGreaterThan(Integer value) {
            addCriterion("wheel_num >", value, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wheel_num >=", value, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumLessThan(Integer value) {
            addCriterion("wheel_num <", value, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumLessThanOrEqualTo(Integer value) {
            addCriterion("wheel_num <=", value, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumIn(List<Integer> values) {
            addCriterion("wheel_num in", values, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumNotIn(List<Integer> values) {
            addCriterion("wheel_num not in", values, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumBetween(Integer value1, Integer value2) {
            addCriterion("wheel_num between", value1, value2, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wheel_num not between", value1, value2, "wheelNum");
            return (Criteria) this;
        }

        public Criteria andWheelPriceIsNull() {
            addCriterion("wheel_price is null");
            return (Criteria) this;
        }

        public Criteria andWheelPriceIsNotNull() {
            addCriterion("wheel_price is not null");
            return (Criteria) this;
        }

        public Criteria andWheelPriceEqualTo(BigDecimal value) {
            addCriterion("wheel_price =", value, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceNotEqualTo(BigDecimal value) {
            addCriterion("wheel_price <>", value, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceGreaterThan(BigDecimal value) {
            addCriterion("wheel_price >", value, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_price >=", value, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceLessThan(BigDecimal value) {
            addCriterion("wheel_price <", value, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_price <=", value, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceIn(List<BigDecimal> values) {
            addCriterion("wheel_price in", values, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceNotIn(List<BigDecimal> values) {
            addCriterion("wheel_price not in", values, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_price between", value1, value2, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_price not between", value1, value2, "wheelPrice");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeIsNull() {
            addCriterion("wheel_change_time is null");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeIsNotNull() {
            addCriterion("wheel_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeEqualTo(BigDecimal value) {
            addCriterion("wheel_change_time =", value, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("wheel_change_time <>", value, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("wheel_change_time >", value, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_change_time >=", value, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeLessThan(BigDecimal value) {
            addCriterion("wheel_change_time <", value, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_change_time <=", value, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeIn(List<BigDecimal> values) {
            addCriterion("wheel_change_time in", values, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("wheel_change_time not in", values, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_change_time between", value1, value2, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andWheelChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_change_time not between", value1, value2, "wheelChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleIsNull() {
            addCriterion("track_rollers_cycle is null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleIsNotNull() {
            addCriterion("track_rollers_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleEqualTo(BigDecimal value) {
            addCriterion("track_rollers_cycle =", value, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleNotEqualTo(BigDecimal value) {
            addCriterion("track_rollers_cycle <>", value, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleGreaterThan(BigDecimal value) {
            addCriterion("track_rollers_cycle >", value, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("track_rollers_cycle >=", value, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleLessThan(BigDecimal value) {
            addCriterion("track_rollers_cycle <", value, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("track_rollers_cycle <=", value, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleIn(List<BigDecimal> values) {
            addCriterion("track_rollers_cycle in", values, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleNotIn(List<BigDecimal> values) {
            addCriterion("track_rollers_cycle not in", values, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("track_rollers_cycle between", value1, value2, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("track_rollers_cycle not between", value1, value2, "trackRollersCycle");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumIsNull() {
            addCriterion("track_rollers_num is null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumIsNotNull() {
            addCriterion("track_rollers_num is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumEqualTo(Integer value) {
            addCriterion("track_rollers_num =", value, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumNotEqualTo(Integer value) {
            addCriterion("track_rollers_num <>", value, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumGreaterThan(Integer value) {
            addCriterion("track_rollers_num >", value, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("track_rollers_num >=", value, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumLessThan(Integer value) {
            addCriterion("track_rollers_num <", value, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumLessThanOrEqualTo(Integer value) {
            addCriterion("track_rollers_num <=", value, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumIn(List<Integer> values) {
            addCriterion("track_rollers_num in", values, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumNotIn(List<Integer> values) {
            addCriterion("track_rollers_num not in", values, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumBetween(Integer value1, Integer value2) {
            addCriterion("track_rollers_num between", value1, value2, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersNumNotBetween(Integer value1, Integer value2) {
            addCriterion("track_rollers_num not between", value1, value2, "trackRollersNum");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceIsNull() {
            addCriterion("track_rollers_price is null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceIsNotNull() {
            addCriterion("track_rollers_price is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceEqualTo(BigDecimal value) {
            addCriterion("track_rollers_price =", value, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceNotEqualTo(BigDecimal value) {
            addCriterion("track_rollers_price <>", value, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceGreaterThan(BigDecimal value) {
            addCriterion("track_rollers_price >", value, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("track_rollers_price >=", value, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceLessThan(BigDecimal value) {
            addCriterion("track_rollers_price <", value, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("track_rollers_price <=", value, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceIn(List<BigDecimal> values) {
            addCriterion("track_rollers_price in", values, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceNotIn(List<BigDecimal> values) {
            addCriterion("track_rollers_price not in", values, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("track_rollers_price between", value1, value2, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("track_rollers_price not between", value1, value2, "trackRollersPrice");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeIsNull() {
            addCriterion("track_rollers_change_time is null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeIsNotNull() {
            addCriterion("track_rollers_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeEqualTo(BigDecimal value) {
            addCriterion("track_rollers_change_time =", value, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("track_rollers_change_time <>", value, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("track_rollers_change_time >", value, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("track_rollers_change_time >=", value, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeLessThan(BigDecimal value) {
            addCriterion("track_rollers_change_time <", value, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("track_rollers_change_time <=", value, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeIn(List<BigDecimal> values) {
            addCriterion("track_rollers_change_time in", values, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("track_rollers_change_time not in", values, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("track_rollers_change_time between", value1, value2, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andTrackRollersChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("track_rollers_change_time not between", value1, value2, "trackRollersChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainCycleIsNull() {
            addCriterion("chain_cycle is null");
            return (Criteria) this;
        }

        public Criteria andChainCycleIsNotNull() {
            addCriterion("chain_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andChainCycleEqualTo(BigDecimal value) {
            addCriterion("chain_cycle =", value, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleNotEqualTo(BigDecimal value) {
            addCriterion("chain_cycle <>", value, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleGreaterThan(BigDecimal value) {
            addCriterion("chain_cycle >", value, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chain_cycle >=", value, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleLessThan(BigDecimal value) {
            addCriterion("chain_cycle <", value, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chain_cycle <=", value, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleIn(List<BigDecimal> values) {
            addCriterion("chain_cycle in", values, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleNotIn(List<BigDecimal> values) {
            addCriterion("chain_cycle not in", values, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chain_cycle between", value1, value2, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chain_cycle not between", value1, value2, "chainCycle");
            return (Criteria) this;
        }

        public Criteria andChainNumIsNull() {
            addCriterion("chain_num is null");
            return (Criteria) this;
        }

        public Criteria andChainNumIsNotNull() {
            addCriterion("chain_num is not null");
            return (Criteria) this;
        }

        public Criteria andChainNumEqualTo(Integer value) {
            addCriterion("chain_num =", value, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumNotEqualTo(Integer value) {
            addCriterion("chain_num <>", value, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumGreaterThan(Integer value) {
            addCriterion("chain_num >", value, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_num >=", value, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumLessThan(Integer value) {
            addCriterion("chain_num <", value, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumLessThanOrEqualTo(Integer value) {
            addCriterion("chain_num <=", value, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumIn(List<Integer> values) {
            addCriterion("chain_num in", values, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumNotIn(List<Integer> values) {
            addCriterion("chain_num not in", values, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumBetween(Integer value1, Integer value2) {
            addCriterion("chain_num between", value1, value2, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainNumNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_num not between", value1, value2, "chainNum");
            return (Criteria) this;
        }

        public Criteria andChainPriceIsNull() {
            addCriterion("chain_price is null");
            return (Criteria) this;
        }

        public Criteria andChainPriceIsNotNull() {
            addCriterion("chain_price is not null");
            return (Criteria) this;
        }

        public Criteria andChainPriceEqualTo(BigDecimal value) {
            addCriterion("chain_price =", value, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceNotEqualTo(BigDecimal value) {
            addCriterion("chain_price <>", value, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceGreaterThan(BigDecimal value) {
            addCriterion("chain_price >", value, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chain_price >=", value, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceLessThan(BigDecimal value) {
            addCriterion("chain_price <", value, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chain_price <=", value, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceIn(List<BigDecimal> values) {
            addCriterion("chain_price in", values, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceNotIn(List<BigDecimal> values) {
            addCriterion("chain_price not in", values, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chain_price between", value1, value2, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chain_price not between", value1, value2, "chainPrice");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeIsNull() {
            addCriterion("chain_change_time is null");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeIsNotNull() {
            addCriterion("chain_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeEqualTo(BigDecimal value) {
            addCriterion("chain_change_time =", value, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("chain_change_time <>", value, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("chain_change_time >", value, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chain_change_time >=", value, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeLessThan(BigDecimal value) {
            addCriterion("chain_change_time <", value, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chain_change_time <=", value, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeIn(List<BigDecimal> values) {
            addCriterion("chain_change_time in", values, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("chain_change_time not in", values, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chain_change_time between", value1, value2, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andChainChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chain_change_time not between", value1, value2, "chainChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisCycleIsNull() {
            addCriterion("axis_cycle is null");
            return (Criteria) this;
        }

        public Criteria andAxisCycleIsNotNull() {
            addCriterion("axis_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andAxisCycleEqualTo(BigDecimal value) {
            addCriterion("axis_cycle =", value, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleNotEqualTo(BigDecimal value) {
            addCriterion("axis_cycle <>", value, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleGreaterThan(BigDecimal value) {
            addCriterion("axis_cycle >", value, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("axis_cycle >=", value, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleLessThan(BigDecimal value) {
            addCriterion("axis_cycle <", value, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("axis_cycle <=", value, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleIn(List<BigDecimal> values) {
            addCriterion("axis_cycle in", values, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleNotIn(List<BigDecimal> values) {
            addCriterion("axis_cycle not in", values, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("axis_cycle between", value1, value2, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("axis_cycle not between", value1, value2, "axisCycle");
            return (Criteria) this;
        }

        public Criteria andAxisNumIsNull() {
            addCriterion("axis_num is null");
            return (Criteria) this;
        }

        public Criteria andAxisNumIsNotNull() {
            addCriterion("axis_num is not null");
            return (Criteria) this;
        }

        public Criteria andAxisNumEqualTo(Integer value) {
            addCriterion("axis_num =", value, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumNotEqualTo(Integer value) {
            addCriterion("axis_num <>", value, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumGreaterThan(Integer value) {
            addCriterion("axis_num >", value, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("axis_num >=", value, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumLessThan(Integer value) {
            addCriterion("axis_num <", value, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumLessThanOrEqualTo(Integer value) {
            addCriterion("axis_num <=", value, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumIn(List<Integer> values) {
            addCriterion("axis_num in", values, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumNotIn(List<Integer> values) {
            addCriterion("axis_num not in", values, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumBetween(Integer value1, Integer value2) {
            addCriterion("axis_num between", value1, value2, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisNumNotBetween(Integer value1, Integer value2) {
            addCriterion("axis_num not between", value1, value2, "axisNum");
            return (Criteria) this;
        }

        public Criteria andAxisPriceIsNull() {
            addCriterion("axis_price is null");
            return (Criteria) this;
        }

        public Criteria andAxisPriceIsNotNull() {
            addCriterion("axis_price is not null");
            return (Criteria) this;
        }

        public Criteria andAxisPriceEqualTo(BigDecimal value) {
            addCriterion("axis_price =", value, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceNotEqualTo(BigDecimal value) {
            addCriterion("axis_price <>", value, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceGreaterThan(BigDecimal value) {
            addCriterion("axis_price >", value, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("axis_price >=", value, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceLessThan(BigDecimal value) {
            addCriterion("axis_price <", value, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("axis_price <=", value, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceIn(List<BigDecimal> values) {
            addCriterion("axis_price in", values, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceNotIn(List<BigDecimal> values) {
            addCriterion("axis_price not in", values, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("axis_price between", value1, value2, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("axis_price not between", value1, value2, "axisPrice");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeIsNull() {
            addCriterion("axis_change_time is null");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeIsNotNull() {
            addCriterion("axis_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeEqualTo(BigDecimal value) {
            addCriterion("axis_change_time =", value, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("axis_change_time <>", value, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("axis_change_time >", value, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("axis_change_time >=", value, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeLessThan(BigDecimal value) {
            addCriterion("axis_change_time <", value, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("axis_change_time <=", value, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeIn(List<BigDecimal> values) {
            addCriterion("axis_change_time in", values, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("axis_change_time not in", values, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("axis_change_time between", value1, value2, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andAxisChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("axis_change_time not between", value1, value2, "axisChangeTime");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisIsNull() {
            addCriterion("labor_cost_chassis is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisIsNotNull() {
            addCriterion("labor_cost_chassis is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisEqualTo(BigDecimal value) {
            addCriterion("labor_cost_chassis =", value, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisNotEqualTo(BigDecimal value) {
            addCriterion("labor_cost_chassis <>", value, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisGreaterThan(BigDecimal value) {
            addCriterion("labor_cost_chassis >", value, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_chassis >=", value, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisLessThan(BigDecimal value) {
            addCriterion("labor_cost_chassis <", value, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_chassis <=", value, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisIn(List<BigDecimal> values) {
            addCriterion("labor_cost_chassis in", values, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisNotIn(List<BigDecimal> values) {
            addCriterion("labor_cost_chassis not in", values, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_chassis between", value1, value2, "laborCostChassis");
            return (Criteria) this;
        }

        public Criteria andLaborCostChassisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_chassis not between", value1, value2, "laborCostChassis");
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