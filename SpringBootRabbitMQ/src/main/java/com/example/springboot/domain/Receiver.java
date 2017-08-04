package com.example.springboot.domain;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by wenxiangzhou on 2017/6/15.
 */
@Component
@RabbitListener(queues = "hello")//注解定义该类对hello队列的监听
public class Receiver {
    @RabbitHandler//注解来指定对消息的处理方法
    public void process(String hello) {
        System.out.println("Receiver:" + hello);
    }
}
