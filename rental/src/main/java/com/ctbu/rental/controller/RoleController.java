package com.ctbu.rental.controller;

import com.ctbu.rental.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/roleMaintenance")
    public String redirectToRoleMaintenance(ModelMap modelMap) {
        modelMap.addAttribute("roles", roleService.findAll());
        return "admin/roleMaintenance";
    }
}
