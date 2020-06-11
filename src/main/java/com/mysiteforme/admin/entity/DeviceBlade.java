package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeviceBlade {
    private Long id;

    private Long deviceId;

    private BigDecimal bladeCycle;

    private Integer bladeNum;

    private BigDecimal bladePrice;

    private BigDecimal bladeChangeTime;

    private BigDecimal knifeAngleCycle;

    private Integer knifeAngleNum;

    private BigDecimal knifeAnglePrice;

    private BigDecimal knifeAngleChangeTime;

    private BigDecimal laborCostBlade;

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

    public BigDecimal getBladeCycle() {
        return bladeCycle;
    }

    public void setBladeCycle(BigDecimal bladeCycle) {
        this.bladeCycle = bladeCycle;
    }

    public Integer getBladeNum() {
        return bladeNum;
    }

    public void setBladeNum(Integer bladeNum) {
        this.bladeNum = bladeNum;
    }

    public BigDecimal getBladePrice() {
        return bladePrice;
    }

    public void setBladePrice(BigDecimal bladePrice) {
        this.bladePrice = bladePrice;
    }

    public BigDecimal getBladeChangeTime() {
        return bladeChangeTime;
    }

    public void setBladeChangeTime(BigDecimal bladeChangeTime) {
        this.bladeChangeTime = bladeChangeTime;
    }

    public BigDecimal getKnifeAngleCycle() {
        return knifeAngleCycle;
    }

    public void setKnifeAngleCycle(BigDecimal knifeAngleCycle) {
        this.knifeAngleCycle = knifeAngleCycle;
    }

    public Integer getKnifeAngleNum() {
        return knifeAngleNum;
    }

    public void setKnifeAngleNum(Integer knifeAngleNum) {
        this.knifeAngleNum = knifeAngleNum;
    }

    public BigDecimal getKnifeAnglePrice() {
        return knifeAnglePrice;
    }

    public void setKnifeAnglePrice(BigDecimal knifeAnglePrice) {
        this.knifeAnglePrice = knifeAnglePrice;
    }

    public BigDecimal getKnifeAngleChangeTime() {
        return knifeAngleChangeTime;
    }

    public void setKnifeAngleChangeTime(BigDecimal knifeAngleChangeTime) {
        this.knifeAngleChangeTime = knifeAngleChangeTime;
    }

    public BigDecimal getLaborCostBlade() {
        return laborCostBlade;
    }

    public void setLaborCostBlade(BigDecimal laborCostBlade) {
        this.laborCostBlade = laborCostBlade;
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