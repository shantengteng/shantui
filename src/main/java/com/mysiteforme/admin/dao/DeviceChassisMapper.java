package com.mysiteforme.admin.dao;

import com.mysiteforme.admin.entity.DeviceChassis;
import com.mysiteforme.admin.entity.DeviceChassisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceChassisMapper {
    int countByExample(DeviceChassisExample example);

    int deleteByExample(DeviceChassisExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceChassis record);

    int insertSelective(DeviceChassis record);

    List<DeviceChassis> selectByExample(DeviceChassisExample example);

    DeviceChassis selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceChassis record, @Param("example") DeviceChassisExample example);

    int updateByExample(@Param("record") DeviceChassis record, @Param("example") DeviceChassisExample example);

    int updateByPrimaryKeySelective(DeviceChassis record);

    int updateByPrimaryKey(DeviceChassis record);
}