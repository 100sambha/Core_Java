package com.hefshine.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMax {
	public static void main(String[] args) {
		int arr[] = {85,83,53,79,59,62,80};
		
		System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get());
	}

}
