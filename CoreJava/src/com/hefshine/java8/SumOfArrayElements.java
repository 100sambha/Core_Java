package com.hefshine.java8;

import java.util.Arrays;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] arr = {1,2,5,8,3,2,9};
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);		
	}
}
