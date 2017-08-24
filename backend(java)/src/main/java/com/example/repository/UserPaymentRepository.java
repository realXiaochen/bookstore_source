package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
