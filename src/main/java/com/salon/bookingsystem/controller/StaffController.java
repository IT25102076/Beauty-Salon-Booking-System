package com.example.SalonAppointmentBookingSystem.controller;

import com.example.SalonAppointmentBookingSystem.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {
    @Autowired
    private StaffService service;

    @GetMapping("/staff")
    public String showStaffPage(){
        return "staff";
    }
}
