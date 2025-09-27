package xyz;

public class CustomeException extends Exception {
	
	public CustomeException() {
		System.out.println("Empty String");
	}
	
	public CustomeException(String str) {
		System.out.println(str);
	}
}
