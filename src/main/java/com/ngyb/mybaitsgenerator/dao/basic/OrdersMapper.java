package com.ngyb.mybaitsgenerator.dao.basic;

import com.ngyb.mybaitsgenerator.beans.basic.Orders;
import com.ngyb.mybaitsgenerator.beans.basic.OrdersQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersQueryHelper example);

    int deleteByExample(OrdersQueryHelper example);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersQueryHelper example);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersQueryHelper example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersQueryHelper example);
}