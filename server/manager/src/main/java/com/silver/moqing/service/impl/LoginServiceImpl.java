package com.silver.moqing.service.impl;

import com.silver.moqing.dao.LoginDao;
import com.silver.moqing.entity.User;
import com.silver.moqing.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author silver
 * @Date 2021/3/1 下午7:25
 * @Version 1.0
 **/

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public User login(String username, String password) {
        return loginDao.login(username, password);
    }
}
