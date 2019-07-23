package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.CreditCardEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentRepositoryTest {


    @Autowired
    private PaymentRepository paymentRepository;

    @Test
    public void test_creditcardPaymet() {

        final CreditCardEntity creditCardEntity = new CreditCardEntity();
        creditCardEntity.setId(123);
        creditCardEntity.setAmount(89);
        creditCardEntity.setCardnumber("12345342");
        paymentRepository.save(creditCardEntity);

    }
}