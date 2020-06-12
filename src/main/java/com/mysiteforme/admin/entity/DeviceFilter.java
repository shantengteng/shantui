package com.mysiteforme.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("device_filter")
public class DeviceFilter {
    private Long id;

    private Long deviceId;

    private BigDecimal machineOilFilteCycle;

    private Integer machineOilFilteNum;

    private BigDecimal machineOilFiltePrice;

    private BigDecimal machineOilFilteChangeTime;

    private BigDecimal transmissionOilFilteCycle;

    private Integer transmissionOilFilteNum;

    private BigDecimal transmissionOilFiltePrice;

    private BigDecimal transmissionOilFilteChangeTime;

    private BigDecimal hydraulicOilFilteCycle;

    private Integer hydraulicOilFilteNum;

    private BigDecimal hydraulicOilFiltePrice;

    private BigDecimal hydraulicOilFilteChangeTime;

    private BigDecimal fuelFilteCycle;

    private Integer fuelFilteNum;

    private BigDecimal fuelFiltePrice;

    private BigDecimal fuelFilteChangeTime;

    private BigDecimal airFilterCycle;

    private Integer airFilterNum;

    private BigDecimal airFilterPrice;

    private BigDecimal airFilterChangeTime;

    private BigDecimal coolantFilterCycle;

    private Integer coolantFilterNum;

    private BigDecimal coolantFilterPrice;

    private BigDecimal coolantFilterChangeTime;

    private BigDecimal laborCostFilter;

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

    public BigDecimal getMachineOilFilteCycle() {
        return machineOilFilteCycle;
    }

    public void setMachineOilFilteCycle(BigDecimal machineOilFilteCycle) {
        this.machineOilFilteCycle = machineOilFilteCycle;
    }

    public Integer getMachineOilFilteNum() {
        return machineOilFilteNum;
    }

    public void setMachineOilFilteNum(Integer machineOilFilteNum) {
        this.machineOilFilteNum = machineOilFilteNum;
    }

    public BigDecimal getMachineOilFiltePrice() {
        return machineOilFiltePrice;
    }

    public void setMachineOilFiltePrice(BigDecimal machineOilFiltePrice) {
        this.machineOilFiltePrice = machineOilFiltePrice;
    }

    public BigDecimal getMachineOilFilteChangeTime() {
        return machineOilFilteChangeTime;
    }

    public void setMachineOilFilteChangeTime(BigDecimal machineOilFilteChangeTime) {
        this.machineOilFilteChangeTime = machineOilFilteChangeTime;
    }

    public BigDecimal getTransmissionOilFilteCycle() {
        return transmissionOilFilteCycle;
    }

    public void setTransmissionOilFilteCycle(BigDecimal transmissionOilFilteCycle) {
        this.transmissionOilFilteCycle = transmissionOilFilteCycle;
    }

    public Integer getTransmissionOilFilteNum() {
        return transmissionOilFilteNum;
    }

    public void setTransmissionOilFilteNum(Integer transmissionOilFilteNum) {
        this.transmissionOilFilteNum = transmissionOilFilteNum;
    }

    public BigDecimal getTransmissionOilFiltePrice() {
        return transmissionOilFiltePrice;
    }

    public void setTransmissionOilFiltePrice(BigDecimal transmissionOilFiltePrice) {
        this.transmissionOilFiltePrice = transmissionOilFiltePrice;
    }

    public BigDecimal getTransmissionOilFilteChangeTime() {
        return transmissionOilFilteChangeTime;
    }

    public void setTransmissionOilFilteChangeTime(BigDecimal transmissionOilFilteChangeTime) {
        this.transmissionOilFilteChangeTime = transmissionOilFilteChangeTime;
    }

    public BigDecimal getHydraulicOilFilteCycle() {
        return hydraulicOilFilteCycle;
    }

    public void setHydraulicOilFilteCycle(BigDecimal hydraulicOilFilteCycle) {
        this.hydraulicOilFilteCycle = hydraulicOilFilteCycle;
    }

