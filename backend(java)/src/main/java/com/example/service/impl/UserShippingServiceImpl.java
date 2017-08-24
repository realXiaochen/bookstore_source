package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.UserShipping;
import com.example.repository.UserShippingRepository;
import com.example.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userShippingRepository.delete(id);
	}
}
