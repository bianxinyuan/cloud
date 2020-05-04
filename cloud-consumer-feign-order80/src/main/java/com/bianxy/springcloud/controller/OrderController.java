package com.bianxy.springcloud.controller;


import com.bianxy.springcloud.entities.CommonResult;
import com.bianxy.springcloud.entities.Payment;
import com.bianxy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName:PaymentController
 * Package:com.bianxy.springcloud.controller
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  19:22
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    private PaymentService paymentService;


    @GetMapping("/consumer/payment/getpayment/{id}")
    public CommonResult<Payment> getpayment(@PathVariable("id") Long id) {

        return paymentService.getPayment(id);

    }

    @RequestMapping(value = "/consumer/payment/timeout")
    public String timeout() throws InterruptedException{
       return paymentService.timeout();
    }
}
