package com.bianxy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ConfigClintController
 * Package:com.bianxy.controller
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/5  16:42
 */
@RestController
public class ConfigClintController {
    @Value("${config.info}")
    private String configInfo;  //要访问的3344上的信息

    @RequestMapping("/info")
    public Object info(){

        return configInfo;
    }
}
