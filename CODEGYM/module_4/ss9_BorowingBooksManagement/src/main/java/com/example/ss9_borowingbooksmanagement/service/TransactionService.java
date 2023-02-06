package com.example.ss9_borowingbooksmanagement.service;

import com.example.ss9_borowingbooksmanagement.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> findAll();
    Transaction findByBorrowedCode(int borrowedCode);
    void save(Transaction transaction);
}
