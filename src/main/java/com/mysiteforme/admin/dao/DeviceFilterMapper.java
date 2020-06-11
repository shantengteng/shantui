package com.mysiteforme.admin.dao;

import com.mysiteforme.admin.entity.DeviceFilter;
import com.mysiteforme.admin.entity.DeviceFilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceFilterMapper {
    int countByExample(DeviceFilterExample example);

    int deleteByExample(DeviceFilterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceFilter record);

    int insertSelective(DeviceFilter record);

    List<DeviceFilter> selectByExample(DeviceFilterExample example);

    DeviceFilter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceFilter record, @Param("example") DeviceFilterExample example);

    int updateByExample(@Param("record") DeviceFilter record, @Param("example") DeviceFilterExample example);

    int updateByPrimaryKeySelective(DeviceFilter record);

    int updateByPrimaryKey(DeviceFilter record);
}