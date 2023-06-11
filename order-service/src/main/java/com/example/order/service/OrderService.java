package com.example.order.service;

import com.example.order.mapper.OrderMapper;
import com.example.order.pojo.OrderPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther: min gao
 * @Date: 2023/5/14 17:08
 * @Description:
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    public OrderPojo getOrder(String orderNo) {
        return orderMapper.selectByOrderNo(orderNo);
    }

}
