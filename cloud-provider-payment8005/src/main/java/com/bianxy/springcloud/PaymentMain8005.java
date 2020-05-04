package com.bianxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:PaymentMain8001
 * Package:com.bianxy.springcloud
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  17:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8005.class, args);
    }
}
