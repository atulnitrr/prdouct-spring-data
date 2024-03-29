package com.atul.spring.data.productdata.services.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BankAccountServiceImplTest {

    @Autowired
    private BankAccountServiceImpl bankAccountService;

    @Test
    public void test_transfer() {
        bankAccountService.transfer(500);
    }
}