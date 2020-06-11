package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceGreaseMapper;
import com.mysiteforme.admin.entity.DeviceGrease;
import com.mysiteforme.admin.service.DeviceGreaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceGreaseServiceImpl extends ServiceImpl<DeviceGreaseMapper, DeviceGrease> implements DeviceGreaseService {
    @Override
    public DeviceGrease selectByDeviceId(Long deviceId) {
        return baseMapper.selectByDeviceId(deviceId);
    }
}
