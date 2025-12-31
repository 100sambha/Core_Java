package com.hefshine.controlStatements;

public class NumberOfDigitInNumber {
	public static void main(String[] args) {
		int num = 100450;
		
//		System.out.println(String.valueOf(num).length());
		
		int count = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println("Number Of Digit In Number Is "+count);
	}
}