package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Order;
import com.example.domain.User;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByUser(User user);
}
