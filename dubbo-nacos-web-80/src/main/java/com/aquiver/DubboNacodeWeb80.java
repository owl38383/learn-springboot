package com.aquiver;

import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname DubboNacodeWeb80
 * @Description 描述
 * @Date 2021/4/6 14:04
 * @Author 刁闯
 */

@SpringBootApplication
@EnableNacosConfig
@EnableNacosDiscovery
public class DubboNacodeWeb80 {
		public static void main(String[] args) {
				SpringApplication.run(DubboNacodeWeb80.class,args);
		}
}
