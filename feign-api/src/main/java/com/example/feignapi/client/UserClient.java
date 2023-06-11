package com.example.feignapi.client;

import com.example.usercore.result.UserResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: min gao
 * @Date: 2023/5/25 20:54
 * @Description:
 */
@FeignClient("userservice")
public interface UserClient {

    @GetMapping("/user/getUser")
    UserResult findById(@RequestParam("id") Integer id);
}
