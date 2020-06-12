package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceRepair;

public interface DeviceRepairService extends IService<DeviceRepair> {
    DeviceRepair selectByDeviceId(Long deviceId);
}
