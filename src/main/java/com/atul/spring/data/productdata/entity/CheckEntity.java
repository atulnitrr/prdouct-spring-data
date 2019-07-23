package com.atul.spring.data.productdata.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ch")
public class CheckEntity extends PaymentEntity {

    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(final String checknumber) {
        this.checknumber = checknumber;
    }
}
