package com.atul.spring.data.productdata.entity.rel;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee_address")
public class EmployeeAddressEntity {

    @Id
    private int id;
    private String name;

    @Embedded
    private AddressEntity addressEntity;

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(final AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
