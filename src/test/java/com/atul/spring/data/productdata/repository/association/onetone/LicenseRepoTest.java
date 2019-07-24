package com.atul.spring.data.productdata.repository.association.onetone;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.association.onetone.LicenseEntity;
import com.atul.spring.data.productdata.entity.association.onetone.PersonEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LicenseRepoTest {

    @Autowired
    private LicenseRepo licenseRepo;

    @Test
    public void test_createLicense() {

        final LicenseEntity licenseEntity = new LicenseEntity();
        licenseEntity.setType("car");
        licenseEntity.setValidFrom(new Date());
        licenseEntity.setValidTo(new Date( ));

        final PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName("atukl");
        personEntity.setLastName("macknero");
        personEntity.setAge(35);

        licenseEntity.setPersonEntity(personEntity);

        licenseRepo.save(licenseEntity);
    }
}