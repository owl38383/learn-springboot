package com.aquiver.learnweb.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Classname MyTask
 * @Description 描述
 * @Date 2021/3/8 14:11
 * @Author 刁闯
 */
@Component
public class MyTask {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0 0 */5 * * *")
    public void notDate() {
        logger.info("nowDate={}", new Date());
        logger.info("nowDate={}", new Date());
    }
}
