package com.atul.spring.data.productdata.entity.rel;

import javax.persistence.Embeddable;


@Embeddable
public class AddressEntity {


    private String streetadress;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public String getStreetadress() {
        return streetadress;
    }

    public void setStreetadress(final String streetadress) {
        this.streetadress = streetadress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }
}
