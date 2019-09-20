package com.example.demo.testMybatis.service.impl;


import com.example.demo.testMybatis.dao.UserMapper;
import com.example.demo.testMybatis.mode.User;
import com.example.demo.testMybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfo(String userName)
    {
        return userMapper.getUserInfo(userName);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
