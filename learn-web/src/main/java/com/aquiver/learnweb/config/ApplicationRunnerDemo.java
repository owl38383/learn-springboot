package com.aquiver.learnweb.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Classname ApplicationRunnerDemo
 * @Description 描述
 * @Date 2021/3/3 15:25
 * @Author 刁闯
 */
@Component
public class ApplicationRunnerDemo implements ApplicationRunner {
    private final Logger logger =  LoggerFactory.getLogger(getClass());
    // 在容器运行之后
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Random random = new Random();
        logger.info("Application run after");
        logger.info("ApplicationRunner:"+ random.nextInt(100));
    }
}
