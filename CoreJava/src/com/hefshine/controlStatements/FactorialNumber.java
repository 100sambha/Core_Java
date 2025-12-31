package com.hefshine.controlStatements;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println("Factorial Number");
		int num = 3;
		int  fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial Of "+num+" is "+fact);
	}
}