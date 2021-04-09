package org.sunyh.learncloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author SunYuhong
 * @Date: 2021/4/9 14:55
 * @Description TODO
 */

@RestController
@Slf4j
public class PaymentController {

    @Value("{server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String  paymentZk(){
        return "spring cloud with zookeeper : " + serverPort + UUID.randomUUID().toString();
    }
}
