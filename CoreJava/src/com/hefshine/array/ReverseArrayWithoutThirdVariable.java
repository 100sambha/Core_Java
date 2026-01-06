package com.hefshine.array;

import java.util.Arrays;

public class ReverseArrayWithoutThirdVariable {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length/2; i++) {
			arr[i] = arr[i] + arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1-i];
			arr[i] = arr[i] - arr[arr.length - 1 - i];
		}
		System.out.println(Arrays.toString(arr));
	}
}
