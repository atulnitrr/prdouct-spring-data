package com.atul.spring.data.productdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 *
 * create table product(
 * id int PRIMARY KEY,
 * name varchar(20),
 * description varchar(100),
 * price decimal(8,3)
 * );
 *
 * select * from product;
 */

@Entity
@Table(name = "product")
public class ProductEntity {

    @GenericGenerator(name = "product_id", strategy = "com.atul.spring.data.productdata.entity.CustomRandomIdGenerator")
    @GeneratedValue(generator = "product_id")
    @Id
    private Long id;

    private String name;
    @Column(name = "description")
    private String desc;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(final String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }


}
