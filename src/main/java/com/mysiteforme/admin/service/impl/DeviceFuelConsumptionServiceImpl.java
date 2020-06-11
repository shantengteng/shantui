package com.mysiteforme.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysiteforme.admin.dao.DeviceFuelConsumptionMapper;
import com.mysiteforme.admin.entity.DeviceFuelConsumption;
import com.mysiteforme.admin.service.DeviceFuelConsumptionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class DeviceFuelConsumptionServiceImpl extends ServiceImpl<DeviceFuelConsumptionMapper, DeviceFuelConsumption> implements DeviceFuelConsumptionService {

    @Override
    public List<DeviceFuelConsumption> selectByExample(Long id) {
        return baseMapper.selectByExample(id);
    }
}
