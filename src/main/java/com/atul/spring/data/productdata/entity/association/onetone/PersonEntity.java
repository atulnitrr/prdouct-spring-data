package com.atul.spring.data.productdata.entity.association.onetone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * -- create table person (
 * -- id int primary key auto_increment,
 * -- first_name varchar(20),
 * -- last_name varchar(20),
 * -- age int
 * -- );
 *
 * -- create table license (
 * -- id int primary key auto_increment,
 * -- type varchar(20),
 * -- valid_from date,
 * -- valid_to date,
 * -- person_id int,
 * -- foreign key (person_id) references person(id)
 * -- );
 */

@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;

    private int age;

    @OneToOne(mappedBy = "personEntity")
    private LicenseEntity licenseEntity;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }
}
