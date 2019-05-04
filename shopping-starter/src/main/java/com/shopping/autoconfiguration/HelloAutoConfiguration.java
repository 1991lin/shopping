package com.shopping.autoconfiguration;

import com.shopping.configs.HelloProperties;
import com.shopping.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shopping
 * @author: Eric
 * @create: 2019-05-04 20:31
 **/


@Configuration
@ConditionalOnClass(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
public class HelloAutoConfiguration {


    @Autowired
    private HelloProperties helloProperties;


    @Bean
    public HelloService getHelloService() {

        HelloService service = new HelloService();
        service.setMessage(helloProperties.getMessage());
        return service;
    }
}
