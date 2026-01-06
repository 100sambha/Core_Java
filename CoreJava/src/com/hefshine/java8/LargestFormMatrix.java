package com.hefshine.java8;

import java.util.Arrays;
import java.util.Comparator;

public class LargestFormMatrix {
	public static void main(String[] args) {
		int[][] arr = {
				{3,10,2},
				{6,4,5},
				{9,80,7}};
		
		System.out.println(Arrays.stream(arr).flatMap(i->Arrays.stream(i).boxed()).sorted(Comparator.reverseOrder()).limit(1).findFirst().get());
	}

}
