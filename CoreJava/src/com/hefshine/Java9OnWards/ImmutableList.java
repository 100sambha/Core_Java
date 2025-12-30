package com.hefshine.Java9OnWards;

import java.util.List;

public class ImmutableList {
	public static void main(String[] args) {
		List<String> colors = List.of("red", "green", "blue");
		colors.add("est");
		System.out.println(colors);
	}
}