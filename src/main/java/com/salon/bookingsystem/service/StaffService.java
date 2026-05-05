package com.example.SalonAppointmentBookingSystem.service;

import com.example.SalonAppointmentBookingSystem.model.Staff;
import com.example.SalonAppointmentBookingSystem.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository repository;

    public List<Staff>getAllStaff(){
        return repository.findAll();
    }

    public void addStaff(Staff staff){
        repository.save(staff);
    }

    public void deleteStaff(Long id){
        repository.deleteById(id);
    }
}
