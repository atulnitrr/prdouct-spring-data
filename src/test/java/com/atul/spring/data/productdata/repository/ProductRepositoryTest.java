package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import java.util.Optional;
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

    @Test
    public void test_read() {
        final Optional<ProductEntity> entity =  productRepository.findById(22l);
        final ProductEntity productEntity = entity.get();
        assertNotNull(productEntity);
        assertEquals("samsung", productEntity.getName());
        // assert all other value;
    }

    @Test
    public void test_update() {
        final Optional<ProductEntity> entity =  productRepository.findById(22l);
        final ProductEntity productEntity = entity.get();
        productEntity.setDesc("testing -->");
        productRepository.save(productEntity);
    }



    @Test
    public void test_delete() {
        if (productRepository.existsById(21l)) {
            System.out.println("Deleting a product");
            productRepository.deleteById(21l);
        }

    }
}