package com.example.service;

import com.example.domain.UserShipping;

public interface UserShippingService {
	
	UserShipping findById(Long id);
	
	void removeById(Long id);

}
