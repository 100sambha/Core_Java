package com.self.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFinder {
	public static void main(String[] args) {
		int a[] = {1,5,9,8,7,4,5,1,4};
		
		
//		Using BruteForce
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
		
		
		System.out.println();
		
		
//		Using sort array
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==a[i+1]) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println();
//		Using Set
		Set<Integer> set = new HashSet<>();
		for(int num : a) {
			if(!set.add(num)) {
				System.out.print(num+" ");
			}
		}
		
		System.out.println();
//		Using Java 8
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = Arrays.stream(a)
				.filter(i-> !unique.add(i))
				.boxed()
				.collect(Collectors.toSet());
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(unique);
		System.out.println(duplicates);
		
		
		
	}
}