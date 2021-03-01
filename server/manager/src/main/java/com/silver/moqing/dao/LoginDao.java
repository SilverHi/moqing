package com.silver.moqing.dao;

import com.silver.moqing.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @ClassName LoginDao
 * @Description TODO
 * @Author silver
 * @Date 2021/3/1 下午7:27
 * @Version 1.0
 **/
@Mapper
public interface LoginDao {
    User login(@Param("username") String username, @Param("password") String password);
}
