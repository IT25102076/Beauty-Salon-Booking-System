package com.salon.bookingsystem.repository;

import com.salon.bookingsystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppoinmentRepository extends JpaRepository<Appointment, Long> {
}
