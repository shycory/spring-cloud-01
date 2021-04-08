package org.sunyh.learncloud.service;

import org.sunyh.learncloud.modle.TPayment;

public interface PaymentService {
    int insert(String serial);

    int insert(TPayment tPayment);

    TPayment selectByParam(TPayment tPayment);
}
