package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.CrudRepository;
import com.atul.spring.data.productdata.entity.BankdAccountEntity;



public interface BankAccountRepo extends CrudRepository<BankdAccountEntity, Integer> {

}
