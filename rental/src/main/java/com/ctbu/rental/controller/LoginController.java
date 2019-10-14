package com.ctbu.rental.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
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
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            return "未知账户";
        } catch (IncorrectCredentialsException ice) {
            return "密码不正确";
        } catch (LockedAccountException lae) {
            return "账户已锁定";
        } catch (ExcessiveAttemptsException eae) {
            return "用户名或密码错误次数过多";
        } catch (AuthenticationException ae) {
            return "用户名或密码不正确！";
        }
        if (subject.isAuthenticated()) {
            logger.info("username:{}, password:{}",username,password);
            return "redirect:/index";
        } else {
            token.clear();
            return "登录失败";
        }
    }

    @GetMapping("/index")
    public String redirectToIndex() {
        return "index";
    }

    @GetMapping("/adminIndex")
    public String redirectToAdminIndex() {
        return "adminIndex";
    }

}
