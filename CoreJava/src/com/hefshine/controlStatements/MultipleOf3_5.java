package com.hefshine.controlStatements;

public class MultipleOf3_5 {
	public static void main(String[] args) {
		int start = 33;
		int end = 999;
		
		for (int i = start; i < end; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Yellow&PINK");
			}
			else if(i%3==0) {
				System.out.println("Yellow");
			}
			else if(i%5==0) {
				System.out.println("Pink");
			}
		}
	}
}
