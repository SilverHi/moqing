package com.silver.moqing.controller;

import com.silver.moqing.entity.Result;
import com.silver.moqing.entity.User;
import com.silver.moqing.service.LoginService;
import com.silver.moqing.utils.Md5Util;
import com.silver.moqing.utils.result.ResultCodeEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


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
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Result result = new Result();
        User user = loginService.login(username, password);
        if (user != null) {
            String nowTime = new SimpleDateFormat("yyyyMMdd").format(new Date());
            result.setCode(ResultCodeEnum.SUCCESS.getCode());
            result.setMsg(ResultCodeEnum.SUCCESS.getMessage());
            result.setData(new Md5Util().getMD5(nowTime + username, "moqin"));
            return result;
        }
        result.setCode(ResultCodeEnum.USER_NOT_FOUND.getCode());
        result.setMsg(ResultCodeEnum.USER_NOT_FOUND.getMessage());
        return result;
    }

    @PostMapping("/test")
    public Result test() {
        System.out.println("3333");
        Result result = new Result();
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMsg(ResultCodeEnum.SUCCESS.getMessage());
        return result;
    }

}
