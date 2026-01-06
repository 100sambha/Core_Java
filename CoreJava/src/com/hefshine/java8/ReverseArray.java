package com.hefshine.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		int revArr[] = IntStream.range(0, arr.length).map(i->arr[arr.length-i-1]).toArray();
		System.out.println(Arrays.toString(revArr));
	}
}
