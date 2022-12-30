package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void createAndUpdate(Product product);
    void delete(String name);
    Product findByName(String name);
    String showDetail(Product product);
}
