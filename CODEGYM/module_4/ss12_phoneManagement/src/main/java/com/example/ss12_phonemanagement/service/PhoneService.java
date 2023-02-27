package com.example.ss12_phonemanagement.service;

import com.example.ss12_phonemanagement.model.Smartphone;

import java.util.List;

public interface PhoneService {
    List<Smartphone> findAll();
    Smartphone findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
