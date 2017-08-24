package com.example.service;

import com.example.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
