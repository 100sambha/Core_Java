package com.hefshine.controlStatements;

public class KaprekarNumber {
	public static void main(String[] args) {
		System.out.println("Kaprekar Number : 45 square 2025 :: 20+25=45");
		System.out.println("Kaprekar Number : 4879 square 23804641 :: 238+4641=4879");	//not working code for this. For Homework
//		int num = 4879;
//		int num = 171;
		int num = 45;
		int sq = num * num;
		String sqString = String.valueOf(sq);
		int len = sqString.length();
		String l = "";
		String r = "";
		System.out.println(sqString);
		l = sqString.substring(0,len/2);
		r = sqString.substring(len/2, len);
		System.out.println(l + " " + r);
		int re = Integer.parseInt(l) + Integer.parseInt(r);
		System.out.println(num + " " + re);
		if (re == num) {
			System.out.println("Kaprekar");
		} else {
			System.out.println("Not Kaprekar");
		}

	}
}
