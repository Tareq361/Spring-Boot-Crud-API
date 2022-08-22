package com.tareq.BOOKSHOP.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tareq.BOOKSHOP.model.BookShop;
import com.tareq.BOOKSHOP.service.BookShopservice;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="/api")
@AllArgsConstructor
public class BookShopController {
private final BookShopservice bookShopservice;
@GetMapping("/bookshop")
public List<BookShop> getAllBookShop(){
	return bookShopservice.getAllBookShop();
}
@PostMapping("/addbookShop")
public BookShop addNewBookShop(@RequestBody BookShop bookShop) {
	
	return bookShopservice.addNewBookShop(bookShop);
}
}
