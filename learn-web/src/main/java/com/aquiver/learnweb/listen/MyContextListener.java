package com.aquiver.learnweb.listen;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Classname tomcat 上下文监听器
 * @Description 描述
 * @Date 2021/3/3 14:58
 * @Author 刁闯
 */
@Component
public class MyContextListener implements ServletContextListener {
    private final Logger logger =  LoggerFactory.getLogger(getClass());

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    /*容器启动时运行一次*/
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized");
    }

    /*容器结束时运行一次*/
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 注意：一旦rocketMQTemplate被销毁，您将无法再使用该rocketMQTemplate发送任何消息
        rocketMQTemplate.destroy();
        logger.info("destroy rocketMQTemplate");
    }
}
