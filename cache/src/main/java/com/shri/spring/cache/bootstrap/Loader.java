package com.shri.spring.cache.bootstrap;

import com.shri.spring.cache.modules.Users;
import com.shri.spring.cache.modules.enums.Gender;
import com.shri.spring.cache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void load() {
        List<Users> users = getUsers();
        userRepository.saveAll(users);
    }

    private List<Users> getUsers() {

        List<Users> users = new ArrayList<>();
        users.add(new Users("Shrikant", "Vishwakarma", "Express Zenith", Gender.MALE));
        users.add(new Users("Rajeev", "Almiya", "Express Zenith", Gender.MALE));
        users.add(new Users("Mukulit", "Bhati", "Express Zenith", Gender.MALE));
        users.add(new Users("Harsh", "Khari", "Express Zenith", Gender.MALE));

        return users;
    }
}
