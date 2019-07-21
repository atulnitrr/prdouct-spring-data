package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import java.util.List;
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
        productEntity.setName("tv");
        productEntity.setDesc("from samsung");
        productEntity.setPrice(90.90);
        productRepository.save(productEntity);
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
        final Optional<ProductEntity> entity =  productRepository.findById(25l);
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

    @Test
    public void test_Count() {
        System.out.println("Count   ->>>>>>>>>>>>>>>>>>>>" + productRepository.count() );
    }

    @Test
    public void test_findByName() {
        List<ProductEntity> productEntities = productRepository.findByName("tv");
        productEntities.forEach(productEntity -> System.out.println(productEntity.getPrice()));
        assertNotNull(productEntities);
        assertEquals(1, productEntities.size());
    }
}