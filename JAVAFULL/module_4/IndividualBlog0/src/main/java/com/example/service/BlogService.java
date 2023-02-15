package com.example.service;

import com.example.model.Blog;

import java.util.List;

public interface BlogService {
    void save(Blog blog);
    void edit(int id, Blog blog);
    void remove(int id);
    Blog findById(int id);
    List<Blog> findAll();
}
