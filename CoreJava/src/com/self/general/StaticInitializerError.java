package com.self.general;

public class StaticInitializerError {
	
	static 
	{
		int i = 0;
		String j = null;
		System.out.println(j.length());
	}


	
	public static void main(String[] args) {
		System.out.println("Static Initializer");
		
		
	}

}
