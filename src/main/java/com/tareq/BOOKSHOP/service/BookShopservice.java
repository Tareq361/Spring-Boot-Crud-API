package com.tareq.BOOKSHOP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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

       return bookShopRepository.save(bookShop);
	
}

public Optional<BookShop> findBookshopById(Long id) {
	// TODO Auto-generated method stub
	return bookShopRepository.findById(id);
}

public Optional<BookShop> findBookshopByTitle(String title) {
	// TODO Auto-generated method stub
	return bookShopRepository.findByshopName(title);
}

public BookShop updateBookshopById(Long id, BookShop bookshop) {
	BookShop existBookShop=bookShopRepository.findById(id).orElse(null);
	existBookShop.setShopName(bookshop.getShopName());
	existBookShop.setShopNumber(bookshop.getShopNumber());
	existBookShop.setLocation(bookshop.getLocation());
	existBookShop.setEmail(bookshop.getEmail());
	existBookShop.setContactNumber(bookshop.getContactNumber());
	existBookShop.setBooklist(bookshop.getBooklist());
	
	return bookShopRepository.save(existBookShop);
}

public String deleteBookshopById(Long id) {
	bookShopRepository.deleteById(id);
	return "Book shop deleted";
}

public String deleteAllBookshops() {
	bookShopRepository.deleteAll();
	return "All book shop deleted successfully";
}

}
