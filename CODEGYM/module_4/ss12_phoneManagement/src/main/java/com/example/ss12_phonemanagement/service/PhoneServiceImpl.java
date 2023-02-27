package com.example.ss12_phonemanagement.service;

import com.example.ss12_phonemanagement.model.Smartphone;
import com.example.ss12_phonemanagement.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public List<Smartphone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Smartphone findById(Long id) {
        return phoneRepository.findById(id).get();
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public void remove(Long id) {
        phoneRepository.deleteById(id);
    }
}
