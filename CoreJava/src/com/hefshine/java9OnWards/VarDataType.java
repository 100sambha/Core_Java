package com.hefshine.java9OnWards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class VarDataType {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sambhaji", "Test", "Ram");
		var v = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(v);
		
		var v1 = "Version1";
		System.out.println(v1);
		
		var v2 = new HashSet<>();
		v2.add(v1);
		
		var v3 = new HashMap<String, Long>();
		v3.put("1", 100L);
		
	}
}