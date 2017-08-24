package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.ShippingAddress;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long> {
	
}
