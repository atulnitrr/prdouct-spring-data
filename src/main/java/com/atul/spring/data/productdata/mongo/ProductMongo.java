package com.atul.spring.data.productdata.mongo;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class ProductMongo {

    @Id
    private String id;

    private String name;

    private float price;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    @Override public String toString() {
        return "ProductMongo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
