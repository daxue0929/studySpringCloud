package com.daxue.eurekacustomera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2020/03/01
 **/
@Controller
public class TestHtmlController {

    @RequestMapping("/show")
    public String showInfo(Model model){
        model.addAttribute("msg","thymeleaf的第一个测试案例");
        return "index";
    }
}
