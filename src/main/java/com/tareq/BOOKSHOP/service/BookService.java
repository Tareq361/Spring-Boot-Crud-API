package com.tareq.BOOKSHOP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
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
public Optional<Book> findBookById(Long id) {
	return bookRepository.findById(id);
}
public Optional<Book> findBookByTitle(String title) {
	return bookRepository.findBookBytitle(title);
}

public String deleteBookById(Long id) {
	// TODO Auto-generated method stub
	bookRepository.deleteById(id);
	return "Book Removed";
}

public Book updateBookById(Long id,Book book) {
	// TODO Auto-generated method stub
	Book existingBook=bookRepository.findById(id).orElse(null);
	existingBook.setTitle(book.getTitle());
	existingBook.setPrice(book.getPrice());
	existingBook.setGenre(book.getGenre());
	existingBook.setPublisher(book.getPublisher());
	existingBook.setYearOfPublish(book.getYearOfPublish());
	return bookRepository.save(existingBook);
	
	
}

public String deleteAllBooks() {
	bookRepository.deleteAll();
	// TODO Auto-generated method stub
	return "All book deleted successfully";
}


}
