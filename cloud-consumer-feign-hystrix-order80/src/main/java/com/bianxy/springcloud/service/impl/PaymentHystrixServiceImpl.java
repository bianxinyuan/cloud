package com.bianxy.springcloud.service.impl;

import com.bianxy.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * ClassName:PaymentHystrixServiceImpl
 * Package:com.bianxy.springcloud.service.impl
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/3  16:07
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String test1() {
        return "null";
    }

    @Override
    public String test2() {
        return "null";
    }
}
