package com.hefshine.java8;

import java.util.stream.IntStream;

public class NumberEndedWith7 {
	public static void main(String[] args) {
		System.out.println("Number Ended With 7");
		IntStream.range(100, 200).filter(i->i%10==7).forEach(System.out::println);
	}
}