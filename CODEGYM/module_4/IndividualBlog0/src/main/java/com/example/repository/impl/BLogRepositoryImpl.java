package com.example.repository.impl;

import com.example.model.Blog;
import com.example.repository.BlogRepository;

import javax.persistence.EntityTransaction;
import java.util.List;

public class BLogRepositoryImpl implements BlogRepository {

    @Override
    public void save(Blog blog) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(blog);
        entityTransaction.commit();
    }

    @Override
    public void edit(int id, Blog blog) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        try{
            BaseRepository.entityManager.createQuery("update Blog s set s.name = :name,s.content = :content where s.id = :id"
                    )
                    .setParameter("name",blog.getName())
                    .setParameter("content",blog.getContent());

        } catch (Exception e){
            entityTransaction.rollback();
        }
        entityTransaction.commit();
    }

    @Override
    public void remove(int id) {
        BaseRepository.entityManager.createQuery("delete from Blog as s where s.id = ?1", Blog.class).setParameter(1,id).executeUpdate();
    }

    @Override
    public Blog findById(int id) {
        Blog blog;
        blog = BaseRepository.entityManager.createQuery("select s from Blog as s where s.id = ?1", Blog.class).setParameter(1,id).getSingleResult();
        return blog;
    }

    @Override
    public List<Blog> findAll() {
        List<Blog> BlogList = BaseRepository.entityManager.createQuery("select s from Blog as s",Blog.class).getResultList();
        return BlogList;
    }
}
