package com.example.order.controller.result;

import com.example.usercore.result.UserResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther: min gao
 * @Date: 2023/5/14 17:57
 * @Description:
 */

@Getter
@Setter
@ToString
public class OrderResult {

    private Integer id;

    private String orderNo;

    private Integer payAmount;

    private Date PayTime;

    private String productNo;

    private Integer userId;

    private Integer isDelete;

    private UserResult user;
}
