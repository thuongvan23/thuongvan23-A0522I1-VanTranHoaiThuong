package com.example.ss9_borowingbooksmanagement.service;

import com.example.ss9_borowingbooksmanagement.model.TitleBook;

import java.util.List;

public interface TitleBookService {
    List<TitleBook> findAll();
    TitleBook findByTitle(String title);
}
