package com.tareq.BOOKSHOP.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.tareq.BOOKSHOP.model.Book;
import com.tareq.BOOKSHOP.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {
private final BookRepository bookRepository;
public List<Book> getAllBooks(){

	return bookRepository.findAll();
}

public Book addNewBook(Book book) {
	// TODO Auto-generated method stub
//	Optional<book> bookOptional=bookRepository.findbookByBookName(books.getBookName());
//	if(bookOptional.isPresent()) {
//		throw new IllegalStateException("Book name exists");
//	}
	
       return bookRepository.save(book);
	
}
}
