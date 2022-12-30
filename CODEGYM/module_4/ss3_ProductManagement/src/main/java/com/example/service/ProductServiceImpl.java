package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void createAndUpdate(Product product) {
        productRepository.createAndUpdate(product);
    }

    @Override
    public void delete(String name) {
        productRepository.delete(name);
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public String showDetail(Product product) {
        return productRepository.showDetail(product);
    }
}
