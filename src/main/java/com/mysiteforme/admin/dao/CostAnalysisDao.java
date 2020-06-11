package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.Device;

import java.util.List;
import java.util.Map;

public interface CostAnalysisDao extends BaseMapper<Device> {


    List<Device> showAllDevicesList(Map map);
}
