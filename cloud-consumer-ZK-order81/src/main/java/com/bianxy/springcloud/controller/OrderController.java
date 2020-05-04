package com.bianxy.springcloud.controller;


import com.bianxy.springcloud.entities.CommonResult;
import com.bianxy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    private String URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;



    @GetMapping("/consumer/payment")
    public String getpayment (){



        return restTemplate.getForObject(URL+"/payment/zk",String.class);

    }

}
