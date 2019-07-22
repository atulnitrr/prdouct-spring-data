package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
        productEntity.setName("radio ");
        productEntity.setDesc("from lg");
        productEntity.setPrice(9.90);
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


    @Test
    public void test_findByNameAndDesc() {
        List<ProductEntity> productEntities = productRepository.findByNameAndDesc("iphone", "notgood");
        productEntities.forEach(productEntity -> System.out.println(productEntity.getPrice()));
        assertNotNull(productEntities);
        assertEquals(1, productEntities.size());
    }


    @Test
    public void test_findByPrice() {
        List<ProductEntity> productEntities = productRepository.findByPriceGreaterThan(10d);
        productEntities.forEach(productEntity -> System.out.println(productEntity.getPrice()));
        assertNotNull(productEntities);
        //assertEquals(1, productEntities.size());
    }


    @Test
    public void test_findByDescContains() {
        List<ProductEntity> productEntities = productRepository.findByDescContains("good"
                + ""
                + "gs");
        productEntities.forEach(productEntity -> System.out.println(productEntity.getPrice()));
        assertNotNull(productEntities);
        //assertEquals(1, productEntities.size());
    }


    @Test
    public void test_findByPriceBetween() {
        List<ProductEntity> productEntities = productRepository.findByPriceBetween(9d, 100d);
        productEntities.forEach(productEntity -> System.out.println(productEntity.getPrice()));
        assertNotNull(productEntities);
        //assertEquals(1, productEntities.size());
    }


    @Test
    public void test_findByDescLIKE() {
        List<ProductEntity> productEntities = productRepository.findByDescLike("%notgood%");
        productEntities.forEach(productEntity -> System.out.println(productEntity.getName()));
        assertNotNull(productEntities);
        //assertEquals(1, productEntities.size());
    }

    @Test
    public void test_findByIDIN() {
        List<ProductEntity> productEntities = productRepository.findByIdIn(Arrays.asList(142485l, 150218l));
        productEntities.forEach(productEntity -> System.out.println(productEntity.getName()));
        assertNotNull(productEntities);
        //assertEquals(1, productEntities.size());
    }

    @Test
    public void test_FindALlPaging() {
        final PageRequest pageRequest =  PageRequest.of(2, 2);
        Page<ProductEntity> products =  productRepository.findAll(pageRequest);
        products.forEach(productEntity -> System.out.println(productEntity.getName()));


    }


    @Test
    public void test_FindALlSorting() {
        productRepository.findAll(new Sort(Sort.Direction.DESC, "desc")).forEach(productEntity -> System.out.println(productEntity.getName()));
    }


    @Test
    public void test_FindALlSortByMultiple() {
        productRepository.findAll(new Sort(Sort.Direction.DESC, "desc")).forEach(productEntity -> System.out.println(productEntity.getName()));
    }


    @Test
    public void test_FindALlSortByMultipleOrder() {
        productRepository.findAll(new Sort(new Sort.Order(Sort.Direction.DESC, "name"), new Sort.Order("price"))).forEach(productEntity -> System.out.println(productEntity.getName()));
    }

    @Test
    public void test_FindALlPaginngAndSOrting() {
        final Pageable pageable = PageRequest.of(0, 2, Sort.Direction.DESC, "name");
        productRepository.findAll(pageable).forEach(productEntity -> {
            System.out.println(productEntity.getName() + "  " + productEntity.getDesc());
        });
    }
}