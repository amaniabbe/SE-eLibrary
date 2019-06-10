package com.elibrary.app.elibrary.services;

import java.util.List;

import com.elibrary.app.elibrary.model.Book;

public interface BookService{

    List<Book> findAll();
	Book save(Book book);
	Book findOne(int id);
	void delete(int id);

}