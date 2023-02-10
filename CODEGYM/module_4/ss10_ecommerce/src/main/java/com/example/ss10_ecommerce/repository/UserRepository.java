package com.example.ss10_ecommerce.repository;

import com.example.ss10_ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
