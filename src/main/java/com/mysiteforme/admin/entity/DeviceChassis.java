package com.mysiteforme.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("device_chassis")
public class DeviceChassis {
    private Long id;

    private Long deviceId;

    private BigDecimal sprocketCycle;

    private Integer sprocketNum;

    private BigDecimal sprocketPrice;

    private BigDecimal sprocketChangeTime;

    private BigDecimal idlerCycle;

    private Integer idlerNum;

    private BigDecimal idlerPrice;

    private BigDecimal idlerChangeTime;

    private BigDecimal wheelCycle;

    private Integer wheelNum;

    private BigDecimal wheelPrice;

    private BigDecimal wheelChangeTime;

    private BigDecimal trackRollersCycle;

    private Integer trackRollersNum;

    private BigDecimal trackRollersPrice;

    private BigDecimal trackRollersChangeTime;

    private BigDecimal chainCycle;

    private Integer chainNum;

    private BigDecimal chainPrice;

    private BigDecimal chainChangeTime;

    private BigDecimal axisCycle;

    private Integer axisNum;

    private BigDecimal axisPrice;

    private BigDecimal axisChangeTime;

    private BigDecimal laborCostChassis;

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

    public BigDecimal getSprocketCycle() {
        return sprocketCycle;
    }

    public void setSprocketCycle(BigDecimal sprocketCycle) {
        this.sprocketCycle = sprocketCycle;
    }

    public Integer getSprocketNum() {
        return sprocketNum;
    }

    public void setSprocketNum(Integer sprocketNum) {
        this.sprocketNum = sprocketNum;
    }

    public BigDecimal getSprocketPrice() {
        return sprocketPrice;
    }

    public void setSprocketPrice(BigDecimal sprocketPrice) {
        this.sprocketPrice = sprocketPrice;
    }

    public BigDecimal getSprocketChangeTime() {
        return sprocketChangeTime;
    }

    public void setSprocketChangeTime(BigDecimal sprocketChangeTime) {
        this.sprocketChangeTime = sprocketChangeTime;
    }

    public BigDecimal getIdlerCycle() {
        return idlerCycle;
    }

    public void setIdlerCycle(BigDecimal idlerCycle) {
        this.idlerCycle = idlerCycle;
    }

    public Integer getIdlerNum() {
        return idlerNum;
    }

    public void setIdlerNum(Integer idlerNum) {
        this.idlerNum = idlerNum;
    }

    public BigDecimal getIdlerPrice() {
        return idlerPrice;
    }

    public void setIdlerPrice(BigDecimal idlerPrice) {
        this.idlerPrice = idlerPrice;
    }

    public BigDecimal getIdlerChangeTime() {
        return idlerChangeTime;
    }

    public void setIdlerChangeTime(BigDecimal idlerChangeTime) {
        this.idlerChangeTime = idlerChangeTime;
    }

    public BigDecimal getWheelCycle() {
        return wheelCycle;
    }

    public void setWheelCycle(BigDecimal wheelCycle) {
        this.wheelCycle = wheelCycle;
    }

    public Integer getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(Integer wheelNum) {
        this.wheelNum = wheelNum;
    }

    public BigDecimal getWheelPrice() {
        return wheelPrice;
    }

    public void setWheelPrice(BigDecimal wheelPrice) {
        this.wheelPrice = wheelPrice;
    }

    public BigDecimal getWheelChangeTime() {
        return wheelChangeTime;
    }

    public void setWheelChangeTime(BigDecimal wheelChangeTime) {
        this.wheelChangeTime = wheelChangeTime;
    }

    public BigDecimal getTrackRollersCycle() {
        return trackRollersCycle;
    }

    public void setTrackRollersCycle(BigDecimal trackRollersCycle) {
        this.trackRollersCycle = trackRollersCycle;
    }

    public Integer getTrackRollersNum() {
        return trackRollersNum;
    }

    public void setTrackRollersNum(Integer trackRollersNum) {
        this.trackRollersNum = trackRollersNum;
    }

    public BigDecimal getTrackRollersPrice() {
        return trackRollersPrice;
    }

    public void setTrackRollersPrice(BigDecimal trackRollersPrice) {
        this.trackRollersPrice = trackRollersPrice;
    }

    public BigDecimal getTrackRollersChangeTime() {
        return trackRollersChangeTime;
    }

    public void setTrackRollersChangeTime(BigDecimal trackRollersChangeTime) {
        this.trackRollersChangeTime = trackRollersChangeTime;
    }

    public BigDecimal getChainCycle() {
        return chainCycle;
    }

    public void setChainCycle(BigDecimal chainCycle) {
        this.chainCycle = chainCycle;
    }

    public Integer getChainNum() {
        return chainNum;
    }

    public void setChainNum(Integer chainNum) {
        this.chainNum = chainNum;
    }

    public BigDecimal getChainPrice() {
        return chainPrice;
    }

    public void setChainPrice(BigDecimal chainPrice) {
        this.chainPrice = chainPrice;
    }

    public BigDecimal getChainChangeTime() {
        return chainChangeTime;
    }

    public void setChainChangeTime(BigDecimal chainChangeTime) {
        this.chainChangeTime = chainChangeTime;
    }

    public BigDecimal getAxisCycle() {
        return axisCycle;
    }

    public void setAxisCycle(BigDecimal axisCycle) {
        this.axisCycle = axisCycle;
    }

    public Integer getAxisNum() {
        return axisNum;
    }

    public void setAxisNum(Integer axisNum) {
        this.axisNum = axisNum;
    }

    public BigDecimal getAxisPrice() {
        return axisPrice;
    }

    public void setAxisPrice(BigDecimal axisPrice) {
        this.axisPrice = axisPrice;
    }

    public BigDecimal getAxisChangeTime() {
        return axisChangeTime;
    }

    public void setAxisChangeTime(BigDecimal axisChangeTime) {
        this.axisChangeTime = axisChangeTime;
    }

    public BigDecimal getLaborCostChassis() {
        return laborCostChassis;
    }

    public void setLaborCostChassis(BigDecimal laborCostChassis) {
        this.laborCostChassis = laborCostChassis;
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