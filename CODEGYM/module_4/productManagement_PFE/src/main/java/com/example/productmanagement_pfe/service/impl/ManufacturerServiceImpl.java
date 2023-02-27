package com.example.productmanagement_pfe.service.impl;

import com.example.productmanagement_pfe.model.Manufacturer;
import com.example.productmanagement_pfe.repository.ManufacturerRepository;
import com.example.productmanagement_pfe.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Override
    public List<Manufacturer> getAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer findById(int id) {
        return manufacturerRepository.findById(id).get();
    }
}
