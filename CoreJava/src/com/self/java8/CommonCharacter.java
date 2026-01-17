package com.self.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonCharacter {
	public static void main(String[] args) {
		String str = "I am the best I can do it God always with me Today is my day I am the winner";
		str = str.toLowerCase();
		
		int nums[] = {55,7,9,4,2,6,6,6};
		System.out.println(Arrays.toString(Arrays.stream(nums).distinct().toArray()));
		
		List<Character> strs2 = str.chars().distinct().mapToObj(i->(char)i).collect(Collectors.toList());
		System.out.println(strs2);
		
		String[] arr1 = "hello".split("");
		String[] arr2 = "hi".split("");
		System.out.println(Arrays.toString(Arrays.stream(arr1).filter(i->Arrays.stream(arr2).anyMatch(j->i.equals(j))).distinct().toArray()));
		
		
		
	}
}