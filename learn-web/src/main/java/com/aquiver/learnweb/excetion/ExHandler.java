package com.aquiver.learnweb.excetion;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @PACKAGE_NAME: com.one.demo.config
 * @NAME: ExHandler
 * @USER: 25738
 * @DATE: 2021/3/3
 **/
@RestControllerAdvice
public class ExHandler {

    // 处理全局异常
    @ExceptionHandler(value = Exception.class)
    Object proHandel(Exception e, HttpServletRequest request){
        HashMap<String, Object> result = new HashMap<>();
        result.put("code",100);
        result.put("msg",e.getMessage());
        result.put("url",request.getRequestURI());
        return result;
    }

    // 处理全局异常
    @ExceptionHandler(value = MyException.class)
    Object proMyHandel(MyException e, HttpServletRequest request){
        HashMap<String, Object> result = new HashMap<>();
        result.put("code",e.getCode());
        result.put("msg",e.getMsg());
        result.put("url",request.getRequestURI());
        return result;
    }
}
