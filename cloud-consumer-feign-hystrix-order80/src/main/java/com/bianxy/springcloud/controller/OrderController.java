package com.bianxy.springcloud.controller;


import com.bianxy.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
@DefaultProperties(defaultFallback = "defaultFallback")
public class OrderController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @HystrixCommand
    @GetMapping("/consumer/payment/test1")
    public String test1() {
        return paymentHystrixService.test1();
    }


    @HystrixCommand
    @GetMapping("/consumer/payment/test2")
    public String test2() {
        return paymentHystrixService.test2();
    }



    public String defaultFallback() {
        return "defaultFallback";
    }
}
