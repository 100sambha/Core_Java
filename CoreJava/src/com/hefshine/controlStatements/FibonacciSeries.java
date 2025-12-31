package com.hefshine.controlStatements;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Fibonacci Series......1,1,2,3,5,8,13,21,......");
		
		int i = 1;
		int temp = 0;
		int fib = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter number for fibonacci series");
		int end = scanner.nextInt();
//		int end = 10;
		
		scanner.close();
		for (int j = 0; fib < end; j++) {
			System.out.println(fib);
			i = temp;
			temp = fib;
			fib = i +temp;
		}
	}
}