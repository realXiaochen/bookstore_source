package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.BillingAddress;

public interface BillingAddressRepository extends CrudRepository<BillingAddress, Long>{

}
