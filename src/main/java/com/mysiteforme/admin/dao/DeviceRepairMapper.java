package com.mysiteforme.admin.dao;

import com.mysiteforme.admin.entity.DeviceRepair;
import com.mysiteforme.admin.entity.DeviceRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceRepairMapper {
    int countByExample(DeviceRepairExample example);

    int deleteByExample(DeviceRepairExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceRepair record);

    int insertSelective(DeviceRepair record);

    List<DeviceRepair> selectByExample(DeviceRepairExample example);

    DeviceRepair selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceRepair record, @Param("example") DeviceRepairExample example);

    int updateByExample(@Param("record") DeviceRepair record, @Param("example") DeviceRepairExample example);

    int updateByPrimaryKeySelective(DeviceRepair record);

    int updateByPrimaryKey(DeviceRepair record);
}