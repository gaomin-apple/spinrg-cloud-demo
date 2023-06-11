package com.example.order.controller;

import com.example.feignapi.client.UserClient;
import com.example.order.controller.result.OrderResult;
import com.example.order.pojo.OrderPojo;
import com.example.order.service.OrderService;
import com.example.usercore.result.UserResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: min gao
 * @Date: 2023/5/14 17:11
 * @Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;
    
    @GetMapping("getOrder")
    public OrderResult getOrder(@RequestParam("orderNo") String orderNo) {
        OrderPojo order = orderService.getOrder(orderNo);
        OrderResult result = new OrderResult();
        BeanUtils.copyProperties(order, result);

        // 给用户信息赋值
       /* String url = "http://userservice/user/getUser?id=1";
        UserResult userResult = restTemplate.getForObject(url, UserResult.class);*/

        UserResult userResult = userClient.findById(1);

        result.setUser(userResult);
        return result;
    }

}
