package com.example.ss9_borowingbooksmanagement.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Transaction {
    @Id
    @Column(name = "borrowed_code")
    private int borrowedCode;
    @Column(name = "begin_date")
    private String beginDate;
    @Column(name = "end_date")
    private String endDate;
    @ManyToOne
    @JoinColumn(name = "title")
    private TitleBook titleBook;

    public Transaction() {
    }

    public int getBorrowedCode() {
        return borrowedCode;
    }

    public void setBorrowedCode(int borrowedCode) {
        this.borrowedCode = borrowedCode;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public TitleBook getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(TitleBook titleBook) {
        this.titleBook = titleBook;
    }

    public Transaction(int borrowedCode, String beginDate, String endDate, TitleBook titleBook) {
        this.borrowedCode = borrowedCode;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.titleBook = titleBook;
    }
}
