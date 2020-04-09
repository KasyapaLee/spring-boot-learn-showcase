package com.dobby.mybatis.mapper;

import com.dobby.mybatis.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.lang.model.element.VariableElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {

        @Autowired
        private UserMapper userMapper;

        @Test
        public void testSelect() {
//            List<User> ligq = userMapper.getByName("ligq6");
//            System.out.println(ligq);

//            User user = userMapper.selectById(18L);
//            System.out.println(user);

//            List<User> all = userMapper.selectList(null);
//            System.out.println(all);

//            List<User> getAll = userMapper.getAll();
//            System.out.println(getAll);


            List<User> byAgeMoreThan = userMapper.getByAgeMoreThan(18);
            System.out.println(byAgeMoreThan);
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

            userMapper.deleteById(1248140198930354177L);
        }
}