package com.atul.spring.data.productdata.entity;

import javax.persistence.Embeddable;


@Embeddable
public class Insurence {

    private String providerName;

    private double copay;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(final String providerName) {
        this.providerName = providerName;
    }

    public double getCopay() {
        return copay;
    }

    public void setCopay(final double copay) {
        this.copay = copay;
    }

    @Override public String toString() {
        return "Insurence{" +
                "providerName='" + providerName + '\'' +
                ", copay=" + copay +
                '}';
    }
}
