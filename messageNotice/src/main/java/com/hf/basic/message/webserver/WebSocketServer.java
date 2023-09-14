package com.hf.basic.message.webserver;

import com.hf.basic.message.config.WebSocketConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@Component
@Slf4j
@ServerEndpoint(value = "/webSocket",configurator = WebSocketConfig.class)
public class WebSocketServer {
    private Session session;
    /**
     * 连接建立成功后会调用的方法
     */
    @OnOpen
    public void onOpen(Session session) throws IOException {
        log.info("ws连接成功!");
        this.session=session;
        sendMessage("websocket连接成功！");
    }
    /**
     * 收到客户端消息后调用的方法
     */
    @OnMessage
    public void onMessage(String message){
        log.info("收到来自客户端的消息");
    }
    /**
     * 发生错误回调
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error(session.getBasicRemote() + "客户端发生错误");
        error.printStackTrace();
    }
    /**
     * 实现服务器主动推送消息到 指定客户端
     */
    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }
}
