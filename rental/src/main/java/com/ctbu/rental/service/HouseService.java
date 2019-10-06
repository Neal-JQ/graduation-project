package com.ctbu.rental.service;

import com.ctbu.rental.entity.House;
import com.ctbu.rental.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    HouseRepository houseRepository;

    public List<House> findAll(){
        return (List<House>) houseRepository.findAll();
    }
}
