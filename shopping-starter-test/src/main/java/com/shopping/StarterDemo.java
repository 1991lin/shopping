package com.shopping;

import com.shopping.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping
 * @author: Eric
 * @create: 2019-05-04 20:42
 **/


@SpringBootApplication
@RestController
public class StarterDemo {


    @Autowired
    private HelloService helloService;

    public static void main(String[] arg) {

        SpringApplication.run(StarterDemo.class);

    }


    @RequestMapping(value = "/message")
    public String getMessage(){
        return helloService.getMessage();
    }
}
