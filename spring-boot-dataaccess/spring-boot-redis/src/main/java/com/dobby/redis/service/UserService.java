package com.dobby.redis.service;

import com.dobby.redis.model.User;

public interface UserService {


    void addUser(User user);
    User findById(Long id);
    int countUser();

}
