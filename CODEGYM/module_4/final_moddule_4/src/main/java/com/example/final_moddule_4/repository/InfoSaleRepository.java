package com.example.final_moddule_4.repository;

import com.example.final_moddule_4.model.InfoSale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InfoSaleRepository extends JpaRepository<InfoSale, Integer> {
}
