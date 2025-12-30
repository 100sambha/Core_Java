package com.self.exceptionHandling;

import java.util.Scanner;

public class NullPointerExceptionHandling {
	public static void main(String[] args) throws NullPointerException {
		
		Scanner sc = new Scanner(System.in);
		String s1 = null;
		try {
			
			System.out.println(s1.charAt(0));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
//		System.out.println("Please Enter details");
//		s1 = sc.nextLine();
//		if(s1.length()<15) {
//			System.out.println(s1);
//		} else {
//			throw new StringIndexOutOfBoundsException("Name should be less than 15 character");
//		}
//		System.out.println("gfdsgfdsfds");
//		
//		sc.close();
		
	}
}
