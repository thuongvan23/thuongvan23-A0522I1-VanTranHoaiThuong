package com.example.case_study_module4.repository;

import com.example.case_study_module4.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
