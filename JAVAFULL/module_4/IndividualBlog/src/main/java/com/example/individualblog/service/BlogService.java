package com.example.individualblog.service;

import com.example.individualblog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void delete(Blog blog);
}
