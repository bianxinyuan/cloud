package com.bianxy.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * ClassName:PaymentHystrixService
 * Package:com.bianxy.springcloud.service
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/3  14:06
 */
@Service
@DefaultProperties(defaultFallback = "defaultFallback")
public class PaymentHystrixService {
    @HystrixCommand(fallbackMethod = "test1Handler",commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",
                    value="1500")})
    public String test1(String port){
        return "线程池:" + Thread.currentThread().getName() + " paymentInfo_OK,port:" + port + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "test2Handler",commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",
                    value="1500")})
    public String test2(String port) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时线程池:" + Thread.currentThread().getName() + " paymentInfo_OK,port:" + port + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "breaktest_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),   //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),  //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),    //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),    //失败率达到多少后跳闸
    })
    public String breaktest(int number){
        if (number<0){
            throw new RuntimeException("小于0");
        }
        return "调用成功--"+number;
    }

    public String breaktest_fallback(int number){
        return "调用失败服务降级--";
    }

    public String test1Handler(String port){
        return "线程池:" + Thread.currentThread().getName() + " test1挂了";
    }

    public String test2Handler(String port) {
        return "线程池:" +port+ Thread.currentThread().getName() + " test2挂了";
    }


    public String defaultFallback() {
        return "defaultFallback";
    }

}
