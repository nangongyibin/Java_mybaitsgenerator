package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.Login;
import com.ngyb.mybaitsgenerator.beans.basic.LoginQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    int countByExample(LoginQueryHelper example);

    int deleteByExample(LoginQueryHelper example);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginQueryHelper example);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginQueryHelper example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginQueryHelper example);
}