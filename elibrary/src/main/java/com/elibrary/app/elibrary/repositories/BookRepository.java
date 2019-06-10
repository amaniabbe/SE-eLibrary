package com.elibrary.app.elibrary.repositories;

import com.elibrary.app.elibrary.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{

}