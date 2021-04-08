package org.sunyh.learncloud.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @PostMapping("/hello/{world}")
    public HelloBean hello(@PathVariable("world") String world){
        HelloBean helloBean=new HelloBean();
        helloBean.setMsg("hello "+world);
        return helloBean;
    }

    @Data
    class HelloBean{
        String msg;
    }
}
