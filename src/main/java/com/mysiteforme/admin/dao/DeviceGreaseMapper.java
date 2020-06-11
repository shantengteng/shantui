package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceGrease;
import com.mysiteforme.admin.entity.DeviceGreaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceGreaseMapper extends BaseMapper<DeviceGrease> {
    int countByExample(DeviceGreaseExample example);

    int deleteByExample(DeviceGreaseExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceGrease record);

    int insertSelective(DeviceGrease record);

    List<DeviceGrease> selectByExample(DeviceGreaseExample example);

    DeviceGrease selectByPrimaryKey(Long id);

    DeviceGrease selectByDeviceId(Long deviceId);

    int updateByExampleSelective(@Param("record") DeviceGrease record, @Param("example") DeviceGreaseExample example);

    int updateByExample(@Param("record") DeviceGrease record, @Param("example") DeviceGreaseExample example);

    int updateByPrimaryKeySelective(DeviceGrease record);

    int updateByPrimaryKey(DeviceGrease record);
}