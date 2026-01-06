package com.hefshine.array;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int duplicateCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					duplicateCount++;
					break;
				}
			}
		}
		System.out.println("Duplicate Count : "+duplicateCount);
		int newArr[] = new int[arr.length-duplicateCount];
		int temp = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean status = false;
			temp = arr[i];
			for (int j = 0; j < newArr.length; j++) {
				if(newArr[j]==temp) {
					status = true;
				}
			}
			if(!status) {
				newArr[index++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}