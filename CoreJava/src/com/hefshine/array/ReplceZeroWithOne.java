package com.hefshine.array;

import java.util.Arrays;

public class ReplceZeroWithOne {
	public static void main(String[] args) {
		int arr[] = {1,0,1,0,1,0,0,0,0,1};
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				arr[i] = 1;
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
}