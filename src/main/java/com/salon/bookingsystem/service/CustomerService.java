package com.salon.bookingsystem.service;

import com.salon.bookingsystem.model.Customer;
import com.salon.bookingsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public void registerCustomer(Customer customer) {
        repository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        repository.save(customer);
    }

    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }
}