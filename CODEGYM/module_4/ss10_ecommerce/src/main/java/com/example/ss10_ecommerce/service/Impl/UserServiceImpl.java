package com.example.ss10_ecommerce.service.Impl;

import com.example.ss10_ecommerce.model.User;
import com.example.ss10_ecommerce.repository.UserRepository;
import com.example.ss10_ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByName(String name) {
        return userRepository.findById(name).get();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void remove(User user) {
        userRepository.delete(user);
    }
}
