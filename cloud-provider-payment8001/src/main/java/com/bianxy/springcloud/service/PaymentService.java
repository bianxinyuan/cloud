package com.bianxy.springcloud.service;

import com.bianxy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:PaymentService
 * Package:com.bianxy.springcloud.service
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  19:14
 */
public interface PaymentService {
     int creat(Payment payment);

     Payment getPayment(@Param("id") Long id);
}
