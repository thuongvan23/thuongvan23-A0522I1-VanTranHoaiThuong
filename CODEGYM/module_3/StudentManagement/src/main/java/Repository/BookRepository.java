package Repository;

import Bean.Book;

import java.util.List;

public interface BookRepository {
    void saveOrUpdate(Book book);
    void deleteById(String id);
    Book findById(String id);
    List<Book> findAll();
}
