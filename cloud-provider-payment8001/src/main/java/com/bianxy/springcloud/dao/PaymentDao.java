package com.bianxy.springcloud.dao;

import com.bianxy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:PaymentDao
 * Package:com.bianxy.springcloud.dao
 * Description:
 *
 * @author : bxy
 * @ date: 2020/4/29  17:58
 */
@Mapper
public interface PaymentDao {
     int creat(Payment payment);

     Payment getPayment(@Param("id") Long id);

}
