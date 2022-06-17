package com.hanksrang.shop.api.client;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Primary
@FeignClient(value = "order-service", fallback = OrderApiClientFallBack.class)
public interface OrderApiClient {

    @RequestMapping(value="/order/hello", method = RequestMethod.GET)
    String hello(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
