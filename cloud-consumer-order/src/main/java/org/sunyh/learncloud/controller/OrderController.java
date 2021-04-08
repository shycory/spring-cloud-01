package org.sunyh.learncloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.sunyh.learncloud.common.CommonResult;
import org.sunyh.learncloud.modle.TPayment;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    /*服务发现*/
    @Resource
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult<TPayment> create(TPayment tPayment){
        log.info("provider参数:{}",tPayment);
        return restTemplate.postForObject("http://localhost:8081/payment/add", tPayment, CommonResult.class);
    }

    @GetMapping("/discovery")
    public void getDiscoveryInfo(){
        List<String> services = discoveryClient.getServices();
        log.info("discovery:{}",services);
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        log.info("instances:{}",instances);
    }



}
