package com.hefshine.java8;

import java.util.stream.IntStream;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int num = 4;
		int fact = IntStream.rangeClosed(1, num).reduce(1, (a,b)->a*b);
		System.out.println("Factorial of num : "+num+" is : "+fact);
	}
}