package com.tareq.BOOKSHOP.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BookShop")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookShop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String shopName;
	private Long shopNumber;
	private String location;
	@OneToMany(targetEntity = Book.class,cascade = CascadeType.MERGE)
	@JoinColumn(name = "Bookshop_id",referencedColumnName = "id")
	private List<Book> booklist;
	private String ContactNumber;
	private String Email;
}
