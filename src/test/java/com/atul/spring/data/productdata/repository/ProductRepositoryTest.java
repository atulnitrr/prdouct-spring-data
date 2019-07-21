package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.ProductEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void test_crateProduct() {
        final ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1l);
        productEntity.setName("samsung");
        productEntity.setDesc("good");
        productEntity.setPrice(9.990);
        productRepository.save(productEntity);
        System.out.println("test-->");
    }
}