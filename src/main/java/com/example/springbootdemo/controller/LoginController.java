package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo/login")
public class LoginController {

    @RequestMapping("")
    public String login(   String userName,String passWord){
        return "";
    }
}
