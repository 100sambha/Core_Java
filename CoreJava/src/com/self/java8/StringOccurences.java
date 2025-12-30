package com.self.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurences {
	public static void main(String[] args) {
		String str = "Hello I am the best and I can do it";
		
		String[] strArr = str.split(" ");
		List<String> strList = Arrays.asList(strArr);
		
//		Arrays.stream(strArr).forEach(s->System.out.println(s));
		
		Map<String, Long> so1 = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<Integer, Long> so2 = Arrays.stream(strArr).collect(Collectors.groupingBy(String::length,Collectors.counting()));
		
		for(Map.Entry<String, Long> map : so1.entrySet()) {
			System.out.println(map.getKey()+" = "+map.getValue());
		}
		
//		System.out.println(strList);
	}
}