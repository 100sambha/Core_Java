package com.self.array;

import java.util.Arrays;

public class ArrayToJaggedArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int chunckSize = 2;
		
		int[][] newArr = new int[arr.length/2][chunckSize];
		if((arr.length%2)!=0) {
			newArr = new int[(arr.length/2)+1][chunckSize];
			newArr[newArr.length-1] = new int[]{arr[arr.length-1]};
		}
		int len = arr.length/2;
		int j = 0;
		for (int i = 0; i < len; i++) {
			newArr[i][0] = arr[j];
			j++;
			newArr[i][1] = arr[j];
			j++;
		}

		for(int[] a : newArr) {
			System.out.println(Arrays.toString(a));
		}
	}
}