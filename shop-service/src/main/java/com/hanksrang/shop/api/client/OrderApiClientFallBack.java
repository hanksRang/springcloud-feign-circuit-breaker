package com.hanksrang.shop.api.client;

import org.springframework.stereotype.Component;

@Component
public class OrderApiClientFallBack implements OrderApiClient{

    @Override
    public String hello(Integer a, Integer b) {
        System.out.println("hello fall back");
        return null;
    }

}
