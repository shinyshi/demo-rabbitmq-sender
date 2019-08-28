package com.example;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send() throws InterruptedException {
        int i=0;
        while (true) {
            template.convertAndSend("test-queue", "hello,rabbit~"+i);
            i++;
            Thread.sleep(1000L);
        }
    }
}
