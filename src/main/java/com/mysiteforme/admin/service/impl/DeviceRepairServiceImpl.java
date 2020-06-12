package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceRepairMapper;
import com.mysiteforme.admin.entity.DeviceRepair;
import com.mysiteforme.admin.service.DeviceRepairService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceRepairServiceImpl extends ServiceImpl<DeviceRepairMapper, DeviceRepair> implements DeviceRepairService {
    @Override
    public DeviceRepair selectByDeviceId(Long deviceId) {
        return baseMapper.selectByDeviceId(deviceId);
    }
}
