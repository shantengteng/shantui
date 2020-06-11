package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceBladeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceBladeExample() {
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

        public Criteria andBladeCycleIsNull() {
            addCriterion("blade_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBladeCycleIsNotNull() {
            addCriterion("blade_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBladeCycleEqualTo(BigDecimal value) {
            addCriterion("blade_cycle =", value, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleNotEqualTo(BigDecimal value) {
            addCriterion("blade_cycle <>", value, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleGreaterThan(BigDecimal value) {
            addCriterion("blade_cycle >", value, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("blade_cycle >=", value, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleLessThan(BigDecimal value) {
            addCriterion("blade_cycle <", value, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("blade_cycle <=", value, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleIn(List<BigDecimal> values) {
            addCriterion("blade_cycle in", values, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleNotIn(List<BigDecimal> values) {
            addCriterion("blade_cycle not in", values, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blade_cycle between", value1, value2, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blade_cycle not between", value1, value2, "bladeCycle");
            return (Criteria) this;
        }

        public Criteria andBladeNumIsNull() {
            addCriterion("blade_num is null");
            return (Criteria) this;
        }

        public Criteria andBladeNumIsNotNull() {
            addCriterion("blade_num is not null");
            return (Criteria) this;
        }

        public Criteria andBladeNumEqualTo(Integer value) {
            addCriterion("blade_num =", value, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumNotEqualTo(Integer value) {
            addCriterion("blade_num <>", value, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumGreaterThan(Integer value) {
            addCriterion("blade_num >", value, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("blade_num >=", value, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumLessThan(Integer value) {
            addCriterion("blade_num <", value, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumLessThanOrEqualTo(Integer value) {
            addCriterion("blade_num <=", value, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumIn(List<Integer> values) {
            addCriterion("blade_num in", values, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumNotIn(List<Integer> values) {
            addCriterion("blade_num not in", values, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumBetween(Integer value1, Integer value2) {
            addCriterion("blade_num between", value1, value2, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("blade_num not between", value1, value2, "bladeNum");
            return (Criteria) this;
        }

        public Criteria andBladePriceIsNull() {
            addCriterion("blade_price is null");
            return (Criteria) this;
        }

        public Criteria andBladePriceIsNotNull() {
            addCriterion("blade_price is not null");
            return (Criteria) this;
        }

        public Criteria andBladePriceEqualTo(BigDecimal value) {
            addCriterion("blade_price =", value, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceNotEqualTo(BigDecimal value) {
            addCriterion("blade_price <>", value, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceGreaterThan(BigDecimal value) {
            addCriterion("blade_price >", value, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("blade_price >=", value, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceLessThan(BigDecimal value) {
            addCriterion("blade_price <", value, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("blade_price <=", value, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceIn(List<BigDecimal> values) {
            addCriterion("blade_price in", values, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceNotIn(List<BigDecimal> values) {
            addCriterion("blade_price not in", values, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blade_price between", value1, value2, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blade_price not between", value1, value2, "bladePrice");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeIsNull() {
            addCriterion("blade_change_time is null");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeIsNotNull() {
            addCriterion("blade_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeEqualTo(BigDecimal value) {
            addCriterion("blade_change_time =", value, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("blade_change_time <>", value, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("blade_change_time >", value, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("blade_change_time >=", value, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeLessThan(BigDecimal value) {
            addCriterion("blade_change_time <", value, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("blade_change_time <=", value, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeIn(List<BigDecimal> values) {
            addCriterion("blade_change_time in", values, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("blade_change_time not in", values, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blade_change_time between", value1, value2, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andBladeChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blade_change_time not between", value1, value2, "bladeChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleIsNull() {
            addCriterion("knife_angle_cycle is null");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleIsNotNull() {
            addCriterion("knife_angle_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleEqualTo(BigDecimal value) {
            addCriterion("knife_angle_cycle =", value, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleNotEqualTo(BigDecimal value) {
            addCriterion("knife_angle_cycle <>", value, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleGreaterThan(BigDecimal value) {
            addCriterion("knife_angle_cycle >", value, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("knife_angle_cycle >=", value, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleLessThan(BigDecimal value) {
            addCriterion("knife_angle_cycle <", value, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("knife_angle_cycle <=", value, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleIn(List<BigDecimal> values) {
            addCriterion("knife_angle_cycle in", values, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleNotIn(List<BigDecimal> values) {
            addCriterion("knife_angle_cycle not in", values, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("knife_angle_cycle between", value1, value2, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("knife_angle_cycle not between", value1, value2, "knifeAngleCycle");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumIsNull() {
            addCriterion("knife_angle_num is null");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumIsNotNull() {
            addCriterion("knife_angle_num is not null");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumEqualTo(Integer value) {
            addCriterion("knife_angle_num =", value, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumNotEqualTo(Integer value) {
            addCriterion("knife_angle_num <>", value, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumGreaterThan(Integer value) {
            addCriterion("knife_angle_num >", value, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("knife_angle_num >=", value, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumLessThan(Integer value) {
            addCriterion("knife_angle_num <", value, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumLessThanOrEqualTo(Integer value) {
            addCriterion("knife_angle_num <=", value, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumIn(List<Integer> values) {
            addCriterion("knife_angle_num in", values, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumNotIn(List<Integer> values) {
            addCriterion("knife_angle_num not in", values, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumBetween(Integer value1, Integer value2) {
            addCriterion("knife_angle_num between", value1, value2, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("knife_angle_num not between", value1, value2, "knifeAngleNum");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceIsNull() {
            addCriterion("knife_angle_price is null");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceIsNotNull() {
            addCriterion("knife_angle_price is not null");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceEqualTo(BigDecimal value) {
            addCriterion("knife_angle_price =", value, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceNotEqualTo(BigDecimal value) {
            addCriterion("knife_angle_price <>", value, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceGreaterThan(BigDecimal value) {
            addCriterion("knife_angle_price >", value, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("knife_angle_price >=", value, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceLessThan(BigDecimal value) {
            addCriterion("knife_angle_price <", value, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("knife_angle_price <=", value, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceIn(List<BigDecimal> values) {
            addCriterion("knife_angle_price in", values, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceNotIn(List<BigDecimal> values) {
            addCriterion("knife_angle_price not in", values, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("knife_angle_price between", value1, value2, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAnglePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("knife_angle_price not between", value1, value2, "knifeAnglePrice");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeIsNull() {
            addCriterion("knife_angle_change_time is null");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeIsNotNull() {
            addCriterion("knife_angle_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeEqualTo(BigDecimal value) {
            addCriterion("knife_angle_change_time =", value, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeNotEqualTo(BigDecimal value) {
            addCriterion("knife_angle_change_time <>", value, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeGreaterThan(BigDecimal value) {
            addCriterion("knife_angle_change_time >", value, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("knife_angle_change_time >=", value, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeLessThan(BigDecimal value) {
            addCriterion("knife_angle_change_time <", value, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("knife_angle_change_time <=", value, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeIn(List<BigDecimal> values) {
            addCriterion("knife_angle_change_time in", values, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeNotIn(List<BigDecimal> values) {
            addCriterion("knife_angle_change_time not in", values, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("knife_angle_change_time between", value1, value2, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andKnifeAngleChangeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("knife_angle_change_time not between", value1, value2, "knifeAngleChangeTime");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeIsNull() {
            addCriterion("labor_cost_blade is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeIsNotNull() {
            addCriterion("labor_cost_blade is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeEqualTo(BigDecimal value) {
            addCriterion("labor_cost_blade =", value, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeNotEqualTo(BigDecimal value) {
            addCriterion("labor_cost_blade <>", value, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeGreaterThan(BigDecimal value) {
            addCriterion("labor_cost_blade >", value, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_blade >=", value, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeLessThan(BigDecimal value) {
            addCriterion("labor_cost_blade <", value, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost_blade <=", value, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeIn(List<BigDecimal> values) {
            addCriterion("labor_cost_blade in", values, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeNotIn(List<BigDecimal> values) {
            addCriterion("labor_cost_blade not in", values, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_blade between", value1, value2, "laborCostBlade");
            return (Criteria) this;
        }

        public Criteria andLaborCostBladeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost_blade not between", value1, value2, "laborCostBlade");
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