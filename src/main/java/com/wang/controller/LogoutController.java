package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    //移除loginUser字段
    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("loginUser");
        return "redirect:/index";
    }
}
