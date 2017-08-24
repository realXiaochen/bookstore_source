package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}
