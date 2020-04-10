package com.dobby.service;

import com.dobby.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    void getByName() {
        List<User> ligq = userService.getByName("ligq8");
        System.out.println(ligq);
    }

    @Test
    void getByAgeMoreThan() {
        List<User> byAgeMoreThan = userService.getByAgeMoreThan(18);
        System.out.println(byAgeMoreThan);
    }

    @Test
    void saveUser() {

        User user = new User();
        user.setAge(22);
        user.setName("abc");
        user.setPassword("123");

        userService.saveUser(user);

    }
}