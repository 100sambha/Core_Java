package com.hefshine.array;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 6, 7, 8, 9, 12, 45, 78, 96, 110 };
		
		int searchElement = 78;
		int start = 0;
		int end = arr.length-1;
		boolean status = false;
		
		while(start<=end) {
			int mid = (start + end) / 2;
			if(arr[mid]==searchElement) {
				System.out.println("Found at index :"+mid);
				status = true;
				break;
			}
			
			if(searchElement<arr[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		if(!status)
			System.out.println("No Found");
	}
}
