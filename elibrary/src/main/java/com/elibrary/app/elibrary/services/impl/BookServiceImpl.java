package com.elibrary.app.elibrary.services.impl;

import java.util.List;

import com.elibrary.app.elibrary.model.Book;
import com.elibrary.app.elibrary.repositories.BookRepository;
import com.elibrary.app.elibrary.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findOne(int id) {
        return bookRepository.getOne(id);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }

}
