package com.mysiteforme.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("device_repair")
public class DeviceRepair {
    private Long id;

    private Long deviceId;

    private BigDecimal repairCostLight;

    private BigDecimal repairCostStandard;

    private BigDecimal repairCostHeavy;

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

    public BigDecimal getRepairCostLight() {
        return repairCostLight;
    }

    public void setRepairCostLight(BigDecimal repairCostLight) {
        this.repairCostLight = repairCostLight;
    }

    public BigDecimal getRepairCostStandard() {
        return repairCostStandard;
    }

    public void setRepairCostStandard(BigDecimal repairCostStandard) {
        this.repairCostStandard = repairCostStandard;
    }

    public BigDecimal getRepairCostHeavy() {
        return repairCostHeavy;
    }

    public void setRepairCostHeavy(BigDecimal repairCostHeavy) {
        this.repairCostHeavy = repairCostHeavy;
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