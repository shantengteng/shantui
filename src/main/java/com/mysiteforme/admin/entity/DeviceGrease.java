package com.mysiteforme.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("device_grease")
public class DeviceGrease {
    private Long id;

    private Long deviceId;

    private BigDecimal machineOilCycle;

    private BigDecimal machineOilQuantity;

    private BigDecimal machineOilPrice;

    private BigDecimal machineOilChangeTime;

    private BigDecimal transmissionOilCycle;

    private BigDecimal transmissionOilQuantity;

    private BigDecimal transmissionOilPrice;

    private BigDecimal transmissionOilChangeTime;

    private BigDecimal finaldriveOilCycle;

    private BigDecimal finaldriveOilQuantity;

    private BigDecimal finaldriveOilPrice;

    private BigDecimal finaldriveOilChangeTime;

    private BigDecimal hydraulicOilCycle;

    private BigDecimal hydraulicOilQuantity;

    private BigDecimal hydraulicOilPrice;

    private BigDecimal hydraulicOilChangeTime;

    private BigDecimal coolantCycle;

    private BigDecimal coolantQuantity;

    private BigDecimal coolantPrice;

    private BigDecimal coolantChangeTime;

    private BigDecimal greaseCycle;

    private BigDecimal greaseQuantity;

    private BigDecimal greasePrice;

    private BigDecimal greaseChangeTime;

    private BigDecimal laborCostOil;

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

    public BigDecimal getMachineOilCycle() {
        return machineOilCycle;
    }

    public void setMachineOilCycle(BigDecimal machineOilCycle) {
        this.machineOilCycle = machineOilCycle;
    }

    public BigDecimal getMachineOilQuantity() {
        return machineOilQuantity;
    }

    public void setMachineOilQuantity(BigDecimal machineOilQuantity) {
        this.machineOilQuantity = machineOilQuantity;
    }

    public BigDecimal getMachineOilPrice() {
        return machineOilPrice;
    }

    public void setMachineOilPrice(BigDecimal machineOilPrice) {
        this.machineOilPrice = machineOilPrice;
    }

    public BigDecimal getMachineOilChangeTime() {
        return machineOilChangeTime;
    }

    public void setMachineOilChangeTime(BigDecimal machineOilChangeTime) {
        this.machineOilChangeTime = machineOilChangeTime;
    }

    public BigDecimal getTransmissionOilCycle() {
        return transmissionOilCycle;
    }

    public void setTransmissionOilCycle(BigDecimal transmissionOilCycle) {
        this.transmissionOilCycle = transmissionOilCycle;
    }

    public BigDecimal getTransmissionOilQuantity() {
        return transmissionOilQuantity;
    }

    public void setTransmissionOilQuantity(BigDecimal transmissionOilQuantity) {
        this.transmissionOilQuantity = transmissionOilQuantity;
    }

    public BigDecimal getTransmissionOilPrice() {
        return transmissionOilPrice;
    }

    public void setTransmissionOilPrice(BigDecimal transmissionOilPrice) {
        this.transmissionOilPrice = transmissionOilPrice;
    }

    public BigDecimal getTransmissionOilChangeTime() {
        return transmissionOilChangeTime;
    }

    public void setTransmissionOilChangeTime(BigDecimal transmissionOilChangeTime) {
        this.transmissionOilChangeTime = transmissionOilChangeTime;
    }

    public BigDecimal getFinaldriveOilCycle() {
        return finaldriveOilCycle;
    }

    public void setFinaldriveOilCycle(BigDecimal finaldriveOilCycle) {
        this.finaldriveOilCycle = finaldriveOilCycle;
    }

    public BigDecimal getFinaldriveOilQuantity() {
        return finaldriveOilQuantity;
    }

    public void setFinaldriveOilQuantity(BigDecimal finaldriveOilQuantity) {
        this.finaldriveOilQuantity = finaldriveOilQuantity;
    }

    public BigDecimal getFinaldriveOilPrice() {
        return finaldriveOilPrice;
    }

    public void setFinaldriveOilPrice(BigDecimal finaldriveOilPrice) {
        this.finaldriveOilPrice = finaldriveOilPrice;
    }

    public BigDecimal getFinaldriveOilChangeTime() {
        return finaldriveOilChangeTime;
    }

    public void setFinaldriveOilChangeTime(BigDecimal finaldriveOilChangeTime) {
        this.finaldriveOilChangeTime = finaldriveOilChangeTime;
    }

    public BigDecimal getHydraulicOilCycle() {
        return hydraulicOilCycle;
    }

    public void setHydraulicOilCycle(BigDecimal hydraulicOilCycle) {
        this.hydraulicOilCycle = hydraulicOilCycle;
    }

    public BigDecimal getHydraulicOilQuantity() {
        return hydraulicOilQuantity;
    }

    public void setHydraulicOilQuantity(BigDecimal hydraulicOilQuantity) {
        this.hydraulicOilQuantity = hydraulicOilQuantity;
    }

    public BigDecimal getHydraulicOilPrice() {
        return hydraulicOilPrice;
    }

    public void setHydraulicOilPrice(BigDecimal hydraulicOilPrice) {
        this.hydraulicOilPrice = hydraulicOilPrice;
    }

    public BigDecimal getHydraulicOilChangeTime() {
        return hydraulicOilChangeTime;
    }

    public void setHydraulicOilChangeTime(BigDecimal hydraulicOilChangeTime) {
        this.hydraulicOilChangeTime = hydraulicOilChangeTime;
    }

    public BigDecimal getCoolantCycle() {
        return coolantCycle;
    }

    public void setCoolantCycle(BigDecimal coolantCycle) {
        this.coolantCycle = coolantCycle;
    }

    public BigDecimal getCoolantQuantity() {
        return coolantQuantity;
    }

    public void setCoolantQuantity(BigDecimal coolantQuantity) {
        this.coolantQuantity = coolantQuantity;
    }

    public BigDecimal getCoolantPrice() {
        return coolantPrice;
    }

    public void setCoolantPrice(BigDecimal coolantPrice) {
        this.coolantPrice = coolantPrice;
    }

    public BigDecimal getCoolantChangeTime() {
        return coolantChangeTime;
    }

    public void setCoolantChangeTime(BigDecimal coolantChangeTime) {
        this.coolantChangeTime = coolantChangeTime;
    }

    public BigDecimal getGreaseCycle() {
        return greaseCycle;
    }

    public void setGreaseCycle(BigDecimal greaseCycle) {
        this.greaseCycle = greaseCycle;
    }

    public BigDecimal getGreaseQuantity() {
        return greaseQuantity;
    }

    public void setGreaseQuantity(BigDecimal greaseQuantity) {
        this.greaseQuantity = greaseQuantity;
    }

    public BigDecimal getGreasePrice() {
        return greasePrice;
    }

    public void setGreasePrice(BigDecimal greasePrice) {
        this.greasePrice = greasePrice;
    }

    public BigDecimal getGreaseChangeTime() {
        return greaseChangeTime;
    }

    public void setGreaseChangeTime(BigDecimal greaseChangeTime) {
        this.greaseChangeTime = greaseChangeTime;
    }

    public BigDecimal getLaborCostOil() {
        return laborCostOil;
    }

    public void setLaborCostOil(BigDecimal laborCostOil) {
        this.laborCostOil = laborCostOil;
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