package com.atul.spring.data.productdata.repository.association.manytomany;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import com.atul.spring.data.productdata.entity.association.manytomany.ProgrammerEntity;
import com.atul.spring.data.productdata.entity.association.manytomany.ProjectEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class programmerrepoTest {

    @Autowired
    private Programmerrepo programmerrepo;

    @Test
    public void test_Creation() {

        final Set<ProjectEntity> projectEntitySet = new HashSet<>();

        final ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setName("test project");
        projectEntitySet.add(projectEntity);

        final ProgrammerEntity programmerEntity = new ProgrammerEntity();

        programmerEntity.setName("atul");
        programmerEntity.setSalary(1234);
        programmerEntity.setProjectEntities(projectEntitySet);
        programmerrepo.save(programmerEntity);
    }

    @Test
    @Transactional
    public void test_loadprogrammer() {

        final ProgrammerEntity programmerEntity = programmerrepo.findById(39).get();
        System.out.println(programmerEntity);

    }
}