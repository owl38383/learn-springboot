package com.aquiver.learnweb.listen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @Classname  tomcat 请求监听器
 * @Description 描述
 * @Date 2021/3/3 14:58
 * @Author 刁闯
 */
//@Component
public class MyRequestListener implements ServletRequestListener {
    private final Logger logger =  LoggerFactory.getLogger(getClass());

    /*    优先于 拦截器 进入 */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info("请求处理");
    }

    /*最后请求销毁*/
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.info("请求销毁");
    }
}
