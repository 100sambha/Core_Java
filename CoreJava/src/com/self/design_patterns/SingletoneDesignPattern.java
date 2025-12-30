package com.self.design_patterns;

public class SingletoneDesignPattern {

	public static void main(String[] args) {
		
//		Using Static singleton object
		Singleton1 s1 =  Singleton1.getInstance();
		Singleton1 s2 =  Singleton1.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		
//		Using Static singleton object
		Singleton2 s11 = Singleton2.getInstance();
		Singleton2 s22 = Singleton2.getInstance();
		System.out.println(s11);
		System.out.println(s22);
		
		Singleton3 s111 = Singleton3.getInstance();
		Singleton3 s222 = Singleton3.getInstance();
		System.out.println(s111);
		System.out.println(s222);
	}
}