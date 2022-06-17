package com.hanksrang.shop.api.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApiClientTest {

    @Autowired
    private OrderApiClient orderApiClient;

    @Test
    public void test() {
        String res = orderApiClient.hello(null, null);
        System.out.println("res: " + res);
    }

}
