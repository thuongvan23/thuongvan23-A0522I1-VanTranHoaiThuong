package com.example.ss9_borowingbooksmanagement.repository;

import com.example.ss9_borowingbooksmanagement.model.TitleBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TitleBookRepository extends JpaRepository<TitleBook, String> {
}
