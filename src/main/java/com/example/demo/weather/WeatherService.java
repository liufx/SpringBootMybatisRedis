package com.example.demo.weather;

import com.example.demo.ResponseInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherService {


    public WeatherInfo queryBasicInfo(String strCityName) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders requestHeaders = new HttpHeaders();
        Map<String, String> parmaters = new HashMap<String, String>();

        requestHeaders.set("Authorization", "APPCODE be798c614b5545cb82fa588408866293");
        parmaters.put("city", strCityName);

        HttpEntity requestEntity = new HttpEntity(requestHeaders);
        ResponseEntity<WeatherInfo> response = restTemplate.exchange("https://jisutqybmf.market.alicloudapi.com/weather/query?city={city}", HttpMethod.GET, requestEntity, WeatherInfo.class, parmaters);
        return response.getBody();
    }


}
