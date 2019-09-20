package com.example.demo.testMybatis.service;

import com.example.demo.testMybatis.mode.User;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
public interface UserService {

    User getUserInfo(String userName);

    List<User> findAll();
}
