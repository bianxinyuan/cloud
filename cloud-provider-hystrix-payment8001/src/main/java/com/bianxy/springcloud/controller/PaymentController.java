package com.bianxy.springcloud.controller;

import com.bianxy.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class PaymentController {


    @Value("${server.port}")
    private String port;

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @RequestMapping(value = "/payment/test1")
    public String test1()  {
        return paymentHystrixService.test1(port);
    }

    @RequestMapping(value = "/payment/test2")
    public String test2()  {
        return paymentHystrixService.test2(port);
    }

    @RequestMapping(value = "/payment/breaktest/{number}")
    public String breaktest(@PathVariable("number")int number){
        return paymentHystrixService.breaktest(number);
    }
}
