package com.ctbu.rental.repository;

import com.ctbu.rental.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
