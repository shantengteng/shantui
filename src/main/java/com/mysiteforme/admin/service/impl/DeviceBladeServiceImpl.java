package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceBladeMapper;
import com.mysiteforme.admin.entity.DeviceBlade;
import com.mysiteforme.admin.service.DeviceBladeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceBladeServiceImpl extends ServiceImpl<DeviceBladeMapper, DeviceBlade> implements DeviceBladeService {
    @Override
    public DeviceBlade selectByDeviceId(Long deviceId) {
        return baseMapper.selectByDeviceId(deviceId);
    }
}
