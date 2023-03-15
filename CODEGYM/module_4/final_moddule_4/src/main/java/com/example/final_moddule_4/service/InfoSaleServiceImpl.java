package com.example.final_moddule_4.service;

import com.example.final_moddule_4.model.InfoSale;
import com.example.final_moddule_4.repository.InfoSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InfoSaleServiceImpl implements InfoSaleService{

    @Autowired
    InfoSaleRepository infoSaleRepository;

    @Override
    public InfoSale searchByRateSale(Integer rateSale) {
        for (InfoSale infoSale : infoSaleRepository.findAll()){
            if (rateSale == infoSale.getRateSale()){
                return infoSale;
            }
        }
        return null;
    }

    @Override
    public List<InfoSale> findAll() {
        return infoSaleRepository.findAll();
    }

    @Override
    public InfoSale findById(int id) {
        return infoSaleRepository.findById(id).get();
    }


    @Override
    public void deleteById(int id) {
        infoSaleRepository.deleteById(id);
    }

    @Override
    public void save(InfoSale infoSale) {
        infoSaleRepository.save(infoSale);
    }
}