    public Integer getHydraulicOilFilteNum() {
        return hydraulicOilFilteNum;
    }

    public void setHydraulicOilFilteNum(Integer hydraulicOilFilteNum) {
        this.hydraulicOilFilteNum = hydraulicOilFilteNum;
    }

    public BigDecimal getHydraulicOilFiltePrice() {
        return hydraulicOilFiltePrice;
    }

    public void setHydraulicOilFiltePrice(BigDecimal hydraulicOilFiltePrice) {
        this.hydraulicOilFiltePrice = hydraulicOilFiltePrice;
    }

    public BigDecimal getHydraulicOilFilteChangeTime() {
        return hydraulicOilFilteChangeTime;
    }

    public void setHydraulicOilFilteChangeTime(BigDecimal hydraulicOilFilteChangeTime) {
        this.hydraulicOilFilteChangeTime = hydraulicOilFilteChangeTime;
    }

    public BigDecimal getFuelFilteCycle() {
        return fuelFilteCycle;
    }

    public void setFuelFilteCycle(BigDecimal fuelFilteCycle) {
        this.fuelFilteCycle = fuelFilteCycle;
    }

    public Integer getFuelFilteNum() {
        return fuelFilteNum;
    }

    public void setFuelFilteNum(Integer fuelFilteNum) {
        this.fuelFilteNum = fuelFilteNum;
    }

    public BigDecimal getFuelFiltePrice() {
        return fuelFiltePrice;
    }

    public void setFuelFiltePrice(BigDecimal fuelFiltePrice) {
        this.fuelFiltePrice = fuelFiltePrice;
    }

    public BigDecimal getFuelFilteChangeTime() {
        return fuelFilteChangeTime;
    }

    public void setFuelFilteChangeTime(BigDecimal fuelFilteChangeTime) {
        this.fuelFilteChangeTime = fuelFilteChangeTime;
    }

    public BigDecimal getAirFilterCycle() {
        return airFilterCycle;
    }

    public void setAirFilterCycle(BigDecimal airFilterCycle) {
        this.airFilterCycle = airFilterCycle;
    }

    public Integer getAirFilterNum() {
        return airFilterNum;
    }

    public void setAirFilterNum(Integer airFilterNum) {
        this.airFilterNum = airFilterNum;
    }

    public BigDecimal getAirFilterPrice() {
        return airFilterPrice;
    }

    public void setAirFilterPrice(BigDecimal airFilterPrice) {
        this.airFilterPrice = airFilterPrice;
    }

    public BigDecimal getAirFilterChangeTime() {
        return airFilterChangeTime;
    }

    public void setAirFilterChangeTime(BigDecimal airFilterChangeTime) {
        this.airFilterChangeTime = airFilterChangeTime;
    }

    public BigDecimal getCoolantFilterCycle() {
        return coolantFilterCycle;
    }

    public void setCoolantFilterCycle(BigDecimal coolantFilterCycle) {
        this.coolantFilterCycle = coolantFilterCycle;
    }

    public Integer getCoolantFilterNum() {
        return coolantFilterNum;
    }

    public void setCoolantFilterNum(Integer coolantFilterNum) {
        this.coolantFilterNum = coolantFilterNum;
    }

    public BigDecimal getCoolantFilterPrice() {
        return coolantFilterPrice;
    }

    public void setCoolantFilterPrice(BigDecimal coolantFilterPrice) {
        this.coolantFilterPrice = coolantFilterPrice;
    }

    public BigDecimal getCoolantFilterChangeTime() {
        return coolantFilterChangeTime;
    }

    public void setCoolantFilterChangeTime(BigDecimal coolantFilterChangeTime) {
        this.coolantFilterChangeTime = coolantFilterChangeTime;
    }

    public BigDecimal getLaborCostFilter() {
        return laborCostFilter;
    }

    public void setLaborCostFilter(BigDecimal laborCostFilter) {
        this.laborCostFilter = laborCostFilter;
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