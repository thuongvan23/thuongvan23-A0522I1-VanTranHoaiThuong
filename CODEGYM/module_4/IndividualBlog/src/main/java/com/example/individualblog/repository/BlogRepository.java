package com.example.individualblog.repository;


import com.example.individualblog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
