package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceBlade;

public interface DeviceBladeService extends IService<DeviceBlade> {
    DeviceBlade selectByDeviceId(Long deviceId);
}
