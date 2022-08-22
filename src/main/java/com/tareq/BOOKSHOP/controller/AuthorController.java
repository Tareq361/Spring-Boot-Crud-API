package com.tareq.BOOKSHOP.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareq.BOOKSHOP.model.Author;
import com.tareq.BOOKSHOP.service.AuthorService;

import lombok.AllArgsConstructor;
@RestController
@RequestMapping(path ="/api")
@AllArgsConstructor
public class AuthorController {
	private final AuthorService authorService;

	@GetMapping("/authors")
	public List<Author> getAllAuthors(){
		return authorService.getAllAuthors();
	}
	@PostMapping("/addauthor")
	public Author addNewAuthor(@RequestBody Author author) {
		
		return authorService.addNewAuthor(author);
	}
}
