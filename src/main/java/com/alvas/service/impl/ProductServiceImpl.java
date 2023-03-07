package com.alvas.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvas.dto.ProductDto;
import com.alvas.entity.Product;
import com.alvas.exception.ProductNotFoundException;
import com.alvas.repository.ProductRepository;
import com.alvas.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<ProductDto> getProduct(String productName) {

		List<Product> products = productRepository.findAllByProductNameContainingIgnoreCase(productName);
		List<ProductDto> productDtos = new ArrayList<>();
		products.forEach(p -> {
			ProductDto productDto = new ProductDto();
			BeanUtils.copyProperties(p, productDto);
			productDtos.add(productDto);
		});

		return productDtos;

	}

}
