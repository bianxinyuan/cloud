package com.bianxy.springcloud.service.impl;

import com.bianxy.springcloud.dao.PaymentDao;
import com.bianxy.springcloud.entities.Payment;
import com.bianxy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:PaymentServiceimpl
 * Package:com.bianxy.springcloud.service.impl
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  19:17
 */
@Service
public class PaymentServiceimpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int creat(Payment payment) {
        int creat = paymentDao.creat(payment);
        return creat;
    }

    @Override
    public Payment getPayment(Long id) {
        Payment payment = paymentDao.getPayment(id);
        return payment;
    }
}
