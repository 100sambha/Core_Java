package com.hefshine.java8;

import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 10;
//		int num = 11;
		String s = IntStream.range(2, num).filter(i->num%i==0).findFirst().isEmpty()?"Prime":"Not Prime";
		System.out.println(s);
	}

}
