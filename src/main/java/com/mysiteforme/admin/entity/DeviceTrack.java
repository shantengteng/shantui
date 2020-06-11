package com.mysiteforme.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeviceTrack {
    private Long id;

    private Long deviceId;

    private BigDecimal trackCycle;

    private Integer trackNum;

    private BigDecimal trackPrice;

    private BigDecimal trackChangeTime;

    private BigDecimal laborCostTrack;

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

    public BigDecimal getTrackCycle() {
        return trackCycle;
    }

    public void setTrackCycle(BigDecimal trackCycle) {
        this.trackCycle = trackCycle;
    }

    public Integer getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(Integer trackNum) {
        this.trackNum = trackNum;
    }

    public BigDecimal getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(BigDecimal trackPrice) {
        this.trackPrice = trackPrice;
    }

    public BigDecimal getTrackChangeTime() {
        return trackChangeTime;
    }

    public void setTrackChangeTime(BigDecimal trackChangeTime) {
        this.trackChangeTime = trackChangeTime;
    }

    public BigDecimal getLaborCostTrack() {
        return laborCostTrack;
    }

    public void setLaborCostTrack(BigDecimal laborCostTrack) {
        this.laborCostTrack = laborCostTrack;
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