package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.ProductEntity;


@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

}
