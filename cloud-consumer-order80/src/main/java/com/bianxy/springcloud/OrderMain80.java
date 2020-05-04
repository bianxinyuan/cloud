package com.bianxy.springcloud;

import myrule.Rule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * ClassName:PaymentMain8001
 * Package:com.bianxy.springcloud
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  17:10
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-provider-service",configuration = Rule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
