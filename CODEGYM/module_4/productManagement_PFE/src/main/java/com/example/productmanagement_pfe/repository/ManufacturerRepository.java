package com.example.productmanagement_pfe.repository;

import com.example.productmanagement_pfe.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
}
