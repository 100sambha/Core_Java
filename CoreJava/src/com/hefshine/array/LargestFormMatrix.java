package com.hefshine.array;

public class LargestFormMatrix {
	public static void main(String[] args) {
		int[][] arr = {
				{3,10,2},
				{6,4,5},
				{9,8,7}};
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
}