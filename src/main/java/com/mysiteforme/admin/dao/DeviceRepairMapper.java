package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceRepair;
import com.mysiteforme.admin.entity.DeviceRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceRepairMapper extends BaseMapper<DeviceRepair> {
    int countByExample(DeviceRepairExample example);

    int deleteByExample(DeviceRepairExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceRepair record);

    int insertSelective(DeviceRepair record);

    List<DeviceRepair> selectByExample(DeviceRepairExample example);

    DeviceRepair selectByPrimaryKey(Long id);

    DeviceRepair selectByDeviceId(Long id);

    int updateByExampleSelective(@Param("record") DeviceRepair record, @Param("example") DeviceRepairExample example);

    int updateByExample(@Param("record") DeviceRepair record, @Param("example") DeviceRepairExample example);

    int updateByPrimaryKeySelective(DeviceRepair record);

    int updateByPrimaryKey(DeviceRepair record);
}