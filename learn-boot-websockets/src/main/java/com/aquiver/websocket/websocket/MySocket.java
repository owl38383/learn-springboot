package com.aquiver.websocket.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @Classname MySocket
 * @Description 描述
 * @Date 2021/3/4 16:20
 * @Author 刁闯
 */

public class MySocket extends TextWebSocketHandler {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        logger.info("message{}", payload);
        session.sendMessage(new TextMessage("result" + payload));
    }


}
