package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.TimeSetting;
import com.ngyb.mybaitsgenerator.beans.basic.TimeSettingQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeSettingMapper {
    int countByExample(TimeSettingQueryHelper example);

    int deleteByExample(TimeSettingQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(TimeSetting record);

    int insertSelective(TimeSetting record);

    List<TimeSetting> selectByExample(TimeSettingQueryHelper example);

    TimeSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TimeSetting record, @Param("example") TimeSettingQueryHelper example);

    int updateByExample(@Param("record") TimeSetting record, @Param("example") TimeSettingQueryHelper example);

    int updateByPrimaryKeySelective(TimeSetting record);

    int updateByPrimaryKey(TimeSetting record);
}