package com.example.ss10_ecommerce.service.Impl;

import com.example.ss10_ecommerce.model.Item;
import com.example.ss10_ecommerce.repository.ItemRepository;
import com.example.ss10_ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findByName(String name) {
        return itemRepository.findById(name).get();
    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void remove(Item item) {
        itemRepository.delete(item);
    }
}
