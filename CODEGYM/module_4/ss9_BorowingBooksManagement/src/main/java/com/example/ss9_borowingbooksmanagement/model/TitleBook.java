package com.example.ss9_borowingbooksmanagement.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
public class TitleBook {
    @Id
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "quantity")
    private int quantity;

    public TitleBook() {
    }

    public TitleBook(String title, String description, int quantity) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
