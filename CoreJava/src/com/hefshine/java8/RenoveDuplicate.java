package com.hefshine.java8;

import java.util.Arrays;

public class RenoveDuplicate {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,1,2,3};
		System.out.println(Arrays.toString(arr));
		int distinct[] = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(distinct));
	}

}
