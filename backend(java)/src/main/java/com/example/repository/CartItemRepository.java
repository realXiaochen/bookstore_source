package com.example.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.domain.CartItem;
import com.example.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
}
