package com.mapper;

import com.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    /**
     * 新增
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     */
    Payment getPaymentById(@Param("id") Long id);
}
