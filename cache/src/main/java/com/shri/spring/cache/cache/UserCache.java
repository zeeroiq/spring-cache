package com.shri.spring.cache.cache;

import com.shri.spring.cache.modules.Users;
import com.shri.spring.cache.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class UserCache {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "usersCache", key = "#firstName")
    public Users getUser(String firstName) {
        log.info(">>>>> Retrieving data from database for user : {}", firstName);
        return userRepository.findByFirstName(firstName);
    }

    @Cacheable(value = "usersCache")
    public List<Users> getAllUser() {
        log.info(">>>>> Retrieving data from database for all users");
        return userRepository.findAll();
    }
}
