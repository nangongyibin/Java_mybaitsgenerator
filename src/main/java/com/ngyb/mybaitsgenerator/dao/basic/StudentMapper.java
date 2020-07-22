package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.Student;
import com.ngyb.mybaitsgenerator.beans.basic.StudentQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentQueryHelper example);

    int deleteByExample(StudentQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentQueryHelper example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentQueryHelper example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentQueryHelper example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}