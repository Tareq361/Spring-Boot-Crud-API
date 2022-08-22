package com.tareq.BOOKSHOP.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareq.BOOKSHOP.model.Book;
import com.tareq.BOOKSHOP.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="/api")
@AllArgsConstructor
public class BookController {
private final BookService bookService;
@GetMapping("/books")
public List<Book> getAllBooks(){
	return bookService.getAllBooks();
}
@PostMapping("/addbook")
public Book addNewBook(@RequestBody Book book) {
	
	return bookService.addNewBook(book);
}
}
