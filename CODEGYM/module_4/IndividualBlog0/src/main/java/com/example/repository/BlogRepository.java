package com.example.repository;

import com.example.model.Blog;

import java.util.List;

public interface BlogRepository {
    void save(Blog blog);
    void edit(int id, Blog blog);
    void remove(int id);
    Blog findById(int id);
    List<Blog> findAll();
}
