package com.example.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.order.pojo.OrderPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper extends BaseMapper<OrderPojo> {

    @Select("""
        select * from le_order where order_no = #{orderNo}
        """)
    OrderPojo selectByOrderNo(@Param("orderNo") String orderNo);
}
