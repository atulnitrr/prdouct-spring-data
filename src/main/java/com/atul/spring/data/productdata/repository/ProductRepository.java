package com.atul.spring.data.productdata.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.ProductEntity;


@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

    List<ProductEntity> findByName(final String name);

    List<ProductEntity> findByNameAndDesc(final String name, final String desc);

    List<ProductEntity> findByPriceGreaterThan(final double price);



}
