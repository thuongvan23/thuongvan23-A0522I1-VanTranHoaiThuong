package com.example.ss8_validateform.repository;

import com.example.ss8_validateform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, String> {
}
