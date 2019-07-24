package com.atul.spring.data.productdata.repository;

import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.ImageEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageRepoTest {

    @Autowired
    private ImageRepo imageRepo;

//    @Test
//    public void test_createData() throws Exception{
//        final ImageEntity imageEntity = new ImageEntity();
//        imageEntity.setName("test,jpeg");
//        imageEntity.setId(1l);
//
//        File file = new File("/Users/akumar63/Desktop/test.png");
//        byte[] fileContent = new byte[(int)file.length()];
//        final InputStream inputStream = new FileInputStream(file);
//        inputStream.read(fileContent);
//        imageEntity.setData(fileContent);
//
//        imageRepo.save(imageEntity);
//        inputStream.close();
//    }

    @Test
    public void test_readImages() {
        imageRepo.findById(1l);
    }
}