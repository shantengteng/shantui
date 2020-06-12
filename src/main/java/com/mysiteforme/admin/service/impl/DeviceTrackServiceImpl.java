package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceTrackMapper;
import com.mysiteforme.admin.entity.DeviceTrack;
import com.mysiteforme.admin.service.DeviceTrackService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceTrackServiceImpl extends ServiceImpl<DeviceTrackMapper, DeviceTrack> implements DeviceTrackService {
    @Override
    public DeviceTrack selectByDeviceId(Long deviceId) {
        return baseMapper.selectByDeviceId(deviceId);
    }
}
