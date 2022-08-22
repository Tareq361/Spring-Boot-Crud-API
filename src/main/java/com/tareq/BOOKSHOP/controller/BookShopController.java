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

import com.tareq.BOOKSHOP.BookshopApplication;
import com.tareq.BOOKSHOP.model.BookShop;
import com.tareq.BOOKSHOP.service.BookShopservice;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="/api")
@AllArgsConstructor
public class BookShopController {
private final BookShopservice bookShopservice;
@GetMapping("/bookshops")
public List<BookShop> getAllBookShop(){
	return bookShopservice.getAllBookShop();
}
@PostMapping("/bookshops")
public BookShop addNewBookShop(@RequestBody BookShop bookShop) {
	
	return bookShopservice.addNewBookShop(bookShop);
}
@GetMapping("/bookshops/{id}")
public Optional<BookShop> findBookshopById(@PathVariable Long id) {
	
	return bookShopservice.findBookshopById(id);
}
@GetMapping("/bookshops/")
public Optional<BookShop> findBookshopByTitle(@RequestParam(value="title") String title) {
	
	return bookShopservice.findBookshopByTitle(title);
}
@PutMapping("/bookshops/{id}")
public BookShop updateBookshopById(@PathVariable Long id, @RequestBody BookShop bookshop) {
	
	return bookShopservice.updateBookshopById(id,bookshop);
}
@DeleteMapping("/bookshops/{id}")
public String deleteBookshopById(@PathVariable Long id) {
	
	return bookShopservice.deleteBookshopById(id);
}
@DeleteMapping("/bookshops")
public String deleteAllBookshops() {
	
	return bookShopservice.deleteAllBookshops();
}
}
