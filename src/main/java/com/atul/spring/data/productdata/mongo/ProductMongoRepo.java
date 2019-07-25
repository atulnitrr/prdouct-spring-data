package com.atul.spring.data.productdata.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductMongoRepo extends MongoRepository<ProductMongo, String> {


}
