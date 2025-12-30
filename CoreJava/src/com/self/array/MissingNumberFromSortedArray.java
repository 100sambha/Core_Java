package com.self.array;

public class MissingNumberFromSortedArray {
	public static int findMissing(int[] arr) {
		int n = arr.length + 1; // one number missing 
		int expectedSum = n * (n + 1) / 2;	//--------->>>>>4*5=20/2=10
		int actualSum = 0;
//		int actualSum = Arrays.stream(arr).sum();
		for (int num : arr)
			actualSum += num;
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4 };
		System.out.println("Missing number: " + findMissing(arr)); // 5
	}
}
