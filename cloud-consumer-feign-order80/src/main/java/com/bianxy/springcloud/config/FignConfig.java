package com.bianxy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:FignConfig
 * Package:com.bianxy.springcloud.config
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/3  13:13
 */
@Configuration
public class FignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
