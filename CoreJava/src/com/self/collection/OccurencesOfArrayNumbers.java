package com.self.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurencesOfArrayNumbers {
	public static void main(String[] args) {
		int[] nums = {1,2,4,1,1};
		
		Map<Integer, Integer> occurencesOfNum = new HashMap<>();
		
		for(int i : nums) {
			if(!occurencesOfNum.containsKey(i)) {
				occurencesOfNum.put(i, 1);
			}
			else {
				int res = occurencesOfNum.get(i)+1;
				occurencesOfNum.put(i,res);
			}
		}
		System.out.println(occurencesOfNum);
		

//		Arrays.stream(nums).boxed().collect(Collectors.groupingBy((num)->num,Collectors.counting())).forEach((key,val)->System.out.println(key+" "+val));
	}
}