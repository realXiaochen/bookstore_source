package com.example.service;

import java.util.List;

import com.example.domain.Book;
import com.example.domain.CartItem;
import com.example.domain.ShoppingCart;
import com.example.domain.User;

public interface CartItemService {
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
	
	CartItem updateCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem findById(Long id);
	
	CartItem save(CartItem cartItem);

}
