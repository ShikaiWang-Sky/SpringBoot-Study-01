package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {
        //具体的业务
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            //重定向
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        } else {
            //提示用户,登录失败
            model.addAttribute("msg", "用户名或密码错误!");
            //返回登录页
            return "index";
        }
    }
}
