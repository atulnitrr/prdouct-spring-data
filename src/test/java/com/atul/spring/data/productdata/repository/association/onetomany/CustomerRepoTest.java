package com.atul.spring.data.productdata.repository.association.onetomany;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import com.atul.spring.data.productdata.entity.association.onetomany.CustomerEntity;
import com.atul.spring.data.productdata.entity.association.onetomany.PhoneNumberEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepoTest {

    @Autowired
    private CustomerRepo customerRepo;

    @Test
    public void test_customer() {
        final CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName("test");
        final Set<PhoneNumberEntity> phoneNumberEntities = new HashSet<>();
        final PhoneNumberEntity phoneNumberEntity = new PhoneNumberEntity();
        phoneNumberEntity.setNumber("2233");
        phoneNumberEntity.setType("home");
        phoneNumberEntity.setCustomerEntity(customerEntity);

        final PhoneNumberEntity phoneNumberEntit2 = new PhoneNumberEntity();
        phoneNumberEntit2.setNumber("1122");
        phoneNumberEntit2.setType("office");
        phoneNumberEntit2.setCustomerEntity(customerEntity);

        phoneNumberEntities.add(phoneNumberEntity);
        phoneNumberEntities.add(phoneNumberEntit2);

        customerEntity.setNumbers(phoneNumberEntities);

        customerRepo.save(customerEntity);
    }


    @Test
    public void test_handleForeignKey() {
        final CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName("test3");
        final PhoneNumberEntity phoneNumberEntity = new PhoneNumberEntity();
        phoneNumberEntity.setNumber("789");
        phoneNumberEntity.setType("home");


        final PhoneNumberEntity phoneNumberEntit2 = new PhoneNumberEntity();
        phoneNumberEntit2.setNumber("456");
        phoneNumberEntit2.setType("office");

        customerEntity.addPhoneNumber(phoneNumberEntity);
        customerEntity.addPhoneNumber(phoneNumberEntit2);
        customerRepo.save(customerEntity);
    }


    // This is for lazy loading

    @Test
    @Transactional
    public void test_loadCustomer() {
       final CustomerEntity customerEntity = customerRepo.findById(26).get();
        System.out.println(customerEntity.getName());
        final Set<PhoneNumberEntity> phoneNumberEntities = customerEntity.getNumbers();
        phoneNumberEntities.forEach(phoneNumberEntity -> System.out.println(phoneNumberEntity.getNumber()));

    }


    @Test
    public void test_updateCustomer() {
        final CustomerEntity customerEntity = customerRepo.findById(33).get();
        customerEntity.setName("trovolta");
        final Set<PhoneNumberEntity> phoneNumberEntities = customerEntity.getNumbers();
        phoneNumberEntities.forEach(phoneNumberEntity -> phoneNumberEntity.setType("Cell"));
        customerRepo.save(customerEntity);

    }

    @Test
    public void test_delete() {
        customerRepo.deleteById(33);
    }
}