package com.example.demorabbitmqsender;

import com.example.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoRabbitmqSenderApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void contextLoads() {
    }

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        try {
            helloSender.send();
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }
}
