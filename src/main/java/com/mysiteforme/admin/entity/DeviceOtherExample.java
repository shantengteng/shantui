package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceOtherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceOtherExample() {
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

        public Criteria andBatteryCycleIsNull() {
            addCriterion("battery_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleIsNotNull() {
            addCriterion("battery_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleEqualTo(BigDecimal value) {
            addCriterion("battery_cycle =", value, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleNotEqualTo(BigDecimal value) {
            addCriterion("battery_cycle <>", value, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleGreaterThan(BigDecimal value) {
            addCriterion("battery_cycle >", value, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("battery_cycle >=", value, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleLessThan(BigDecimal value) {
            addCriterion("battery_cycle <", value, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("battery_cycle <=", value, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleIn(List<BigDecimal> values) {
            addCriterion("battery_cycle in", values, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleNotIn(List<BigDecimal> values) {
            addCriterion("battery_cycle not in", values, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("battery_cycle between", value1, value2, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("battery_cycle not between", value1, value2, "batteryCycle");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceIsNull() {
            addCriterion("battery_price is null");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceIsNotNull() {
            addCriterion("battery_price is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceEqualTo(BigDecimal value) {
            addCriterion("battery_price =", value, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceNotEqualTo(BigDecimal value) {
            addCriterion("battery_price <>", value, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceGreaterThan(BigDecimal value) {
            addCriterion("battery_price >", value, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("battery_price >=", value, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceLessThan(BigDecimal value) {
            addCriterion("battery_price <", value, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("battery_price <=", value, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceIn(List<BigDecimal> values) {
            addCriterion("battery_price in", values, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceNotIn(List<BigDecimal> values) {
            addCriterion("battery_price not in", values, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("battery_price between", value1, value2, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("battery_price not between", value1, value2, "batteryPrice");
            return (Criteria) this;
        }

        public Criteria andBatteryNumIsNull() {
            addCriterion("battery_num is null");
            return (Criteria) this;
        }

        public Criteria andBatteryNumIsNotNull() {
            addCriterion("battery_num is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryNumEqualTo(Integer value) {
            addCriterion("battery_num =", value, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumNotEqualTo(Integer value) {
            addCriterion("battery_num <>", value, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumGreaterThan(Integer value) {
            addCriterion("battery_num >", value, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("battery_num >=", value, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumLessThan(Integer value) {
            addCriterion("battery_num <", value, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumLessThanOrEqualTo(Integer value) {
            addCriterion("battery_num <=", value, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumIn(List<Integer> values) {
            addCriterion("battery_num in", values, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumNotIn(List<Integer> values) {
            addCriterion("battery_num not in", values, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumBetween(Integer value1, Integer value2) {
            addCriterion("battery_num between", value1, value2, "batteryNum");
            return (Criteria) this;
        }

        public Criteria andBatteryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("battery_num not between", value1, value2, "batteryNum");
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