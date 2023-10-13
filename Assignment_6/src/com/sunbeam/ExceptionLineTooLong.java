package com.sunbeam;

public class ExceptionLineTooLong extends Exception {
	private String message;

	public ExceptionLineTooLong() {
		
	}

	public ExceptionLineTooLong(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void calculateStringLength() throws ExceptionLineTooLong
	{
		int length;
		length = message.length();
		System.out.println("Length = "+length);
		if(length>80)
		{
			throw new ExceptionLineTooLong("The strings is too long");
		}
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [message=" + message + "]";
	}
	
	
	
	
}
