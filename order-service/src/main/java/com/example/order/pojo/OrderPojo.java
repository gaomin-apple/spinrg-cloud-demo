package com.example.order.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther: min gao
 * @Date: 2023/5/14 17:01
 * @Description:
 */

@Getter
@Setter
@ToString
@TableName(value = "le_order")
public class OrderPojo {

    @TableId
    private Integer id;

    private String orderNo;

    private Integer payAmount;

    private Date PayTime;

    private String productNo;

    private Integer userId;

    private Integer isDelete;
}
