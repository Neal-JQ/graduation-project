package com.ctbu.rental.service;

import com.ctbu.rental.entity.User;
import com.ctbu.rental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
}
