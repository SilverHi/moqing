package com.silver.moqing.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName MyWebAppConfigurer
 * @Description TODO
 * @Author silver
 * @Date 2021/3/2 上午12:16
 * @Version 1.0
 **/

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user-login/test");
        super.addInterceptors(registry);
    }

}

