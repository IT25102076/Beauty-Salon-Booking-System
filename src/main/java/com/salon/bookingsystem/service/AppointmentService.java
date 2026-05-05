package com.salon.bookingsystem.service;

import com.salon.bookingsystem.model.Appointment;
import com.salon.bookingsystem.repository.AppoinmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppoinmentRepository repository;

    public List<Appointment> getAllAppointments(){
        return repository.findAll();
    }

    public void saveAppointment(Appointment appointment){
        repository.save(appointment);
    }

    public void deleteAppointment(Long id){
        repository.deleteById(id);
    }
}
