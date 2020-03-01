package com.daxue.eurekaprovidea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 */
@RestController
public class UserController {

    @GetMapping(value = "/user/hello")
    public String hello() {
        return "hello";
    }


}
