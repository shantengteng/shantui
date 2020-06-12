package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceChassis;
import com.mysiteforme.admin.entity.DeviceChassisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceChassisMapper extends BaseMapper<DeviceChassis> {
    int countByExample(DeviceChassisExample example);

    int deleteByExample(DeviceChassisExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceChassis record);

    int insertSelective(DeviceChassis record);

    List<DeviceChassis> selectByExample(DeviceChassisExample example);

    DeviceChassis selectByPrimaryKey(Long id);

    DeviceChassis selectByDeviceId(Long id);

    int updateByExampleSelective(@Param("record") DeviceChassis record, @Param("example") DeviceChassisExample example);

    int updateByExample(@Param("record") DeviceChassis record, @Param("example") DeviceChassisExample example);

    int updateByPrimaryKeySelective(DeviceChassis record);

    int updateByPrimaryKey(DeviceChassis record);
}