package com.example.ss10_ecommerce.service;

import com.example.ss10_ecommerce.model.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAll();
    Item findByName(String name);
    void save(Item user);
    void remove(Item user);
}
