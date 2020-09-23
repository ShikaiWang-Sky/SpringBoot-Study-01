package com.wang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//实现了HandlerInterceptor接口就是一个拦截器
public class LoginHandlerIntercepter implements HandlerInterceptor {
    //return true就是放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录成功之后, 应该有用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");

        if (loginUser == null) {
            //没有登录
            request.setAttribute("msg", "没有权限, 请先登录");
            request.getRequestDispatcher("/index").forward(request, response);
            //不放行
            return false;
        } else {
            return true;
        }
    }
}
