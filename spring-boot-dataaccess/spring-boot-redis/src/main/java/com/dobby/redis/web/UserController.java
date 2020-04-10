package com.dobby.redis.web;

import com.dobby.redis.model.User;
import com.dobby.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/find")
    public User find(Long id) {
        return userService.findById(id);
    }


    @GetMapping("/count")
    public int count() {
        return userService.countUser();
    }

}
