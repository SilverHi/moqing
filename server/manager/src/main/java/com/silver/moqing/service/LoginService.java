package com.silver.moqing.service;

import com.silver.moqing.entity.User;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author silver
 * @Date 2021/3/1 下午7:24
 * @Version 1.0
 **/

public interface LoginService {
    User login(String username, String password);
}
