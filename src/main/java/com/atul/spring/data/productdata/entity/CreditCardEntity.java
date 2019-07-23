package com.atul.spring.data.productdata.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("cc")
public class CreditCardEntity extends PaymentEntity {

    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(final String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
