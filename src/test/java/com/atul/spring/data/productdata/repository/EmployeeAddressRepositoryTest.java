package com.atul.spring.data.productdata.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.rel.AddressEntity;
import com.atul.spring.data.productdata.entity.rel.EmployeeAddressEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeAddressRepositoryTest {

    @Autowired
    private EmployeeAddressRepository addressRepository;

    @Test
    public void test_create() {
        final AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity("Benga");
        addressEntity.setCountry("India");
        addressEntity.setState("Kar");
        addressEntity.setStreetadress("sarjapur");
        addressEntity.setZipcode("5677");

        final EmployeeAddressEntity entity = new EmployeeAddressEntity();
        entity.setAddressEntity(addressEntity);
        entity.setId(12);
        entity.setName("1234");
        addressRepository.save(entity);
    }

}