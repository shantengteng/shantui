package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceTrack;

public interface DeviceTrackService extends IService<DeviceTrack> {
    DeviceTrack selectByDeviceId(Long deviceId);
}
