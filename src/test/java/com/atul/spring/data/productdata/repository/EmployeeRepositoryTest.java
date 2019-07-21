package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.EmployeeEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void test() {

        final EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName("John");
        employeeRepository.save(employeeEntity);
    }
}