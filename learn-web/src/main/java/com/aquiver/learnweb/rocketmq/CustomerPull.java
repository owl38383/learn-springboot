package com.aquiver.learnweb.rocketmq;//package com.demo.face.rocketmq;
//
//import com.demo.face.entity.User;
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.apache.rocketmq.spring.core.RocketMQTemplate;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @Classname Customer
// * @Description mq 消费者 Push模式
// * @Date 2021/3/5 15:21
// * @Author 刁闯
// */
//@Component
//public class CustomerPull implements CommandLineRunner {
//
//    private final Logger logger =  LoggerFactory.getLogger(getClass());
//
//    @Resource
//    private RocketMQTemplate rocketMQTemplate;
//
//    @Resource
//    private RocketMQTemplate extRocketMQTemplate;
//
//    @Override
//    public void run(String... args) throws Exception {
//        //这是使用rocketMQTemplate的拉取消费者的示例。
//        List<String> messages = rocketMQTemplate.receive(String.class);
//        System.out.printf("receive from rocketMQTemplate, messages=%s %n", messages);
//
//        //这是使用extRocketMQTemplate的拉取使用者的示例。
//        messages = extRocketMQTemplate.receive(String.class);
//        System.out.printf("receive from extRocketMQTemplate, messages=%s %n", messages);
//    }
//}
