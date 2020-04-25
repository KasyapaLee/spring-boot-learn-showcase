package com.dobby.rabbitmq;

import com.dobby.rabbitmq.common.User;
import com.dobby.rabbitmq.many.sender.Many02Sender;
import com.dobby.rabbitmq.many.sender.ManySender;
import com.dobby.rabbitmq.object.ObjectSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>
 *
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@SpringBootTest
public class RabbitmqObjectTest {


    @Autowired
    private ObjectSender objectSender;


    @Test
    public void test() throws InterruptedException {

        User user = new User();
        user.setId(1l);
        user.setName("ligq");
        user.setAge(12);
        user.setEmail("ligq@gmail.com");

        objectSender.send(user);
        Thread.sleep(10000);
    }



}
