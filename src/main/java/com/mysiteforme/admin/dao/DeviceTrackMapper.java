package com.mysiteforme.admin.dao;

import com.mysiteforme.admin.entity.DeviceTrack;
import com.mysiteforme.admin.entity.DeviceTrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTrackMapper {
    int countByExample(DeviceTrackExample example);

    int deleteByExample(DeviceTrackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceTrack record);

    int insertSelective(DeviceTrack record);

    List<DeviceTrack> selectByExample(DeviceTrackExample example);

    DeviceTrack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceTrack record, @Param("example") DeviceTrackExample example);

    int updateByExample(@Param("record") DeviceTrack record, @Param("example") DeviceTrackExample example);

    int updateByPrimaryKeySelective(DeviceTrack record);

    int updateByPrimaryKey(DeviceTrack record);
}