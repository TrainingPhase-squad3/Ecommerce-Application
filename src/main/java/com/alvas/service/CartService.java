package com.alvas.service;

import com.alvas.dto.CartDto;

public interface CartService {
	String addToCart(long userId,CartDto cartDto);
}
