package com.mysiteforme.admin.entity.VO;

import com.mysiteforme.admin.entity.*;

import java.util.List;

public class DeviceDataVo {
    private Long deviceId;
    private List<DeviceFuelConsumption> deviceFuelConsumptions;
    private DeviceGrease deviceGrease;
    private DeviceFilter deviceFilter;
    private DeviceChassis deviceChassis;
    private DeviceBlade deviceBlade;
    private DeviceTrack deviceTrack;
    private DeviceRepair deviceRepair;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public List<DeviceFuelConsumption> getDeviceFuelConsumptions() {
        return deviceFuelConsumptions;
    }

    public void setDeviceFuelConsumptions(List<DeviceFuelConsumption> deviceFuelConsumptions) {
        this.deviceFuelConsumptions = deviceFuelConsumptions;
    }

    public DeviceGrease getDeviceGrease() {
        return deviceGrease;
    }

    public void setDeviceGrease(DeviceGrease deviceGrease) {
        this.deviceGrease = deviceGrease;
    }

    public DeviceFilter getDeviceFilter() {
        return deviceFilter;
    }

    public void setDeviceFilter(DeviceFilter deviceFilter) {
        this.deviceFilter = deviceFilter;
    }

    public DeviceChassis getDeviceChassis() {
        return deviceChassis;
    }

    public void setDeviceChassis(DeviceChassis deviceChassis) {
        this.deviceChassis = deviceChassis;
    }

    public DeviceBlade getDeviceBlade() {
        return deviceBlade;
    }

    public void setDeviceBlade(DeviceBlade deviceBlade) {
        this.deviceBlade = deviceBlade;
    }

    public DeviceTrack getDeviceTrack() {
        return deviceTrack;
    }

    public void setDeviceTrack(DeviceTrack deviceTrack) {
        this.deviceTrack = deviceTrack;
    }

    public DeviceRepair getDeviceRepair() {
        return deviceRepair;
    }

    public void setDeviceRepair(DeviceRepair deviceRepair) {
        this.deviceRepair = deviceRepair;
    }
}
