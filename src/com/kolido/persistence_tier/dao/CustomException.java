package com.kolido.persistence_tier.dao;

public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomException() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
