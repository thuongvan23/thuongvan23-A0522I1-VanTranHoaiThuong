package com.example.ss9_borowingbooksmanagement.repository;

import com.example.ss9_borowingbooksmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
}
