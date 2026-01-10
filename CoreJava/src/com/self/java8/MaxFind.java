package com.self.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxFind {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,50,2);
				
		int max = nums.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max);
		
		max = nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().get();
		System.out.println(max);
	}
}
