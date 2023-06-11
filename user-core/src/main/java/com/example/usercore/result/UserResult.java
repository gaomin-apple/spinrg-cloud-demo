package com.example.usercore.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther: min gao
 * @Date: 2023/5/14 17:59
 * @Description:
 */
@Getter
@Setter
@ToString
public class UserResult {
    private Integer id;

    private String username;

    private String firstName;

    private String lastName;

    private Integer age;

    private String password;

    private Date createTime;
}
