package com.example.productmanagement_pfe.service.impl;

import com.example.productmanagement_pfe.model.Product;
import com.example.productmanagement_pfe.repository.ProductRepository;
import com.example.productmanagement_pfe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Page<Product> findAllByName(String name, Pageable pageable) {
        return productRepository.findAllByNameProductContaining(name, pageable);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
