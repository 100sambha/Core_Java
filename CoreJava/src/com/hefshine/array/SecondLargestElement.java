package com.hefshine.array;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[] = {85,83,53,79,59,62,80};
		
		int max = Integer.MIN_VALUE;
		int secMax = max;
		for (int i = 0; i < arr.length-1; i++) {
				if((max<arr[i])) {
					secMax = max;
					max=arr[i];
				}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>secMax && arr[i]!=max) {
				secMax=arr[i];
			}
		}
		System.out.println(secMax);
		
	}

}
