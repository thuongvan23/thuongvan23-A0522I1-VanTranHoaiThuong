package com.example.case_study_module4.controller;

import com.example.case_study_module4.model.Customer;
import com.example.case_study_module4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/view")
public class DetailController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/detail/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }
}
