package com.aquiver.learnbootrocket.consume;

import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Classname Customer
 * @Description mq 消费者 Push模式
 * @Date 2021/3/5 15:21
 * @Author 刁闯
 */
@Component

public class Consumer {

    private final Logger logger =  LoggerFactory.getLogger(getClass());

    @RocketMQMessageListener(topic = "orderly_topic:", consumerGroup = "my-consumer_orderly_topic")
    @Service
    public class MyConsumer1 implements RocketMQListener<String>{
        @Override
        public void onMessage(String message) {
            logger.info("received orderlyPaidEvent: {}", message);
        }
    }

    @RocketMQMessageListener(topic = "test-async-topic", consumerGroup = "my-consumer_test-async-topic")
    @Service
    public class MyConsumer3 implements RocketMQListener<Object>{
        @Override
        public void onMessage(Object message) {
            logger.info("received asyncPaidEvent: {}", message);
        }
    }

    @RocketMQMessageListener(topic = "test-sync-topic", consumerGroup = "my-consumer_test-sync-topic")
    @Service
    public class MyConsumer2 implements RocketMQListener<String>{
        @Override
        public void onMessage(String message) {
            logger.info("received syncPaidEvent: {}", message);
        }
    }

    @RocketMQMessageListener(topic = "test-spring-topic", consumerGroup = "my-consumer_test-spring-topic")
    @Service
    public class MyConsumer4 implements RocketMQListener<MessageExt>{
        @Override
        public void onMessage(MessageExt orderPaidEvent) {
            logger.info("received springPaidEvent: {}", orderPaidEvent.toString());
        }
    }

    @RocketMQMessageListener(topic = "message", consumerGroup = "my-consumer_local", selectorExpression= "weixin||qq||zfb")
    @Service
    public class MyConsumer5 implements RocketMQListener<String> {
        @Override
        public void onMessage(String message) {
            logger.info(" local : received orderlyPaidEvent: {}", message);
        }
    }

    @RocketMQMessageListener(topic = "message", consumerGroup = "my-consumer_dev")
    @Service
    public class MyConsumer6 implements RocketMQListener<String> {
        @Override
        public void onMessage(String message) {
            logger.info(" dev : received orderlyPaidEvent: {}", message);
        }
    }


}
