package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.EmployeeEntity;


@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {

}
