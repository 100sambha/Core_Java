package com.hefshine.Java9OnWards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VarDataType {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sambhaji", "Test", "Ram");
		var v = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(v);
	}
}
