package com.shopping.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: shopping
 * @author: Eric
 * @create: 2019-05-04 18:46
 **/


@ConfigurationProperties(prefix = "hello")
public class HelloProperties {


    private String message = "defaultMessage";


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
