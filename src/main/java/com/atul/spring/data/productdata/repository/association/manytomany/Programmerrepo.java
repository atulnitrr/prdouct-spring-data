package com.atul.spring.data.productdata.repository.association.manytomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.association.manytomany.ProgrammerEntity;


@Repository
public interface Programmerrepo extends CrudRepository<ProgrammerEntity, Integer> {


}
