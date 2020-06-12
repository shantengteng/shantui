package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceFilter;
import com.mysiteforme.admin.entity.DeviceFilterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceFilterMapper extends BaseMapper<DeviceFilter> {
    int countByExample(DeviceFilterExample example);

    int deleteByExample(DeviceFilterExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceFilter record);

    int insertSelective(DeviceFilter record);

    List<DeviceFilter> selectByExample(DeviceFilterExample example);

    DeviceFilter selectByPrimaryKey(Long id);

    DeviceFilter selectByDeviceId(Long id);

    int updateByExampleSelective(@Param("record") DeviceFilter record, @Param("example") DeviceFilterExample example);

    int updateByExample(@Param("record") DeviceFilter record, @Param("example") DeviceFilterExample example);

    int updateByPrimaryKeySelective(DeviceFilter record);

    int updateByPrimaryKey(DeviceFilter record);
}