package com.atul.spring.data.productdata.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.StudentEntity;


@Repository
public interface StudentRepository extends PagingAndSortingRepository<StudentEntity, Long> {

    @Query(value = "select student from StudentEntity student")
    List<StudentEntity> findAllStudents(final Pageable pageable);

    @Query(value = "select s.firstName , s.lastName from StudentEntity s")
    List<Object[]> findStudentspartial();

    @Query(value = "select s from StudentEntity s where s.firstName = :firstName")
    List<StudentEntity> findAllStudentByFirstName(@Param("firstName") final String firstName);


    @Query(value = "select s from StudentEntity s where s.score >:minScore and s.score <:maxScore")
    List<StudentEntity> findAllInGivenScore(@Param("minScore") final int minScore,
            @Param("maxScore") final int maxScore);

    @Modifying
    @Query(value = "delete from StudentEntity s where s.firstName = :firstName")
    void deletStudentsByFirstName(@Param("firstName") final String firstName);


//    jpql native Query
    @Query(value = "select * from student", nativeQuery = true)
    List<StudentEntity> findAllUsernative();

    @Query(value = "select * from student s where s.fname = :firstName", nativeQuery = true)
    List<StudentEntity> findAllUsernativeParam(@Param("firstName") final String firstName);






}
