package com.salon.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "HomePage";
    }

    @GetMapping("/booking")
    public String booking() {
        return "BookingAppo";
    }

    @GetMapping("/login-page")
    public String loginPage() {
        return "Login";
    }

    @GetMapping("/services")
    public String services() {
        return "Service";
    }

    @GetMapping("/haircut")
    public String haircut() {
        return "Haircut";
    }

    @GetMapping("/facial")
    public String facial() {
        return "Facial";
    }

    @GetMapping("/spa")
    public String spa() {
        return "Spa";
    }

    @GetMapping("/makeup")
    public String makeup() {
        return "Makeup";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin";
    }
}