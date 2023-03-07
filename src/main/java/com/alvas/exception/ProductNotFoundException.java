package com.alvas.exception;

import lombok.Data;

@Data
public class ProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public ProductNotFoundException(String message) {
		super(message);

	}
}
