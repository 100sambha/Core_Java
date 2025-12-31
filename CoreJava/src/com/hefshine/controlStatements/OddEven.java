package com.hefshine.controlStatements;

public class OddEven {
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
			} else {
				System.out.println("Odd "+i);				
			}
		}
	}
}
