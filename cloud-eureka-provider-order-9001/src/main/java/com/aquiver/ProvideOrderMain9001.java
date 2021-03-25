package com.aquiver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname ProvideOrderMain9001
 * @Description 描述
 * @Date 2021/3/25 14:53
 * @Author 刁闯
 */

@SpringBootApplication
//@EnableEurekaClient
@MapperScan("com.aquiver.mapper")

public class ProvideOrderMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(ProvideOrderMain9001.class,args);
    }
}
