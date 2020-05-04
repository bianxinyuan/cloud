package com.bianxy.springcloud.service;

import com.bianxy.springcloud.service.impl.PaymentHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:PaymentHystrixService
 * Package:com.bianxy.springcloud.service
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/3  14:47
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE",fallback = PaymentHystrixServiceImpl.class)
public interface PaymentHystrixService {

    @RequestMapping(value = "/payment/test1")
    String test1();

    @RequestMapping(value = "/payment/test2")
    String test2();
}
