package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.Info;
import com.ngyb.mybaitsgenerator.beans.basic.InfoQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    int countByExample(InfoQueryHelper example);

    int deleteByExample(InfoQueryHelper example);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoQueryHelper example);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoQueryHelper example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoQueryHelper example);
}