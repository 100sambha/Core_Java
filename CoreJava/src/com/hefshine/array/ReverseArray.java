package com.hefshine.array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		for (int i = 0; i < arr.length/2; i++) {
			temp=arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
