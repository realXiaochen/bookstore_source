package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.UserPayment;
import com.example.repository.UserPaymentRepository;
import com.example.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {
	@Autowired
	private UserPaymentRepository userPaymentRepository;
	
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userPaymentRepository.delete(id);
	}
	
}
