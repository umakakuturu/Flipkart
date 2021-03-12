package com.example.flipkart.exception;

public class UserNotLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserNotLoginException(String message) {
		super(message);
	}

	public UserNotLoginException(int userNotLoginStatus) {

	}

}
