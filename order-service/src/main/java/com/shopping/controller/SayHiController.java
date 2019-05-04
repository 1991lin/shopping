package com.shopping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping
 * @author: Eric
 * @create: 2019-05-04 10:37
 **/
@RestController
public class SayHiController {


    @RequestMapping(value = "/sayHi")
    public String sayHi(){
        return "Hi, Nice to meet you, haha";
    }

    @RequestMapping(value = "/sayYes")
    public String sayNo(){
        return "No";
    }

}
