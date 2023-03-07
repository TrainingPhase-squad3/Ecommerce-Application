package com.alvas.service;

import java.util.List;

import com.alvas.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getProduct(String productName);
	
	

}
