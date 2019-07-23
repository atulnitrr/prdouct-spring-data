package com.atul.spring.data.productdata.repository.association.onetomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.association.onetomany.CustomerEntity;


@Repository
public interface CustomerRepo extends CrudRepository<CustomerEntity, Integer> {


}
