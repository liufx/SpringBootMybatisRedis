package com.example.demo.testRedis;
 
import com.example.demo.base.BaseController;
import com.example.demo.testMybatis.mode.User;
import com.example.demo.util.RedisConstants;
import com.example.demo.util.RedisUtil;
import com.example.demo.util.StateParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @ClassName: RedisTestController
 * @Auther: liufx
 * @Date: 2018/8/28 17:24
 * @Description:
 */
@Controller
@RequestMapping("/redis")
public class RedisTestController extends BaseController {
 
    @Autowired
    RedisUtil redisUtil;
 
    /**
     * @auther: liufx
     * @date: 17:26 2018/8/28
     * @param: []
     * @return: org.springframework.ui.ModelMap
     * @Description: 测试redis存储&读取
     */
    @RequestMapping(value="/test")
    @ResponseBody
    public ModelMap test(){
        try {
            redisUtil.set("redisTemplate","这是一条测试数据", RedisConstants.datebase2);
            String value = redisUtil.get("redisTemplate",RedisConstants.datebase2).toString();
            logger.info("redisValue="+value);
            logger.info("读取redis成功");
            return getModelMap(StateParameter.SUCCESS, value, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }
 
    @RequestMapping(value="/setUser")
    @ResponseBody
    public ModelMap setUser(){
        try {
            User user = new User();
            user.setUsername("李四");
            user.setNickName("隔壁老王");
            user.setRegisterDate(new Date());
            redisUtil.set("user",user, RedisConstants.datebase1);
            User res = (User)redisUtil.get("user",RedisConstants.datebase1);
            logger.info("res="+res.toString());
            logger.info("读取redis成功");
            return getModelMap(StateParameter.SUCCESS, res, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }
 
}

