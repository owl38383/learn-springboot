package com.aquiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname EurakeCustomMain9001
 * @Description 描述
 * @Date 2021/3/25 14:07
 * @Author 刁闯
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaCustomMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomMain9001.class,args);
    }
}
