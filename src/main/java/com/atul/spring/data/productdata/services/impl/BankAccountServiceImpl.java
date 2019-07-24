package com.atul.spring.data.productdata.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.atul.spring.data.productdata.entity.BankdAccountEntity;
import com.atul.spring.data.productdata.repository.BankAccountRepo;
import com.atul.spring.data.productdata.services.BankAccountService;


@Service
public class BankAccountServiceImpl implements BankAccountService {

    private BankAccountRepo bankAccountRepo;

    @Autowired
    public BankAccountServiceImpl(final BankAccountRepo bankAccountRepo) {
        this.bankAccountRepo = bankAccountRepo;
    }

    @Override
    @Transactional
    public void transfer(final int amount) {
        BankdAccountEntity obama = bankAccountRepo.findById(1).get();
        obama.setBal(obama.getBal() - amount);
        bankAccountRepo.save(obama);

        if (true) {
            throw new RuntimeException("Testttin");
        }

        BankdAccountEntity trump = bankAccountRepo.findById(2).get();
        trump.setBal(trump.getBal() + amount);
        bankAccountRepo.save(trump);
    }



}
