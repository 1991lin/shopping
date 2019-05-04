package com.shopping.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping
 * @author: Eric
 * @create: 2019-05-04 07:58
 **/

@RestController
@ComponentScan
public class ShoppingController {
    @RequestMapping(value = "/shopping")
    public String shopping() {
        return "shopping";
    }

}
