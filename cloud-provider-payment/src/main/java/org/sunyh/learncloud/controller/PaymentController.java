package org.sunyh.learncloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sunyh.learncloud.common.CommonResult;
import org.sunyh.learncloud.modle.TPayment;
import org.sunyh.learncloud.service.PaymentService;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public CommonResult<TPayment> add(@RequestBody TPayment tPayment){

        log.info("provider参数:{}",tPayment);
        int insert = paymentService.insert(tPayment);
        if(insert==1){
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
}
