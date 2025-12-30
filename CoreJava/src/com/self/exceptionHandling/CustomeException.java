package com.self.exceptionHandling;

public class CustomeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CustomeException() {
		System.out.println("Empty String");
	}
	
	public CustomeException(String str) {
		System.out.println(str);
	}
}
