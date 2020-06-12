package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceChassisMapper;
import com.mysiteforme.admin.entity.DeviceChassis;
import com.mysiteforme.admin.service.DeviceChassisService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceChassisServiceImpl extends ServiceImpl<DeviceChassisMapper, DeviceChassis> implements DeviceChassisService {
    @Override
    public DeviceChassis selectByDeviceId(Long deviceId) {
        return baseMapper.selectByDeviceId(deviceId);
    }
}
