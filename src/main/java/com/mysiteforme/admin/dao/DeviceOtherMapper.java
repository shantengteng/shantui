package com.mysiteforme.admin.dao;

import com.mysiteforme.admin.entity.DeviceOther;
import com.mysiteforme.admin.entity.DeviceOtherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceOtherMapper {
    int countByExample(DeviceOtherExample example);

    int deleteByExample(DeviceOtherExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceOther record);

    int insertSelective(DeviceOther record);

    List<DeviceOther> selectByExample(DeviceOtherExample example);

    DeviceOther selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceOther record, @Param("example") DeviceOtherExample example);

    int updateByExample(@Param("record") DeviceOther record, @Param("example") DeviceOtherExample example);

    int updateByPrimaryKeySelective(DeviceOther record);

    int updateByPrimaryKey(DeviceOther record);
}