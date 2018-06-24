package cn.willu.cloud.streamhello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.annotation.StreamMessageConverter;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Processor
 * Sink
 * Source
 */
@EnableBinding(value = {Processor.class})
public class ProceReceiver {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(Processor.INPUT)
    public void receive(User payload) {
        logger.info("Received: " + payload);
    }
    @StreamListener(Processor.OUTPUT)
    public void output(User payload) {
        logger.info("Received: " + payload);
    }

}
