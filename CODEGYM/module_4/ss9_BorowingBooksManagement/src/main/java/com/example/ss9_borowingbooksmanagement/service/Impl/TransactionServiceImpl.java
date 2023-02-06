package com.example.ss9_borowingbooksmanagement.service.Impl;

import com.example.ss9_borowingbooksmanagement.model.Transaction;
import com.example.ss9_borowingbooksmanagement.repository.TransactionRepository;
import com.example.ss9_borowingbooksmanagement.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findByBorrowedCode(int borrowedCode) {
        return transactionRepository.findById(borrowedCode).get();
    }

    @Override
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
