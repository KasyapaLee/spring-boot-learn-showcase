package com.dobby.jpa.repository;

import com.dobby.jpa.model.User;
import org.apache.tomcat.util.http.ResponseUtil;
import org.apache.tomcat.util.net.openssl.OpenSSLUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author liguoqing
 * @date 2019-02-20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test()  {
        List<User> userList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("ligq" + i);
            user.setAge(22);
            user.setPassword("12345");
            userList.add(user);
        }
        userRepository.saveAll(userList);
    }


    @Test
    public void testUpdate() {
        User user = userRepository.findById(15L).get();
        System.out.println(user.toString());

        user.setName(user.getName() + "-update");
        userRepository.save(user);
    }


    @Test
    public void testDelete() {
        User user = userRepository.findById(15L).get();
        userRepository.delete(user);
    }


    @Test
    public void testSelect() {

        User ligq0 = userRepository.findByName("ligq0");
        System.out.println(ligq0);


        User ligq1 = userRepository.findByNameAndAge("ligq1", 22);
        System.out.println(ligq1);

//        List<User> all = userRepository.findAll();
//        System.out.println(all);
    }
}