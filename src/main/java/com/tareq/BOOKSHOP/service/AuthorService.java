package com.tareq.BOOKSHOP.service;


import java.util.List;

import org.springframework.stereotype.Service;
import com.tareq.BOOKSHOP.model.Author;
import com.tareq.BOOKSHOP.repository.AuthorRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class AuthorService {
	private final AuthorRepository authorRepository;
	

	
	public List<Author> getAllAuthors(){

		return authorRepository.findAll();
	}

	public Author addNewAuthor(Author author) {
		// TODO Auto-generated method stub
//		Optional<book> bookOptional=bookRepository.findbookByBookName(books.getBookName());
//		if(bookOptional.isPresent()) {
//			throw new IllegalStateException("Book name exists");
//		}
		System.out.println(author);
	       return authorRepository.save(author);
		
	}
}
