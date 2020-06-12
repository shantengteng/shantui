package com.mysiteforme.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mysiteforme.admin.entity.DeviceTrack;
import com.mysiteforme.admin.entity.DeviceTrackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceTrackMapper extends BaseMapper<DeviceTrack> {
    int countByExample(DeviceTrackExample example);

    int deleteByExample(DeviceTrackExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(DeviceTrack record);

    int insertSelective(DeviceTrack record);

    List<DeviceTrack> selectByExample(DeviceTrackExample example);

    DeviceTrack selectByPrimaryKey(Long id);

    DeviceTrack selectByDeviceId(Long id);

    int updateByExampleSelective(@Param("record") DeviceTrack record, @Param("example") DeviceTrackExample example);

    int updateByExample(@Param("record") DeviceTrack record, @Param("example") DeviceTrackExample example);

    int updateByPrimaryKeySelective(DeviceTrack record);

    int updateByPrimaryKey(DeviceTrack record);
}