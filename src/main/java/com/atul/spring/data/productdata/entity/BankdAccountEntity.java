package com.atul.spring.data.productdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bankaccount")
public class BankdAccountEntity {

    @Id
    private int accno;
    private String lastname;
    private String firstname;
    private int bal;

    public int getAccno() {
        return accno;
    }

    public void setAccno(final int accno) {
        this.accno = accno;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(final int bal) {
        this.bal = bal;
    }

    @Override public String toString() {
        return "BankdAccountEntity{" +
                "accno=" + accno +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", bal=" + bal +
                '}';
    }
}
