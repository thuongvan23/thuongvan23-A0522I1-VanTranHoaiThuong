package com.example.ss10_ecommerce.repository;

import com.example.ss10_ecommerce.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
