package com.atul.spring.data.productdata.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("cc")
public class CreditCardEntity extends PaymentEntity {

    private String creditCard;

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(final String creditCard) {
        this.creditCard = creditCard;
    }
}
