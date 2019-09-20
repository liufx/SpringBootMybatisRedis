package com.example.demo.testMybatis.controller;

import com.example.demo.base.CodeMsg;
import com.example.demo.base.Result;
import com.example.demo.testMybatis.dao.UserMapper;
import com.example.demo.testMybatis.mode.User;
import com.example.demo.testMybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
@Api(produces = "mybatis测试")
@RestController
@RequestMapping(value = "/mybatis", produces = "application/json; charset=UTF-8")
public class MybatisController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户查询")
    @ApiImplicitParam(name = "userName", value = "用户姓名", required = true, paramType = "query")
    @GetMapping("/user")
    public Result getUserInfo(@RequestParam String userName) {
        User user = userService.getUserInfo(userName);
        //String  nam=userMapperDao.getUserNameById(userid);
        if (user != null) {
            return Result.success(user);
        } else {
            return Result.error(CodeMsg.SERVER_ERROR);
        }


    }

    @ApiOperation(value = "查询所有用户")
    @GetMapping("/findAll")
    public Result findAll() {
        List<User> data = userService.findAll();
        if (data != null) {
            return Result.success(data);
        } else {
            return Result.error(CodeMsg.SERVER_ERROR);
        }
    }
}
