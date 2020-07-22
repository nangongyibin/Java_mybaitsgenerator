package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.Users;
import com.ngyb.mybaitsgenerator.beans.basic.UsersQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersQueryHelper example);

    int deleteByExample(UsersQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersQueryHelper example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersQueryHelper example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersQueryHelper example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}