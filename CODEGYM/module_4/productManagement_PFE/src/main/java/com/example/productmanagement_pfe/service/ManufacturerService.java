package com.example.productmanagement_pfe.service;

import com.example.productmanagement_pfe.model.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    List<Manufacturer> getAll();
    Manufacturer findById(int id);
}
