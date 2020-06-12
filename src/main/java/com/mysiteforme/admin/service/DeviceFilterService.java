package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceFilter;

public interface DeviceFilterService extends IService<DeviceFilter> {
    DeviceFilter selectByDeviceId(Long deviceId);
}
