package com.atul.spring.data.productdata.entity.association.onetomany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
    private Set<PhoneNumberEntity> numbers;


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

    public Set<PhoneNumberEntity> getNumbers() {
        return numbers;
    }

    public void setNumbers(
            final Set<PhoneNumberEntity> numbers) {
        this.numbers = numbers;
    }



    public void addPhoneNumber(PhoneNumberEntity phoneNumberEntity) {
        if (phoneNumberEntity != null) {
            if (numbers == null) {
                numbers = new HashSet<>();
            }
            phoneNumberEntity.setCustomerEntity(this);
            numbers.add(phoneNumberEntity);
        }
    }

}
