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
    private String URL = "http://cloud-provider-service";
    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create (@RequestBody Payment payment){
   /*     log.info(payment.getSerial());

        String serial = payment.getSerial();
        Map<String, Object> map = new ConcurrentHashMap<>();

        map.put("serial",serial);
*/
        return restTemplate.getForObject(URL+"/payment/create",CommonResult.class,payment);

    }

    @GetMapping("/consumer/payment/getpayment/{id}")
    public CommonResult<Payment> getpayment (@PathVariable("id") Long id){
        log.info(id.toString());


        return restTemplate.getForObject(URL+"/payment/getpayment/"+id,CommonResult.class);

    }

}
