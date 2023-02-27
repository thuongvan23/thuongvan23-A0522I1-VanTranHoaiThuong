package com.example.case_study_module4.service.impl;

import com.example.case_study_module4.model.CustomerType;
import com.example.case_study_module4.repository.CustomerTypeRepository;
import com.example.case_study_module4.service.CustomerService;
import com.example.case_study_module4.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(int id) {
        return customerTypeRepository.findById(id).get();
    }
}
