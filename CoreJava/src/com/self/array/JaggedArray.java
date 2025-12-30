package com.self.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JaggedArray {
	public static void main(String[] args) {
//		also called as ragged array
		
		int a[] = new int[] {1,2,3};
		
		int b[] = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		int c[] = {100, 200};
		
//		int jaggedArray[][] = new int[][]{a,b,c};
		int jaggedArray[][] = {a,b,c};
//		
		System.out.println(Arrays.toString(jaggedArray));
		
//		System.out.println(Arrays.stream(jaggedArray).flatMap(i->Arrays.stream(i).boxed()).collect(Collectors.toList()));
		
		
		int []arr1 = {1,2,3,4,5,6,};
		int []arr2 = {147};
		int []arr3 = {7,8,9};
		int []arr4 = {10,11,12};
		int[][] res = {arr1,arr2,arr3,arr4};
		
		System.out.println(res.length);
//		System.out.println(Arrays.toString(res[1]));
	}

}
