package com.dobby.jdbc.repository;

import com.dobby.jdbc.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

/**
 * @author liguoqing
 */
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testSave() {

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("ligq" + i);
            user.setAge(22);
            user.setPassword("123456");
            userRepository.save(user);
        }

    }


    @Test
    public void testUpdate() {
        User user = new User();
        user.setName("ligq-update");
        user.setAge(24);
        user.setPassword("123456**");
        user.setId(1L);
        userRepository.update(user);
    }


    @Test
    public void testDetele() {
        userRepository.delete(1L);
    }

    @Test
    public void testFindOne() {
        User user = userRepository.findById(2L);
        System.out.println("user == " + user.toString());
    }

    @Test
    public void testFindAll() {
        List<User> users = userRepository.findALL();
        for (User user : users) {
            System.out.println("user == " + user.toString());
        }
    }
}