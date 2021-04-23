package com.cg.fms.Exceptions;

public class InvalidCredentialsException extends RuntimeException{
	String message;
	public InvalidCredentialsException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
