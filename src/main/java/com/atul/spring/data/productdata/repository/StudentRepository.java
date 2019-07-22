package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.StudentEntity;


@Repository
public interface StudentRepository extends PagingAndSortingRepository<StudentEntity, Long> {


}
