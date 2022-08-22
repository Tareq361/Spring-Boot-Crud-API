package com.tareq.BOOKSHOP.model;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Author")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "AuthorName",length=50, nullable=true, unique=false)
private String AuthorName;
@Column(name = "Gender")
private String gender;
}
