package com.atul.spring.data.productdata.repository.association.onetomany;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.association.onetomany.CustomerEntity;
import com.atul.spring.data.productdata.entity.association.onetomany.PhoneNumberEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepoTest {

    @Autowired
    private CustomerRepo customerRepo;

    @Test
    public void test_customer() {
        final Set<PhoneNumberEntity> phoneNumberEntities = new HashSet<>();
        final PhoneNumberEntity phoneNumberEntity = new PhoneNumberEntity();
        phoneNumberEntity.setNumber("2233");
        phoneNumberEntity.setType("home");

        final PhoneNumberEntity phoneNumberEntit2 = new PhoneNumberEntity();
        phoneNumberEntit2.setNumber("1122");
        phoneNumberEntit2.setType("office");

        phoneNumberEntities.add(phoneNumberEntity);
        phoneNumberEntities.add(phoneNumberEntit2);

        final CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName("test");

        customerEntity.setNumbers(phoneNumberEntities);

        customerRepo.save(customerEntity);
    }
}