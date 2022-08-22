package com.tareq.BOOKSHOP.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tareq.BOOKSHOP.model.BookShop;
@Repository
public interface BookShopRepository extends JpaRepository<BookShop, Long> {

	Optional<BookShop> findByshopName(String title);

	
	
}
