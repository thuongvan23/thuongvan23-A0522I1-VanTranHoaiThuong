package com.example.ss10_ecommerce.repository;

import com.example.ss10_ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {
}
