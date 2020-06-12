package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceBlade;
import com.mysiteforme.admin.entity.DeviceBladeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceBladeMapper extends BaseMapper<DeviceBlade> {
    int countByExample(DeviceBladeExample example);

    int deleteByExample(DeviceBladeExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceBlade record);

    int insertSelective(DeviceBlade record);

    List<DeviceBlade> selectByExample(DeviceBladeExample example);

    DeviceBlade selectByPrimaryKey(Long id);

    DeviceBlade selectByDeviceId(Long id);

    int updateByExampleSelective(@Param("record") DeviceBlade record, @Param("example") DeviceBladeExample example);

    int updateByExample(@Param("record") DeviceBlade record, @Param("example") DeviceBladeExample example);

    int updateByPrimaryKeySelective(DeviceBlade record);

    int updateByPrimaryKey(DeviceBlade record);
}