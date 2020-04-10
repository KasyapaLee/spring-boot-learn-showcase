package com.dobby.service;

import com.dobby.model.User;

import java.util.List;

public interface UserService {

    List<User> getByName(String name);

    List<User> getByAgeMoreThan(int age);

    boolean saveUser(User user);

    List<User> findAll();

}
