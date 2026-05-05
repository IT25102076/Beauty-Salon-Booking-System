package com.salon.bookingsystem.controller;

import com.salon.bookingsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @GetMapping("/appointments")
    public String viewAppointmentsPage(){
        return "appointments";
    }

}
