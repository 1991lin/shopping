package com.shopping.booter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: shopping
 * @author: Eric
 * @create: 2019-05-04 07:55
 **/


@SpringBootApplication(scanBasePackages = "com.shopping.*")
public class ShoppingStarter {

    public static void main(String[] arg) {

        SpringApplication.run(ShoppingStarter.class, arg);

    }
}
