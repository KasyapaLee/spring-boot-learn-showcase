package com.dobby.rabbitmq;

import com.dobby.rabbitmq.hello.sender.HelloSender;
import com.dobby.rabbitmq.many.sender.Many02Sender;
import com.dobby.rabbitmq.many.sender.ManySender;
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
public class RabbitmqManyTest {


    @Autowired
    private ManySender manySender;
    @Autowired
    private Many02Sender many02Sender;


    @Test
    public void test() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            manySender.send(i);
        }
        Thread.sleep(10000);
    }


    @Test
    public void test02() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            manySender.send(i);
            many02Sender.send(i);
        }
        Thread.sleep(10000);
    }
}
