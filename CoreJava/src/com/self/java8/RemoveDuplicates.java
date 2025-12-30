package com.self.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> uniqueStrings = strings.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique Strings: " + uniqueStrings);
    }
}