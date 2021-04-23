package com.cg.fms.Exceptions;

public class NoDataFoundException extends RuntimeException{
	String message;
	public NoDataFoundException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
