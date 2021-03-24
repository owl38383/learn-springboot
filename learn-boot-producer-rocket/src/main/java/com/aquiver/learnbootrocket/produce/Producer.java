package com.aquiver.learnbootrocket.produce;

import com.aquiver.common.constant.MqTopic;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
/***
 *
 同步发送消息
 异步发送消息
 以单向方式发送消息
 发送有序消息
 发送批量消息
 发送交易信息
 发送具有延迟级别的计划消息
 使用并发模式的消息（广播/群集）
 消费有序消息
 使用标签或sql92表达式过滤消息
 支持消息跟踪
 支持身份验证和授权
 支持请求-回复消息交换模式
 以推/拉模式使用消息
 */

/**
 * @Classname Producer
 * @Description 发送消息
 * @Date 2021/3/5 12:33
 * @Author 刁闯
 */
public class Producer {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void sendMessage(String topicName, String message) {
        topicName = MqTopic.MESSAGE.getTopic()+":"+topicName;
        //发送同步消息
        rocketMQTemplate.convertAndSend(topicName, message);
    }

    public void sendSyncMessage(String topicName, String message) {
        topicName = "test-sync-topic:demo";
        //发送同步消息
//        rocketMQTemplate.convertAndSend(topicName, message);
        rocketMQTemplate.syncSend(topicName,message);
    }

    public void sendAsyncMessage(String topicName, Object message) {
        topicName = "test-async-topic:demo";
        // 发送异步消息
        rocketMQTemplate.asyncSend(topicName, message, new SendCallback() {
            @Override
            public void onSuccess(SendResult var1) {
                logger.info("async onSuccess SendResult={} %n", var1);
            }

            @Override
            public void onException(Throwable var1) {
                logger.error("async onException Throwable");
            }
        });
    }

    public Boolean sendOrderMessage(String topicName, String message) {
        topicName = "orderly_topic:demo";
        // 有序发送消息
        SendResult sendResult = rocketMQTemplate.syncSendOrderly(topicName, MessageBuilder.withPayload(message).build(), "hashkey");
        SendStatus sendStatus = sendResult.getSendStatus();
        boolean equals = SendStatus.SEND_OK.equals(sendStatus);
        if (equals) {
            logger.info("mq message success msgId={}", sendResult.getMsgId());
            return true;
        }
        logger.info("mq message failed");
        return false;
    }

    public void sendSpringMessage(String topicName, String message) {
        topicName = "test-spring-topic:demo";
        //以单向方式发送消息
        rocketMQTemplate.send(topicName, MessageBuilder.withPayload(message).build());
    }


}
