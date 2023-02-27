package com.example.ss12_phonemanagement.repository;

import com.example.ss12_phonemanagement.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PhoneRepository extends JpaRepository<Smartphone, Long> {
}
