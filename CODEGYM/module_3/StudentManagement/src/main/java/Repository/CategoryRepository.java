package Repository;

import Bean.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    Category findById(String id);
}
