package com.example.user.controller;

import com.example.user.service.UserService;
import com.example.usercore.pojo.UserPojo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * @Auther: min gao
 * @Date: 2023/5/2 21:19
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/v1/login")
    public boolean login(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password) {

        UserPojo user = userService.getUser(username);
        return null != user;
    }

    @Value("${pattern.dateformat}")
    private String formatStr;

    @GetMapping("/getNowDate")
    public String getNowDate() {
        String format = DateFormatUtils.format(Calendar.getInstance().getTime(), formatStr);
        log.info("当前时间为：{}", format);
        return format;
    }

    @GetMapping( "/getUser")
    public UserPojo getUser(@RequestParam(value = "id") Integer id, @RequestHeader(value = "Truth", required = false) String truth) {
        UserPojo user = userService.getUserById(id);
        log.info("/user/getUser result:{}", user.toString());
        log.info("truth: "+ truth);
        return user;
    }

    @PostMapping("/insert")
    public void insertUser(@RequestBody UserPojo pojo) {
        userService.insertUser(pojo);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody UserPojo pojo) {
        userService.updateUser(pojo);
    }

}
