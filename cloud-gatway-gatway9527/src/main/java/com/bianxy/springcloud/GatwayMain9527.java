package com.bianxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.ZonedDateTime;

/**
 * ClassName:GatwayMain9527
 * Package:com.bianxy.springcloud
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/4  0:57
 */
@SpringBootApplication
@EnableEurekaClient
public class GatwayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatwayMain9527.class,args);

    }
}
