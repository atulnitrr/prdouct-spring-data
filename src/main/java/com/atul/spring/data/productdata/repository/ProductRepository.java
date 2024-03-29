package com.atul.spring.data.productdata.repository;

import java.awt.print.Pageable;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.ProductEntity;


@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Long> {

    List<ProductEntity> findByName(final String name);

    List<ProductEntity> findByNameAndDesc(final String name, final String desc);

    List<ProductEntity> findByPriceGreaterThan(final double price);

    List<ProductEntity> findByDescContains(final String desc);

    List<ProductEntity> findByPriceBetween(final double price1,final double price2);

    List<ProductEntity> findByDescLike(final String desc);

    List<ProductEntity> findByIdIn(List<Long> ids);

//    List<ProductEntity> findByIdInPage(List<Long> ids, final Pageable pageable);

}
