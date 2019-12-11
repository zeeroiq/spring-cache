package com.shri.spring.cache.controller;

import com.shri.spring.cache.cache.UserCache;
import com.shri.spring.cache.modules.Users;
import com.shri.spring.cache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users/")
public class HomeController {

    @Autowired
    UserCache userCache;

    @GetMapping("find/{username}")
    public String find(@PathVariable("username") String username) {
        Users user = userCache.getUser(username);
        return "Hi\n" +
                user.toString();
    }

    @GetMapping("findAll")
    public List<Users> findAll() {
        return userCache.getAllUser();
    }
}
