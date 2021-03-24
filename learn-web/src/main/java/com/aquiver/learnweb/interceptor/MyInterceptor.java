package com.aquiver.learnweb.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname
 * @Description 实现springmvc 拦截器
 * @Date 2021/3/4 16:47
 * @Author 刁闯
 */

public class MyInterceptor implements HandlerInterceptor {

    private final Logger logger =  LoggerFactory.getLogger(getClass());
    private Long date;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("请求开始 url={}",request.getRequestURL());
        date = System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        logger.info("请求处理中 url={}",request.getRequestURL());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        logger.info("请求销毁 总耗时{}mill url={}",System.currentTimeMillis() - date,request.getRequestURL());
    }
}
