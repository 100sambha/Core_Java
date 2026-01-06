package com.hefshine.array;

import java.util.Arrays;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int arr[] = {78,42,23,74,35,61,17};
		System.out.println("Array : "+Arrays.toString(arr));
		int smallest = Integer.MAX_VALUE;
		int biggest = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>biggest) {
				biggest = arr[i];
			}
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Biggest - Smallest : "+biggest+" - "+smallest +" = "+(biggest-smallest));
	}
}