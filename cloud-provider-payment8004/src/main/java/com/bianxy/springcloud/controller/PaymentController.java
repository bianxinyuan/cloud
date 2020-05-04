package com.bianxy.springcloud.controller;

import com.bianxy.springcloud.entities.CommonResult;
import com.bianxy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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


    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper："+port+"\t"+ UUID.randomUUID().toString();
    }




}
