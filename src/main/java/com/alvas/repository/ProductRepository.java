package com.alvas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvas.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByProductNameIgnoreCaseIn(List<String> productName);
	Product findByProductNameIgnoreCase(String productName);
}
