package com.tareq.BOOKSHOP.model;

import java.time.Year;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String title2;
	private int Price;
	private Year YearOfPublish;
	@ManyToOne(targetEntity = Author.class,cascade = CascadeType.MERGE)
	@JoinColumn(name="author_id",referencedColumnName = "id")
	private Author author;
	private String genre;
	private String publisher;
	
}
