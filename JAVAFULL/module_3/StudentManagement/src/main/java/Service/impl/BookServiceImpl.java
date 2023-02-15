package Service.impl;

import Bean.Book;
import Repository.BookRepository;
import Repository.impl.BookRepositoryImpl;
import Service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository = new BookRepositoryImpl();

    @Override
    public void saveOrUpdate(Book book) {
        bookRepository.saveOrUpdate(book);
    }

    @Override
    public void deleteById(String id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findById(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
