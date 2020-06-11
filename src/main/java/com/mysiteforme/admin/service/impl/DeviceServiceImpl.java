package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceDao;
import com.mysiteforme.admin.entity.Device;
import com.mysiteforme.admin.service.DeviceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceServiceImpl extends ServiceImpl<DeviceDao, Device> implements DeviceService {

    @Override
    public List<Device> selectAllDevices(Map<String, Object> map) {
        return baseMapper.showAllDevicesList(map);
    }
}
