package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
