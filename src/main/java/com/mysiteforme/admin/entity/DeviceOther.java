package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeviceOther {
    private Long id;

    private Long deviceId;

    private BigDecimal batteryCycle;

    private BigDecimal batteryPrice;

    private Integer batteryNum;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public BigDecimal getBatteryCycle() {
        return batteryCycle;
    }

    public void setBatteryCycle(BigDecimal batteryCycle) {
        this.batteryCycle = batteryCycle;
    }

    public BigDecimal getBatteryPrice() {
        return batteryPrice;
    }

    public void setBatteryPrice(BigDecimal batteryPrice) {
        this.batteryPrice = batteryPrice;
    }

    public Integer getBatteryNum() {
        return batteryNum;
    }

    public void setBatteryNum(Integer batteryNum) {
        this.batteryNum = batteryNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}