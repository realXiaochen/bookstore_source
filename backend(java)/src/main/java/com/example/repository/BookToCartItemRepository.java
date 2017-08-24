package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.BookToCartItem;
import com.example.domain.CartItem;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long>{
	void deleteByCartItem(CartItem cartItem);
}
