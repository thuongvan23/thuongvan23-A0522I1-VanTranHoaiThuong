package com.example.case_study_module4.service;

import com.example.case_study_module4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    Page<Customer> findAllByName(Pageable pageable, String name);
    Page<Customer> findAllByCustomerNameContainingOrAddressContainingOrCustomerType_TypeName(Pageable pageable, String customerName, String address, String typeName);
    void deleteById(int id);
    void save(Customer customer);
}
