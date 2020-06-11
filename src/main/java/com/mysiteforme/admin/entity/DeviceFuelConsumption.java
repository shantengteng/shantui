package com.mysiteforme.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("device_fuel_consumption")
public class DeviceFuelConsumption {
    private Long id;

    private Long deviceId;

    private BigDecimal fuelPrice;

    private String fuelConsumptionIndex;

    private BigDecimal fuelConsumption;

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

    public BigDecimal getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(BigDecimal fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public String getFuelConsumptionIndex() {
        return fuelConsumptionIndex;
    }

    public void setFuelConsumptionIndex(String fuelConsumptionIndex) {
        this.fuelConsumptionIndex = fuelConsumptionIndex == null ? null : fuelConsumptionIndex.trim();
    }

    public BigDecimal getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(BigDecimal fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
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