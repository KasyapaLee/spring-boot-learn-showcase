package com.dobby.mybatis.service;

import com.dobby.mybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class UserServiceTest {


    @Autowired
    private UserService userService;



    @Test
    public void  test() {

        List<User> users = userService.list();
        System.out.println(users);


    }
}