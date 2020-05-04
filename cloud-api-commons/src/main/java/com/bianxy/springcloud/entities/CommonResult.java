package com.bianxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:CommonResult
 * Package:com.bianxy.springcloud.entities
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data =null;
    }
}
