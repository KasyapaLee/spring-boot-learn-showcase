package com.dobby.rabbitmq;

import com.dobby.rabbitmq.fanout.FanoutSender;
import com.dobby.rabbitmq.topic.TopicSender;
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
public class RabbitmqFanoutTest {


    @Autowired
    private FanoutSender fanoutSender;


    @Test
    public void test() throws InterruptedException {

        fanoutSender.send();

        Thread.sleep(10000);
    }
}
