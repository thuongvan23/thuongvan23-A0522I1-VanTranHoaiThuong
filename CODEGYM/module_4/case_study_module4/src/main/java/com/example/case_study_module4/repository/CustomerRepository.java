package com.example.case_study_module4.repository;

import com.example.case_study_module4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable);
}
