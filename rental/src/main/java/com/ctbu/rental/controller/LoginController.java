package com.ctbu.rental.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/login")
    public String gotoLogin(Model model) {
        model.addAttribute("title", "用户注册");
        model.addAttribute("msg", "欢迎注册");
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(String username, String password) {
        logger.info("username:{}, password:{}",username,password);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String redirectToIndex() {
        return "index";
    }

}
