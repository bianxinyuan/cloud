package com.bianxy.springcloud.service;

import com.bianxy.springcloud.entities.CommonResult;
import com.bianxy.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:PaymentService
 * Package:com.bianxy.springcloud.service
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/3  12:14
 */
@Component
@FeignClient(value = "cloud-provider-service")
public interface PaymentService {

    @RequestMapping(value = "/payment/getpayment/{id}")
    CommonResult<Payment> getPayment(@PathVariable(name = "id") Long id);


    @RequestMapping(value = "/payment/timeout")
    String timeout() throws InterruptedException;
}
