package com.example.demo.weather;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "天气信息查询")
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ApiOperation(value = "天气基本信息查询")
    @ApiImplicitParam(name = "strCityName", value = "城市名称", required = true, paramType = "query")
    @GetMapping("/jbxx")
    public WeatherInfo queryBasicInfo(@RequestParam String strCityName) {
        return weatherService.queryBasicInfo(strCityName);
    }
}

