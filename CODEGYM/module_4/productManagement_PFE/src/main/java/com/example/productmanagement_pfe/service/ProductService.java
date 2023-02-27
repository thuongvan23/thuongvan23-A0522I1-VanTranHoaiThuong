package com.example.productmanagement_pfe.service;

import com.example.productmanagement_pfe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService{
    Page<Product> findAllByName(String name, Pageable pageable);
    List<Product> getAll();
    Product findById(int id);
    void save(Product product);
    void delete(Product product);
}
