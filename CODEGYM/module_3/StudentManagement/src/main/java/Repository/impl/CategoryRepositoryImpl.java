package Repository.impl;

import Bean.Category;
import Repository.CategoryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryRepositoryImpl implements CategoryRepository {
    private static Map<String, Category> categoryMap;

    static {
        categoryMap = new HashMap<>();
        categoryMap.put("CT001", new Category("CT001", "SGK1"));
        categoryMap.put("CT002", new Category("CT001", "SGK2"));
        categoryMap.put("CT003", new Category("CT001", "SGK3"));
        categoryMap.put("CT004", new Category("CT001", "SGK4"));
    }

    @Override
    public List<Category> findAll() {
        return new ArrayList<>(categoryMap.values());
    }

    @Override
    public Category findById(String id) {
        return categoryMap.get(id);
    }
}
