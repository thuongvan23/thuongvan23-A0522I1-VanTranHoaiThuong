package com.example.ss10_ecommerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Item {

    @Id
    @Column(name = "itemName")
    private String itemName;

    @Column(name = "price")
    private float price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "itemSet")
    @JsonManagedReference
    private Set<Cart> cartSet;

    public Item() {
    }

    public Item(String itemName, float price, int quantity, String description, Set<Cart> cartSet) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.cartSet = cartSet;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
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
