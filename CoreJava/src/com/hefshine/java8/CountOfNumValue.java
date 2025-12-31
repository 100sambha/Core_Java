package com.hefshine.java8;

import java.util.stream.IntStream;

public class CountOfNumValue {
	public static void main(String[] args) {
		System.out.println("Count Of Num Value");
		int num = 2500;
		long c = IntStream.iterate(num, n->n>0, n->n/10).count();
		System.out.println(c);
		
	}

}
