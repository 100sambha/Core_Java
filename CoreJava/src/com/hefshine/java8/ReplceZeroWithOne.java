package com.hefshine.java8;

import java.util.Arrays;

public class ReplceZeroWithOne {
	public static void main(String[] args) {
		int arr[] = {1,0,1,0,1,0,0,0,0,1};
		System.out.println(Arrays.toString(arr));
		int[] newArr = Arrays.stream(arr).map(i->i==0?1:i).toArray();
		System.out.println(Arrays.toString(newArr));
	}
}
