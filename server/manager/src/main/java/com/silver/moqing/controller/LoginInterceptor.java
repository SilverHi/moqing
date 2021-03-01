package com.silver.moqing.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.runtime.Log;

/**
 * @ClassName LoginInterceptor
 * @Description TODO
 * @Author silver
 * @Date 2021/3/2 上午12:11
 * @Version 1.0
 **/

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println(">>>LoginInterceptor>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");
        String token = request.getParameter("token");
        System.out.println(token);
        if (token != null && token.length() > 0) {
            System.out.println("1111");
            return true;// 只有返回true才会继续向下执行，返回false取消当前请求
        } else {
            System.out.println("2222");
            response.setStatus(401);
            return false;// 只有返回true才会继续向下执行，返回false取消当前请求
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println(">>>LoginInterceptor>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println(">>>LoginInterceptor>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }

}

