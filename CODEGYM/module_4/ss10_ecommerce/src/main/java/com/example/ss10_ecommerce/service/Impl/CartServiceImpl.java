package com.example.ss10_ecommerce.service.Impl;

import com.example.ss10_ecommerce.model.Cart;
import com.example.ss10_ecommerce.model.Item;
import com.example.ss10_ecommerce.repository.CartRepository;
import com.example.ss10_ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public void addToCart(Item item, String userName) {
        cartRepository.findById(userName).get().getItemSet().add(item);
    }
}
