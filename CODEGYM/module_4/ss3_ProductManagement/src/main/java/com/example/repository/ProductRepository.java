package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
    void createAndUpdate(Product productDTO);
    void delete(String name);
    Product findByName(String name);
    String showDetail(Product productDTO);
}
