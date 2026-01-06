package com.hefshine.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
	public static void main(String[] args) {
		char ch1[] = { 'a', 'b', 'c', 'd', 'e' };
		char ch2[] = { 'v', 'w', 'x', 'y', 'z', 'q' };

		System.out.println(Arrays.toString(IntStream.range(0, Math.max(ch1.length, ch2.length))
				.boxed()
				.map(i -> (i < ch1.length ? ch1[i] : "") + "" + (i < ch2.length ? ch2[i] : ""))
				.toArray(String[]::new)));
	}
}