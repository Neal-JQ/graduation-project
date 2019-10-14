package com.ctbu.rental.service;

import com.ctbu.rental.entity.Role;
import com.ctbu.rental.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }
}
