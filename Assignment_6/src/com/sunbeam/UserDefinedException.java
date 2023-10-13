package com.sunbeam;

public class UserDefinedException extends RuntimeException {

	private String message;

	public UserDefinedException() {
		
	}

	public UserDefinedException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "UserDefinedException -> " + message + "]";
	}
	
	
}
