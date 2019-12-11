package com.shri.spring.cache.repository;

import com.shri.spring.cache.modules.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByFirstName(String firstName);

}
