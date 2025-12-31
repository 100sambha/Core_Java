package com.hefshine.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Odd Even");
		int start = 10;
		int end = 30;

//		var m = IntStream.rangeClosed(start, end).mapToObj(i->i).collect(Collectors.partitioningBy(i -> (i % 2 == 0)));
		var m = IntStream.rangeClosed(start, end).boxed().collect(Collectors.partitioningBy(i -> (i % 2 == 0)));

		System.out.println("Even");
		System.out.println(m.get(true));
		System.out.println("Odd");
		System.out.println(m.get(false));

	}
}
