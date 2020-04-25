package com.dobby.rabbitmq;

import com.dobby.rabbitmq.hello.sender.HelloSender;
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
public class RabbitmqHelloTest {


    @Autowired
    private HelloSender helloSender;


    @Test
    public void test() throws InterruptedException {
        helloSender.send();
        Thread.sleep(10000);
    }
}
