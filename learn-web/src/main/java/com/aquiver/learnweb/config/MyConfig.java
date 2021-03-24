package com.aquiver.learnweb.config;


import com.aquiver.learnbootrocket.produce.Producer;
import com.aquiver.learnweb.service.impl.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Classname MyConfig
 * @Description 描述
 * @Date 2021/3/4 16:57
 * @Author 刁闯
 */
@Configuration
public class MyConfig {


//    @Bean
//    public Filter myFilter() {
//        return new MyFilter();
//    }

    @Bean
    public Producer producer() {
        return new Producer();
    }

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 允许任何域名使用
        corsConfiguration.addAllowedHeader("*"); // 允许任何头
        corsConfiguration.addAllowedMethod("*"); // 允许任何方法（post、get等）
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 对接口配置跨域设置
        return new CorsFilter(source);
    }

    OrderServiceImpl orderService;

    @Bean
    public OrderServiceImpl orderService(){
        this.orderService = new OrderServiceImpl();
        return orderService;
    }
}
