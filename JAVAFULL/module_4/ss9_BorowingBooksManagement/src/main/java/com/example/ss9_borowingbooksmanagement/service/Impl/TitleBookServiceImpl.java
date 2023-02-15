package com.example.ss9_borowingbooksmanagement.service.Impl;

import com.example.ss9_borowingbooksmanagement.model.TitleBook;
import com.example.ss9_borowingbooksmanagement.repository.TitleBookRepository;
import com.example.ss9_borowingbooksmanagement.service.TitleBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleBookServiceImpl implements TitleBookService {
    @Autowired
    TitleBookRepository titleBookRepository;

    @Override
    public List<TitleBook> findAll() {
        return titleBookRepository.findAll();
    }

    @Override
    public TitleBook findByTitle(String title) {
        return titleBookRepository.findById(title).get();
    }
}
