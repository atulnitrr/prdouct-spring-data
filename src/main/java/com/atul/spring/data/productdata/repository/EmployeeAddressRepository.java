package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.rel.EmployeeAddressEntity;


@Repository
public interface EmployeeAddressRepository extends CrudRepository<EmployeeAddressEntity, Integer> {

}
