package org.sunyh.learncloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunyh.learncloud.mapper.TPaymentMapper;
import org.sunyh.learncloud.modle.TPayment;
import org.sunyh.learncloud.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private TPaymentMapper tPaymentMapper;

    @Override
    public int insert(String serial) {
        TPayment tPayment = new TPayment();
        tPayment.setSerial(serial);
        return insert(tPayment);
    }

    @Override
    public int insert(TPayment tPayment) {
        return tPaymentMapper.insert(tPayment);
    }

    @Override
    public TPayment selectByParam(TPayment tPayment) {
        return tPaymentMapper.selectByPrimaryKey(tPayment.getId());
    }
}
