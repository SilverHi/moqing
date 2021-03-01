package com.silver.moqing.controller;

import com.silver.moqing.entity.User;
import com.silver.moqing.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName login
 * @Description TODO
 * @Author silver
 * @Date 2021/3/1 下午7:20
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user-login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = loginService.login(username, password);
        if (user != null) {
            return "success";
        }
        return "error";
    }

}
