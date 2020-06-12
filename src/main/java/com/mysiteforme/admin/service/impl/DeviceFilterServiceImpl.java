package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceFilterMapper;
import com.mysiteforme.admin.entity.DeviceFilter;
import com.mysiteforme.admin.service.DeviceFilterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceFilterServiceImpl extends ServiceImpl<DeviceFilterMapper, DeviceFilter> implements DeviceFilterService {

    @Override
    public DeviceFilter selectByDeviceId(Long deviceId) {
        return baseMapper.selectByDeviceId(deviceId);
    }
}
