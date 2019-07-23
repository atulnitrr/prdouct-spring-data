package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.CrudRepository;
import com.atul.spring.data.productdata.entity.PaymentEntity;


public interface PaymentRepository extends CrudRepository<PaymentEntity, Integer> {

}
