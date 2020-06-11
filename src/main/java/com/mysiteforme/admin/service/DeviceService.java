package com.mysiteforme.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysiteforme.admin.entity.Device;

import java.util.List;
import java.util.Map;

public interface DeviceService extends IService<Device> {

    List<Device> selectAllDevices(Map<String,Object> map);
}
