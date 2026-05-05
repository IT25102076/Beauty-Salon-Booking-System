package com.example.SalonAppointmentBookingSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private double salary;
    private String shift;
    private String status;

}
