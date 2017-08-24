package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.UserBilling;

public interface UserBillingRepository extends CrudRepository<UserBilling, Long> {

}
