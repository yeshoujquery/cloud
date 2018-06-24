package cn.willu.cloud.streamhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class StreamHelloApplicationTests {
    @Autowired
    private Processor processor;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("wudi");
        user.setAge("25");
        System.out.println(processor.output().send(MessageBuilder.withPayload(user).build()));
    }

}
