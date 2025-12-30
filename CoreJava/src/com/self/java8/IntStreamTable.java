package com.self.java8;

import java.util.stream.IntStream;

public class IntStreamTable {
	public static void main(String[] args) {
//
//		IntStream.range(1, 11).forEach(i->System.out.println((i)));
//		
//		
////		Scanner sc = new Scanner(System.in);
////		int num = sc.nextInt();
//		int num = 10;
//		IntStream.range(1, 11).forEach(i->System.out.println((i*num)));
		

		IntStream i1 = IntStream.range(0, 5);
		IntStream i2 = IntStream.range(5, 11);
		IntStream.concat(i1, i2).forEach(i->System.out.println(i));

		
		
	}
}