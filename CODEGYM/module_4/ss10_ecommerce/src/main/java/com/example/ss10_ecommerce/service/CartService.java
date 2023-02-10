package com.example.ss10_ecommerce.service;

import com.example.ss10_ecommerce.model.Cart;
import com.example.ss10_ecommerce.model.Item;

public interface CartService{
    void addToCart(Item item, String userName);

}
