package com.atul.spring.data.productdata.repository;

import org.springframework.data.repository.CrudRepository;
import com.atul.spring.data.productdata.entity.ImageEntity;


public interface ImageRepo extends CrudRepository<ImageEntity, Long> {


}
