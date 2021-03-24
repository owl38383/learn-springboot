package com.aquiver.learnweb.filter;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * @Classname 实现tomcat的过滤器
 * @Description 描述
 * @Date 2021/3/4 16:46
 * @Author 刁闯
 */

public class MyFilter implements Filter {

    private final Logger logger =  LoggerFactory.getLogger(getClass());

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("init MyFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        logger.info("doFilter MyFilter");
        logger.info("url==={},sessionId===={}", URLDecoder.decode(String.valueOf(request.getRequestURI()),"utf-8"),request.getSession().getId());
        response.flushBuffer();
    }

    @Override
    public void destroy() {
        rocketMQTemplate.destroy();
        logger.info("destroy MyFilter");
    }
}
