package com.example.ss10_ecommerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @OneToOne
    @JoinColumn(name = "userName")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cart_item",
            joinColumns = @JoinColumn(name = "idCart"),
            inverseJoinColumns = @JoinColumn(name = "itemName"))
    @JsonManagedReference
    private Set<Item> itemSet;

    public Cart() {
    }

    public Cart(User user, Set<Item> itemSet) {
        this.user = user;
        this.itemSet = itemSet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }
}
