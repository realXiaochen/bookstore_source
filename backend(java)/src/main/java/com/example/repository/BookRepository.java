package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findByTitleContaining(String keyword);
}
