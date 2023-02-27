package com.example.case_study_module4.service;

import com.example.case_study_module4.model.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
    CustomerType findById(int id);
}
