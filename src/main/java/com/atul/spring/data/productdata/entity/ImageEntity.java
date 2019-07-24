package com.atul.spring.data.productdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "images")
public class ImageEntity  {

    @Id
    private Long id;

    private String name;

    @Lob
    private byte[] data;

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

    public byte[] getData() {
        return data;
    }

    public void setData(final byte[] data) {
        this.data = data;
    }
}
