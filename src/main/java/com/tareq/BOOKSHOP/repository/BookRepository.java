package com.tareq.BOOKSHOP.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tareq.BOOKSHOP.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	@Query()
	Optional<Book> findBookBytitle(String title);

}
