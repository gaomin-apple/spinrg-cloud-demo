package com.example.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.user.mapper.UserMapper;
import com.example.usercore.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Auther: min gao
 * @Date: 2023/5/2 21:19
 * @Description:
 */
@Service
//@RequiredArgsConstructor
public class UserService {
    @Autowired
    private  UserMapper userMapper;

    public UserPojo getUser(String username) {
        if (StringUtils.containsWhitespace(username)) return null;
       return userMapper.selectOne(new QueryWrapper<UserPojo>()
            .eq(UserPojo.USERNAME, username));
    }

    public UserPojo getUserById(Integer id) {
        return userMapper.selectById(id);
    }

    public void insertUser(UserPojo pojo) {
        userMapper.insert(pojo);
    }

    public void updateUser(UserPojo pojo) {
        userMapper.updateById(pojo);
    }
}
