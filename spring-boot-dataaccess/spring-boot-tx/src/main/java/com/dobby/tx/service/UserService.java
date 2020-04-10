package com.dobby.tx.service;

import com.dobby.tx.model.User;
import com.dobby.tx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    @Transactional(rollbackOn = Exception.class)
    public void saveUserTest() {

        User user = new User();
        user.setName("xx");
        user.setAge(12);
        user.setPassword("123");
        userRepository.save(user);

        int num = 34 / 0;

        User user2 = new User();
        user2.setName("yy");
        user2.setAge(13);
        user2.setPassword("456");
        userRepository.save(user2);
    }

}
