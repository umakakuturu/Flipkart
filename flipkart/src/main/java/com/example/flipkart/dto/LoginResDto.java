package com.example.flipkart.dto;

public class LoginResDto {

	private String statusMessage;
	private int statusCode;

	/*
	 * public LoginResDto(String statusMessage, int statusCode) { super();
	 * this.statusMessage = statusMessage; this.statusCode = statusCode; }
	 */
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}
