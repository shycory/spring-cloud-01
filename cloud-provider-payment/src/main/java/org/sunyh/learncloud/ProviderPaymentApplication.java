package org.sunyh.learncloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@EnableEurekaClient
@MapperScan("org.sunyh.learncloud.mapper")
@SpringBootApplication
public class ProviderPaymentApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(ProviderPaymentApplication.class);
    }
}
