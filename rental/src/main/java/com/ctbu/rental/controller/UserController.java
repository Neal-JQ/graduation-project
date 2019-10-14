package com.ctbu.rental.controller;

import com.ctbu.rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/userMaintenance")
    public String redirectToUserMaintenance(ModelMap modelMap) {
        modelMap.addAttribute("users", userService.findAll());
        return "admin/userMaintenance";
    }
}
