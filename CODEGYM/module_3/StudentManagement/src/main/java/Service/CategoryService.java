package Service;

import Bean.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(String id);
}
