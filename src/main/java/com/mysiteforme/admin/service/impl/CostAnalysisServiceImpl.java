package com.mysiteforme.admin.service.impl;

import com.mysiteforme.admin.service.CostAnalysisService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class CostAnalysisServiceImpl implements CostAnalysisService {

//    @Override
//    public List<Device> selectAllDevices(Map<String, Object> map) {
//        return baseMapper.showAllDevicesList(map);
//    }
}
