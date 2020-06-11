package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceFuelConsumption;
import com.mysiteforme.admin.entity.DeviceFuelConsumptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceFuelConsumptionMapper extends BaseMapper<DeviceFuelConsumption> {
    int countByExample(DeviceFuelConsumptionExample example);

    int deleteByExample(DeviceFuelConsumptionExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceFuelConsumption record);

    int insertSelective(DeviceFuelConsumption record);

    List<DeviceFuelConsumption> selectByExample(Long id);

    DeviceFuelConsumption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceFuelConsumption record, @Param("example") DeviceFuelConsumptionExample example);

    int updateByExample(@Param("record") DeviceFuelConsumption record, @Param("example") DeviceFuelConsumptionExample example);

    int updateByPrimaryKeySelective(DeviceFuelConsumption record);

    int updateByPrimaryKey(DeviceFuelConsumption record);
}