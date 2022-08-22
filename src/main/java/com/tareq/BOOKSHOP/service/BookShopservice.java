package com.tareq.BOOKSHOP.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tareq.BOOKSHOP.model.Book;
import com.tareq.BOOKSHOP.model.BookShop;
import com.tareq.BOOKSHOP.repository.BookShopRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookShopservice {
private final BookShopRepository bookShopRepository;

public List<BookShop> getAllBookShop(){

	return bookShopRepository.findAll();
}

public BookShop addNewBookShop(BookShop bookShop) {
	// TODO Auto-generated method stub
//	Optional<book> bookOptional=bookRepository.findbookByBookName(books.getBookName());
//	if(bookOptional.isPresent()) {
//		throw new IllegalStateException("Book name exists");
//	}
	
       return bookShopRepository.save(bookShop);
	
}

}
