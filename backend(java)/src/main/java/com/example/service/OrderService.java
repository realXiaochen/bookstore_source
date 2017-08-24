package com.example.service;

import com.example.domain.BillingAddress;
import com.example.domain.Order;
import com.example.domain.Payment;
import com.example.domain.ShippingAddress;
import com.example.domain.ShoppingCart;
import com.example.domain.User;

public interface OrderService {
	
	Order createOrder(
			ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user
	);

}
