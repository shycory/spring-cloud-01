package org.sunyh.learncloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author SunYuhong
 * @Date: 2021/4/9 14:51
 * @Description TODO
 */
@SpringBootApplication

@EnableDiscoveryClient //该注解 用于 想Consul或者Zookeeper中注册服务
public class PaymentZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperApplication.class,args);
    }
}
