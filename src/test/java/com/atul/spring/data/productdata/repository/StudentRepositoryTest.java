package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.StudentEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void test_CreateUser() {
        final StudentEntity studentEntity = new StudentEntity();
        studentEntity.setFirstName("bill");
        studentEntity.setLastName("gates");
        studentEntity.setScore(98);
        studentRepository.save(studentEntity);
    }
}