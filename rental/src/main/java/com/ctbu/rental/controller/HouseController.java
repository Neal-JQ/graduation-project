package com.ctbu.rental.controller;

import com.ctbu.rental.entity.House;
import com.ctbu.rental.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    HouseService houseService;

    @GetMapping("/findAll")
    public List<House> findAll(){
        return houseService.findAll();
    }
}
