package com.aquiver.learnweb.controller;

import com.aquiver.learnbootrocket.produce.Producer;
import com.aquiver.learnweb.config.property.UserProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

/**
 * @Classname UserController
 * @Description 描述
 * @Date 2021/3/4 15:59
 * @Author 刁闯
 */

@RestController
public class UserController {

    @Autowired
    UserProperty user;

    @Autowired
    Producer producer;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, WebFlux !";
    }

    @GetMapping("/user")
    public Object getUser() throws InterruptedException {
        Thread.sleep(1000);
        return user;
    }


    @GetMapping("/send/{context}")
    public void sendMessage(@PathVariable("context") String context) {
        user.setNickname("order"+ UUID.randomUUID());
        user.setAge(new Random().nextInt(99));
        producer.sendOrderMessage(null ,context);
    }

    @GetMapping("/send1/{context}")
    public void sendAsyncMessage(@PathVariable("context") String context) {
        user.setNickname("async"+ UUID.randomUUID());
        user.setAge(new Random().nextInt(99));
        producer.sendAsyncMessage(null,context);
    }

    @GetMapping("/send2/{context}")
    public void sendSyncMessage(@PathVariable("context") String context) {
        user.setNickname("sync"+ UUID.randomUUID());
        user.setAge(new Random().nextInt(99));
        producer.sendMessage("weixin",context);
    }

    @GetMapping("/send4/{topic}/{context}")
    public void send4(@PathVariable("topic") String topic,@PathVariable("context") String context) {
        user.setNickname("sync"+ UUID.randomUUID());
        user.setAge(new Random().nextInt(99));
        producer.sendMessage(topic,context);
    }

    @GetMapping("/send3/{context}")
    public void sendSpringMessage(@PathVariable("context") String context) {
        producer.sendSpringMessage(null,context);
    }
}