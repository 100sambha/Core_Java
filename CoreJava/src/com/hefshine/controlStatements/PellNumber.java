package com.hefshine.controlStatements;

public class PellNumber {
	public static void main(String[] args) {
		System.out.println("Pell Numbers");
		int num = 20;
		int temp = 1;
		int res = 0;
		for (int i = 0; i < num; i++) {
			int t = temp;
			temp = res;
			res = (temp*2)+t;
			System.out.println(res);
		}
	}
}