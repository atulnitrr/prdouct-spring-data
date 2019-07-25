package com.atul.spring.data.productdata.mongo;

import static org.junit.Assert.*;
import java.util.List;
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
        productMongo.setName("mac");
        productMongo.setPrice(123f);

        final ProductMongo savedProduct =  productMongoRepo.save(productMongo);

        assertNotNull(savedProduct);
        System.out.println(savedProduct.getId());
        System.out.println(savedProduct.getName());
        System.out.println(savedProduct.getPrice());
    }

    @Test
    public void test_findALl() {

        List<ProductMongo> productMongos = productMongoRepo.findAll();

        System.out.println(productMongos);

    }

    @Test
    public void test_delete() {

        productMongoRepo.deleteById("5d39c2977859c65a40256db1");

        System.out.println(productMongoRepo.findAll());

    }
}