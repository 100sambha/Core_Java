package com.hefshine.array;

import java.util.Arrays;

public class OddEven {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				size++;
			}
		}
		int[] even = new int[size];
		int[] odd = new int[arr.length-size];
		int oIndex = 0, eIndex = 0;
		for (int i = 0; i < odd.length; i++) {
			if(arr[i]%2==0) {
				even[eIndex++]= arr[i];
			}
			else {
				odd[oIndex++] = arr[i];
			}
		}
		System.out.println("Even: "+Arrays.toString(even));
		System.out.println("Odd: "+Arrays.toString(odd));
	}
}
