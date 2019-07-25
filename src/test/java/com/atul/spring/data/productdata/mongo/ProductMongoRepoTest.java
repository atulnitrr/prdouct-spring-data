package com.atul.spring.data.productdata.mongo;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMongoRepoTest {


    @Autowired
    private ProductMongoRepo productMongoRepo;

    @Test
    public void test_Create() {

        final ProductMongo productMongo = new ProductMongo();
        productMongo.setName("Apple");
        productMongo.setPrice(1000.90f);

        final ProductMongo savedProduct =  productMongoRepo.save(productMongo);

        assertNotNull(savedProduct);
        System.out.println(savedProduct.getId());
        System.out.println(savedProduct.getName());
        System.out.println(savedProduct.getPrice());
    }

}