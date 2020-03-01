package com.daxue.eurekacustomera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Admin
 * @date 2020/03/01
 **/
@RestController
public class TestController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping(value = "test/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
    }


}
