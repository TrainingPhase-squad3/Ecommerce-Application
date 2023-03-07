package com.alvas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvas.dto.PaymentDto;
import com.alvas.entity.Cart;
import com.alvas.entity.User;
import com.alvas.exception.CartNotFoundException;
import com.alvas.exception.UserNotFoundException;
import com.alvas.repository.CartRepository;
import com.alvas.repository.PaymentRepository;
import com.alvas.repository.ProductRepository;
import com.alvas.repository.UserRepository;
import com.alvas.repository.WalletRepository;
import com.alvas.response.ApiResponse;
import com.alvas.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	CartRepository cartRepository;

	@Autowired
	WalletRepository walletRepository;

	@Autowired
	PaymentRepository paymentRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public ApiResponse payment(long userId, PaymentDto paymentDto) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User with user id:" + userId + " not found"));
		Cart cart = cartRepository.findById(paymentDto.getCartId()).orElseThrow(
				() -> new CartNotFoundException("Cart with cartId:" + paymentDto.getCartId() + " not found"));
		
		return null;
	}

}
