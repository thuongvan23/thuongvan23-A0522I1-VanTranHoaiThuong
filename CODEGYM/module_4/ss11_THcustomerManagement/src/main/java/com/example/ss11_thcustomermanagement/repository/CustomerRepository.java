package com.example.ss11_thcustomermanagement.repository;

import com.example.ss11_thcustomermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
