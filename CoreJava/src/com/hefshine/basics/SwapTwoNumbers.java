package com.hefshine.basics;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		System.out.println("Previous");		
		System.out.println(n1);
		System.out.println(n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("Later");		
		System.out.println(n1);
		System.out.println(n2);
	}

}
