package Service.impl;

import Bean.Category;
import Repository.CategoryRepository;
import Repository.impl.CategoryRepositoryImpl;
import Service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository = new CategoryRepositoryImpl();

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(String id) {
        return categoryRepository.findById(id);
    }
}
