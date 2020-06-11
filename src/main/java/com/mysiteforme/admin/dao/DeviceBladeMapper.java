package com.mysiteforme.admin.dao;

import com.mysiteforme.admin.entity.DeviceBlade;
import com.mysiteforme.admin.entity.DeviceBladeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceBladeMapper {
    int countByExample(DeviceBladeExample example);

    int deleteByExample(DeviceBladeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceBlade record);

    int insertSelective(DeviceBlade record);

    List<DeviceBlade> selectByExample(DeviceBladeExample example);

    DeviceBlade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceBlade record, @Param("example") DeviceBladeExample example);

    int updateByExample(@Param("record") DeviceBlade record, @Param("example") DeviceBladeExample example);

    int updateByPrimaryKeySelective(DeviceBlade record);

    int updateByPrimaryKey(DeviceBlade record);
}