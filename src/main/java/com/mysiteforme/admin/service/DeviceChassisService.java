package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceChassis;

public interface DeviceChassisService extends IService<DeviceChassis> {
    DeviceChassis selectByDeviceId(Long deviceId);
}
