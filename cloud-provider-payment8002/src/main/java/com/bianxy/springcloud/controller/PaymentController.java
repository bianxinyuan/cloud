package com.bianxy.springcloud.controller;

import com.bianxy.springcloud.entities.CommonResult;
import com.bianxy.springcloud.entities.Payment;
import com.bianxy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        log.info(payment.getSerial());
        int creat = paymentService.creat(payment);

        if (creat > 0) {
            return new CommonResult<>(200, "success===="+port, creat);
        } else {
            return new CommonResult<>(404, "file===="+port);
        }

    }

    @RequestMapping(value = "/payment/getpayment/{id}")
    public CommonResult getPayment(@PathVariable(name = "id")Long id) {
        Payment payment = paymentService.getPayment(id);

        if (payment != null) {
            return new CommonResult<>(200, "success==8002=="+port, payment);
        } else {
            return new CommonResult<>(404, "filed===="+port);
        }

    }
    @RequestMapping(value = "/payment/timeout")
    public String timeout() throws InterruptedException {
        Thread.sleep(3000);
        return "8002";

    }

}
