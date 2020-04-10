package com.dobby.service;

import com.dobby.mapper.UserMapper;
import com.dobby.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getByAgeMoreThan(int age) {
        return userMapper.getByAgeMoreThan(age);
    }

    @Override
    public List<User> getByName(String name) {
        return userMapper.getByName(name);
    }

    @Override
    public boolean saveUser(User user) {
        int result = userMapper.insert(user);
        if (result != 1) {
            return false;
        }
        return true;
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }
}
