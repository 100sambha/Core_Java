package com.hefshine.java8;

import java.util.Arrays;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int arr[] = {78,42,23,74,35,61,17};
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max - Min : "+max+" - "+min+" :"+(max-min));
		
	}

}
