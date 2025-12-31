package com.hefshine.controlStatements;

public class PimeNumber {
	public static void main(String[] args) {
//		int num = 7;
		int num = 8;
		
		boolean status = true; 
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				status = false;
				break;
			}
		}
		
		if(status) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Pime");
		}
	}

}
