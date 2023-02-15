package com.example.ss10_ecommerce.service;

import com.example.ss10_ecommerce.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByName(String name);
    void save(User user);
    void remove(User user);
}
