package com.atul.spring.data.productdata.repository.app;

import static org.junit.Assert.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atul.spring.data.productdata.entity.Appointment;
import com.atul.spring.data.productdata.entity.Doctor;
import com.atul.spring.data.productdata.entity.Insurence;
import com.atul.spring.data.productdata.entity.PatientEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientRepoTest {

    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private AppointmentRepos appointmentRepos;

    @Test
    public void test_CreaetDoctor() {

        final Doctor doctor = new Doctor();
        doctor.setFirstName("nn");
        doctor.setLastName("tt");
        doctor.setSpeciality("All");
        doctorRepo.save(doctor);

    }


    @Test
    public void test_CreaetPatient() {
       final PatientEntity patientEntity = new PatientEntity();
       patientEntity.setFirstName("atul");
       patientEntity.setLastName("kk");

       final Insurence insurence = new Insurence();
       insurence.setProviderName("ge");
       insurence.setCopay(1000d);
       patientEntity.setInsurence(insurence);

       final Doctor doctor = doctorRepo.findById(43l).get();
       patientEntity.setDoctors(Arrays.asList(doctor));

       patientRepo.save(patientEntity);

    }

    @Test
    public void test_CreateAppointment() {
        final Appointment appointment = new Appointment();
        final Timestamp timestamp = new Timestamp(new Date().getTime());
        appointment.setAppointmentTime(timestamp);
        appointment.setReason("I have a problem");
        appointment.setStarted(true);
        appointment.setPatientEntity(patientRepo.findById(44l).get());
        appointment.setDoctor(doctorRepo.findById(43l).get());

        appointmentRepos.save(appointment);


    }
}