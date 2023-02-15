package com.example.service;

import com.example.model.Blog;
import com.example.repository.BlogRepository;
import com.example.repository.impl.BLogRepositoryImpl;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository = new BLogRepositoryImpl();

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void edit(int id, Blog blog) {
        blogRepository.edit(id, blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.remove(id);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
