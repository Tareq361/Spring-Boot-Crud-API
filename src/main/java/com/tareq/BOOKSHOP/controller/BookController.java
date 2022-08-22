package com.tareq.BOOKSHOP.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@PostMapping("/books")
public Book addNewBook(@RequestBody Book book) {
	
	return bookService.addNewBook(book);
}
@GetMapping("/books/{id}")
public Optional<Book> findBookById(@PathVariable Long id) {
	
	return bookService.findBookById(id);
}
@GetMapping("/books/")
public Optional<Book> findBookByTitle(@RequestParam(value="title") String title) {
	
	return bookService.findBookByTitle(title);
}
@PutMapping("/books/{id}")
public Book updateBookById(@PathVariable Long id, @RequestBody Book book) {
	
	return bookService.updateBookById(id,book);
}
@DeleteMapping("/books/{id}")
public String deleteBookById(@PathVariable Long id) {
	
	return bookService.deleteBookById(id);
}
@DeleteMapping("/books")
public String deleteAllBooks() {
	
	return bookService.deleteAllBooks();
}
}
