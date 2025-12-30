package com.self.array;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] nums = {1,20,5,6,8,9};
		
		System.out.println("Using Loop");
		int max= 0;
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		
		int secMax  = 0;
		for (int i = 0; i < nums.length; i++) {
			if(secMax<nums[i] && max!=nums[i]) {
				secMax = nums[i];
			}
		}
		System.out.println(secMax);
		
		
		System.out.println("Using Java 8");
		Integer secMax2 = Arrays.stream(nums).boxed().sorted((a, b) -> Integer.compare(b, a)).limit(2).skip(1).findFirst().orElse(null);
		System.out.println(secMax2);
		
		System.out.println("Using Sort method");
		Arrays.sort(nums);
		System.out.println(nums[nums.length-2]);
	}
}