package com.example.usercore.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther: min gao
 * @Date: 2023/5/2 21:15
 * @Description:
 */
@Getter
@Setter
@ToString
@TableName(value = "le_user")
public class UserPojo {

    public static final String USERNAME = "username";


    @TableId
    private Integer id;

    private String username;

    private String firstName;

    private String lastName;

    private Integer age;

    private String password;

    private Date createTime;
}
