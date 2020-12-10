package com.acq.controller;

import com.acq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public void test(){
        System.out.println(userService.queryUserById(1));
        System.out.println("helloWorld");
    }
}
