package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
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

    @Test
    public void test_GetALlSql() {
        studentRepository.findAllStudents().forEach(studentEntity ->
                System.out.println(studentEntity));

    }

    @Test
    public void test_GetALlPartial() {
        List<Object[]> list = studentRepository.findStudentspartial();
        for (Object[] objects : list) {
            System.out.println(objects[0]);
            System.out.println(objects[1]);
        }

    }

    @Test
    public void test_findByTest() {
        List<StudentEntity> list = studentRepository.findAllStudentByFirstName("bill");
        System.out.println(list);
    }

    @Test
    public void test_findAllStudentByScores() {
        System.out.println(studentRepository.findAllInGivenScore(55, 90));
    }

    @Test
    @Transactional
    // only do this in UTs
    @Rollback(false)
    //
    public void test_DeleteStudentByFirstName() {
        studentRepository.deletStudentsByFirstName("ak1");

    }
}