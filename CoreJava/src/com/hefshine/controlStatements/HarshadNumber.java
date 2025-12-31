package com.hefshine.controlStatements;

public class HarshadNumber {
	public static void main(String[] args) {
		System.out.println("********** Harshad Number *******");
		int num = 13;
		int temp = num;
		int re = 0;
		while(num>0) {
			int rem = num%10;
			re = re+rem;
			num/=10;
		}
		System.out.println(temp%re==0?"Harshad Number":"Not Harshad Number");
	}
}