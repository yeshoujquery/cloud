package cn.willu.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;
    @Value("${to}")
    private String to;

    @GetMapping("/from")
    public String getFrom(){
        return this.from;
    }

    @GetMapping("/to")
    public String getTo(){
        return this.to;
    }

}
