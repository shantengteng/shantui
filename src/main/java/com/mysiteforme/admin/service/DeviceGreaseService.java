package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceGrease;

public interface DeviceGreaseService extends IService<DeviceGrease> {
    DeviceGrease selectByDeviceId(Long deviceId);
}
