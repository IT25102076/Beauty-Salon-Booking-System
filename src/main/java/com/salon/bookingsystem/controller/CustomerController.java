package com.salon.bookingsystem.controller;

import com.salon.bookingsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/customer")
    public String viewAppointmentsPage(){
        return "customer";
    }
    @GetMapping("/register")
    public String showRegistrationPage(){
        return "register-customer";

    }

}
