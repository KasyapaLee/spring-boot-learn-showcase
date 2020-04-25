package com.dobby.mybatis.mapper;

import com.dobby.mybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {

        List<User> getAll = userMapper.getAll();
        System.out.println(getAll);

        List<User> byAgeMoreThan = userMapper.getByAgeMoreThan(18);
        System.out.println(byAgeMoreThan);
    }


    @Test
    public void testSave() {

        User user = new User();
        user.setName("yj");
        user.setAge(18);
        user.setPassword("123");


    }


    @Test
    public void testDelete() {

    }
}