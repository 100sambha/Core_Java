package com.hefshine.controlStatements;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 121;
		int res = 0;
		int temp = num;
		int rem = 1;
		
		while(temp>0) {
			rem = temp%10;
			res = (res*10)+rem;
			temp = temp/10;
		}
		
		if(res==num) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Pallindrome");
		}
	}
}
