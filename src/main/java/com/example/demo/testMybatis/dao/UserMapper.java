package com.example.demo.testMybatis.dao;

import com.example.demo.testMybatis.mode.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
@Mapper //指定这是一个操作数据库的mapper
public interface UserMapper {
    User getUserInfo(String userName);

    List<User> findAll();
}
