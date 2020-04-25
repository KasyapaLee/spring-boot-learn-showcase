package com.dobby.mybatis.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        //
        User user = userMapper.selectById(1l);
        System.out.println(user);

        List<User> ligq = userMapper.getByName("lgq6");
        System.out.println(ligq);

        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);

    }

    @Test
    public void testPage() {

        Page<User> page = new Page<>(2,3);
        Page<User> pageList = userMapper.selectPage(page, null);
        System.out.println(pageList);
    }



    @Test
    public void testSave() {

        User user = new User();
        user.setName("yj");
        user.setAge(18);
        user.setPassword("123");
        userMapper.insert(user);

    }


    @Test
    public void testDelete() {

        userMapper.deleteById(10);

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
        userMapper.delete(userQueryWrapper);
    }


    @Test
    public void testUpdate() {

        User user = userMapper.selectById(1l);
        user.setName("update");

        userMapper.updateById(user);

    }

}