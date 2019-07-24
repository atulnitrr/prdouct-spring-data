package com.atul.spring.data.productdata.repository.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.atul.spring.data.productdata.entity.Appointment;


@Repository
public interface AppointmentRepos extends CrudRepository<Appointment, Long> {
}
