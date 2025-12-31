package com.hefshine.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamReverseArray {
	public static void main(String[] args) {
		System.out.println("Reverse Array");
		int[] arr = {1,2,3,4,5,6};
		System.out.println("Given Array");
		System.out.println(Arrays.toString(arr));
//		int newArr[] = IntStream.range(0, arr.length).map(i->(Integer)arr[arr.length-1-i]).toArray();
		Integer newArr[] = IntStream.range(0, arr.length).mapToObj(i->arr[arr.length-i-1]).toArray(Integer[]::new);
//		List<Integer> newArr = IntStream.range(0, arr.length).mapToObj(i->(Integer)arr[arr.length-1-i]).collect(Collectors.toList());
		System.out.println("Reverse Array");
		System.out.println(Arrays.toString(newArr));
	}
}