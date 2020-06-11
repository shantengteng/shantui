package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.DeviceFuelConsumption;

import java.util.List;

public interface DeviceFuelConsumptionService extends IService<DeviceFuelConsumption> {

    List<DeviceFuelConsumption> selectByExample(Long id);
}
