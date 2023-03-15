package com.example.final_moddule_4.service;


import com.example.final_moddule_4.model.InfoSale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InfoSaleService {
    InfoSale searchByRateSale(Integer rateSale);
    List<InfoSale> findAll();
    InfoSale findById(int id);
    void deleteById(int id);
    void save(InfoSale infoSale);
}
