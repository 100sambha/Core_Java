package com.hefshine.array;

import java.util.Arrays;

public class SumAverage {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6};
		
		int sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().getAsDouble();
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum : "+sum +"\nAvg : "+avg);
		
	}
}
