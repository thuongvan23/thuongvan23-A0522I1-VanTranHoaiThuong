package com.example.productmanagement_pfe.repository;

import com.example.productmanagement_pfe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAllByNameProductContaining(String name, Pageable pageable);
}
