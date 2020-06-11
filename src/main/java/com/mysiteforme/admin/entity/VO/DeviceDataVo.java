package com.mysiteforme.admin.entity.VO;

import com.mysiteforme.admin.entity.DeviceFuelConsumption;
import com.mysiteforme.admin.entity.DeviceGrease;

import java.util.List;

public class DeviceDataVo {
    private Long deviceId;
    private List<DeviceFuelConsumption> deviceFuelConsumptions;
    private DeviceGrease deviceGrease;

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
}
