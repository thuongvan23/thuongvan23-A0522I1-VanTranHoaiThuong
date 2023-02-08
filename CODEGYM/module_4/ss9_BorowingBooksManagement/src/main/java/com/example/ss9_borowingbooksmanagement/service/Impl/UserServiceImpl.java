package com.example.ss9_borowingbooksmanagement.service.Impl;

import com.example.ss9_borowingbooksmanagement.model.User;
import com.example.ss9_borowingbooksmanagement.repository.UserRepository;
import com.example.ss9_borowingbooksmanagement.service.UserService;
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
}
