package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.Info2;
import com.ngyb.mybaitsgenerator.beans.basic.Info2QueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Info2Mapper {
    int countByExample(Info2QueryHelper example);

    int deleteByExample(Info2QueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Info2 record);

    int insertSelective(Info2 record);

    List<Info2> selectByExample(Info2QueryHelper example);

    Info2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Info2 record, @Param("example") Info2QueryHelper example);

    int updateByExample(@Param("record") Info2 record, @Param("example") Info2QueryHelper example);

    int updateByPrimaryKeySelective(Info2 record);

    int updateByPrimaryKey(Info2 record);
}