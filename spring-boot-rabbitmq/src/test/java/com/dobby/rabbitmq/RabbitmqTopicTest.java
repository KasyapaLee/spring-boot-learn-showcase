package com.dobby.rabbitmq;

import com.dobby.rabbitmq.hello.sender.HelloSender;
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
public class RabbitmqTopicTest {


    @Autowired
    private TopicSender topicSender;


    @Test
    public void test() throws InterruptedException {

        topicSender.sendOne();

//        topicSender.sendTwo();

        Thread.sleep(10000);
    }
}
