package com.hanksrang.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/hello")
    public String hello() {
        if (true) {
            throw new RuntimeException("---运行时异常");
        }
        return "yes, it is.";
    }

}
