package com.aquiver.websocket.config;

import com.aquiver.websocket.websocket.MySocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @Classname SocketConfig
 * @Description 描述
 * @Date 2021/3/4 16:23
 * @Author 刁闯
 */
//@Configuration
public class SocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new MySocket(),"socket/{id}")
        .setAllowedOrigins("*");
    }

}
